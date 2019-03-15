package cn.com.demo.test;

import cn.com.tuling.openclass.plugin.PluginFactory;
import cn.com.tuling.openclass.plugin.PluginFactoryBuilder;
import cn.com.tuling.openclass.pojo.PluginInfo;

public class TestPluginFactory {

	public static void main(String[] args) {
		PluginFactoryBuilder builder = new PluginFactoryBuilder();
		PluginFactory factory = builder.buildPluginFactory("e:/temp/pluginconfig.conf");
		PluginInfo[] plugins = factory.getPluginInfos();
		for(PluginInfo plugin:plugins) {
			System.out.println(plugin.getClsName()+"," + plugin.getName());
		}
	}

}
