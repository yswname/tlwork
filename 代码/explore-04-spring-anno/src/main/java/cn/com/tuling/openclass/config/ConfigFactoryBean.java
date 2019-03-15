package cn.com.tuling.openclass.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.com.tuling.openclass.config.factorybean.CatFactoryBean;

@Configuration

public class ConfigFactoryBean {
    @Bean
    public CatFactoryBean catFactoryBean(){
    	return new CatFactoryBean();
    }
}
