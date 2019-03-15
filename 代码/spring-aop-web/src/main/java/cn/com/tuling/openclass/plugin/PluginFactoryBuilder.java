package cn.com.tuling.openclass.plugin;

public class PluginFactoryBuilder {
    public static PluginFactory buildPluginFactory(String config) {
		PluginFactory factory= null;
		factory = JsonPluginFactory.createPluginFactory(config);
		return factory;
	}
}
