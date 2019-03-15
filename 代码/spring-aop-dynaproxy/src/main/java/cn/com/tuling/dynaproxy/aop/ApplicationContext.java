package cn.com.tuling.dynaproxy.aop;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.aspectj.util.FileUtil;

import cn.com.tuling.dynaproxy.proxy.JavassistDynaProxyFactory;
import cn.com.tuling.dynaproxy.proxy.JdkDynaProxyFactory;
import net.sf.json.JSONObject;

public class ApplicationContext {
	private Map<String, Object> beansMap = new HashMap<String, Object>();
	private String jsonFile;

	public ApplicationContext(String jsonFile) {
		this.jsonFile = jsonFile;
		init();
	}

	public Object getBean(String name) {
		Object bean = beansMap.get(name);
		return bean;
	}

	private void init() {
		BeanInfoCollection infoColl = this.initBeanInfos();
		this.createBeanInstances(infoColl);
		this.createAopProxy(infoColl);
	}

	private BeanInfoCollection initBeanInfos() {
		BeanInfoCollection infoColl = null;

		try {
			URL url = ApplicationContext.class.getClassLoader().getResource(this.jsonFile);
			String jsonFileContent = FileUtil.readAsString(new File(url.getFile()));
			JSONObject jsonObject = JSONObject.fromObject(jsonFileContent);
			infoColl = (BeanInfoCollection) JSONObject.toBean(jsonObject, BeanInfoCollection.class);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return infoColl;
	}

	private void createBeanInstances(BeanInfoCollection infoColl) {
		if (infoColl != null) {
			BeanInfo[] beanInfoList = infoColl.getBeanInfoList();
			if (beanInfoList != null) {
				for (BeanInfo beanInfo : beanInfoList) {
					String beanName = beanInfo.getName();
					if (beanName != null && !beanName.equals("")) {
						String clsName = beanInfo.getClsName();
						try {
							Class cls = Class.forName(clsName);
							Object instance = cls.newInstance();
							this.beansMap.put(beanName, instance);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}

	private void createAopProxy(BeanInfoCollection infoColl) {
		if(infoColl != null) {
			BeanInfo[] beanInfoList = infoColl.getBeanInfoList();
			if(beanInfoList != null) {
				for(BeanInfo beanInfo:beanInfoList) {
					String beanName = beanInfo.getName();
					String adviceName = beanInfo.getAdviceName();
					String adviceMethod = beanInfo.getAdviceMethod();
					Object advice = this.beansMap.get(adviceName);
					Object bean = this.beansMap.get(beanName);
					if(advice != null && bean != null) {
						Class[] inters = bean.getClass().getInterfaces();
						Object proxyObj = null;
						if(inters != null && inters.length>0) {
							proxyObj = JdkDynaProxyFactory.getProxy(bean, advice, adviceMethod);
						}else {
							proxyObj = JavassistDynaProxyFactory.createProxy(bean, advice, adviceMethod);
						}
						if(proxyObj != null) {
							this.beansMap.put(beanName, proxyObj);
						}
					}
				}
			}
		}
	}

}
