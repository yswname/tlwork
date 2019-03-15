package cn.com.tuling.openclass.plugin;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.aopalliance.aop.Advice;
import org.aspectj.util.FileUtil;

import cn.com.tuling.openclass.pojo.PluginInfo;
import net.sf.json.JSONObject;

import sun.misc.ClassLoaderUtil;

public class JsonPluginFactory extends PluginFactory {
	private static PluginFactory factory = null;
	private static String configFile;
	private Map<String, PluginInfo> pluginsMap = new HashMap<String, PluginInfo>();
	private Map<String, Advice> adviceMap = new HashMap<String, Advice>();
	private List<URL> loadedUrls = new ArrayList<URL>();
	private Map<String, URLClassLoader> clsLoaders = new HashMap<String, URLClassLoader>();

	private JsonPluginFactory() {
		resetPlugins();
	}

	public static PluginFactory createPluginFactory(String configFile) {
		JsonPluginFactory.configFile = configFile;
		if (factory == null) {
			factory = new JsonPluginFactory();
		}
		return factory;
	}

	@Override
	public PluginInfo getPluginInfo(String plgName) {
		PluginInfo plugin = null;
		if (pluginsMap != null) {
			plugin = pluginsMap.get(plgName);
		}
		return plugin;
	}

	@Override
	public Advice[] createAllPlugins() {
		Advice[] advices = null;
		if (adviceMap != null) {
			Collection<Advice> adviceColl = adviceMap.values();
			if (adviceColl.size() > 0) {
				advices = new Advice[adviceColl.size()];
				advices = adviceColl.toArray(advices);
			}
		}
		return advices;
	}

	@Override
	public PluginInfo[] getPluginInfos() {
		PluginInfo[] plugins = null;
		if (pluginsMap != null) {
			Collection<PluginInfo> pluginsColl = pluginsMap.values();
			if (pluginsColl.size() > 0) {
				plugins = new PluginInfo[pluginsColl.size()];
				plugins = pluginsColl.toArray(plugins);
			}
		}
		return plugins;
	}

	@Override
	public Advice createPlugin(String plgName) {
		Advice advice = null;
		if (this.adviceMap != null) {
			advice = this.adviceMap.get(plgName);
			if (advice == null) {
				this.resetPlugins();
				advice = this.adviceMap.get(plgName);
			}
		}
		return advice;
	}

	@Override
	public void resetPlugins() {
		this.pluginsMap.clear();
		this.adviceMap.clear();
		try {
			// 清除以前的类加载器
			Collection<URLClassLoader> clsLoaders = this.clsLoaders.values();
			if (clsLoaders != null) {
				for (URLClassLoader clsLoader : clsLoaders) {
					// 清除以前类加载器加载的类
					ClassLoaderUtil.releaseLoader(clsLoader);
				}
			}
			// 清除加载记录
			this.clsLoaders.clear();
			String jsonConfig = FileUtil.readAsString(new File(configFile));
			// System.out.println(jsonConfig);
			JSONObject jsonObject = JSONObject.fromObject(jsonConfig);
			PluginCollection pluginCollection = (PluginCollection) JSONObject.toBean(jsonObject,
					PluginCollection.class);
			PluginInfo[] plugins = pluginCollection.getPlugins();
			if (plugins != null && plugins.length > 0) {
				for (PluginInfo plugin : plugins) {
					if (plugin != null && plugin.getName() != null && !"".equals(plugin.getName().trim())) {
						this.pluginsMap.put(plugin.getName(), plugin);
						this.adviceMap.put(plugin.getName(), buildAdvice(plugin));
					}
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private Advice buildAdvice(PluginInfo plgInfo) {
		Advice advice = null;

		try {
			File jarFile = new File(plgInfo.getJarName());
			URL url = jarFile.toURI().toURL();
			URLClassLoader clsLoader = this.clsLoaders.get(url.toString());
			if (clsLoader == null) {
				clsLoader = new URLClassLoader(new URL[] { url }, Thread.currentThread().getContextClassLoader());
				this.clsLoaders.put(url.toString(), clsLoader);

			}
			// 类加载器加载指定类
			Class cls = clsLoader.loadClass(plgInfo.getClsName());
			advice = (Advice) cls.newInstance();
		} catch (

		Exception e) {
			e.printStackTrace();
		}

		return advice;
	}

}
