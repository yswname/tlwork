package cn.com.tuling.openclass.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import cn.com.tuling.openclass.beans.Monkey;
import cn.com.tuling.openclass.processor.MyBeanPostProcessor;

@Configuration
@Import(value={MyBeanPostProcessor.class})
public class ConfigBeanPostProcessor {
	@Bean(initMethod="myInit")
	public Monkey monkey(){
		return new Monkey();
	}
}
