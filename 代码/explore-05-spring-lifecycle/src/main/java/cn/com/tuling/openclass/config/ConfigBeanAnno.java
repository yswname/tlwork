package cn.com.tuling.openclass.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import cn.com.tuling.openclass.beans.Cat;

@Configuration
public class ConfigBeanAnno {
	//@Lazy
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	@Bean(initMethod="init", destroyMethod="destory")
    public Cat cat(){
    	return new Cat();
    }
}
