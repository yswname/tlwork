package cn.com.tuling.openclass.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.com.tuling.openclass.beans.Dog;

@Configuration
public class ConfigInitializingAndDisposable {
	@Bean(initMethod="myInit", destroyMethod="myDestory")
	public Dog dog(){
		return new Dog();
	}
}
