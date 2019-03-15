package cn.com.demo.test;

import java.io.File;

import org.aspectj.util.FileUtil;

import cn.com.tuling.openclass.plugin.PluginCollection;
import cn.com.tuling.openclass.pojo.PluginInfo;
import net.sf.json.JSONObject;

public class TestJson {

	public static void main(String[] args) {
		PluginCollection collection = new PluginCollection();
		for(int i=0;i<10;i++) {
			PluginInfo plugin = new PluginInfo();
			plugin.setActived(false);
			plugin.setClsName("clssName"+i);
			plugin.setJarName("jar"+i);
			plugin.setName("name"+i);
			collection.addPlugin(plugin);
		}
		
		JSONObject jsonObject = JSONObject.fromObject(collection);
		FileUtil.writeAsString(new File("e:/temp/pluginconfig.conf"), jsonObject.toString());
	}

}
