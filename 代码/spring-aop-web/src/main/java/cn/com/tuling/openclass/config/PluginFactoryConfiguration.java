package cn.com.tuling.openclass.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.com.tuling.openclass.plugin.PluginFactory;
import cn.com.tuling.openclass.plugin.PluginFactoryBuilder;

@Configuration
public class PluginFactoryConfiguration {
	@Value("${system.config.pluginFile}")
	private String pluginConfigName;
	
	@Bean
    public PluginFactory createPluginFactory() {
    	PluginFactoryBuilder builder = new PluginFactoryBuilder();
    	return builder.buildPluginFactory(pluginConfigName);
    }
}
