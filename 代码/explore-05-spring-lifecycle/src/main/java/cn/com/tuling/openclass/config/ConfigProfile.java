package cn.com.tuling.openclass.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import cn.com.tuling.openclass.beans.Cat;

@Configuration
public class ConfigProfile {
	
	@Profile("default")
	@Bean("cat00")
	public Cat catEvn00(){
		Cat cat = new Cat();
		cat.setName("Cat00");
		return cat;
	}
	
	@Profile("01")
	@Bean("cat01")
	public Cat catEvn01(){
		Cat cat = new Cat();
		cat.setName("Cat01");
		return cat;
	}
	
	@Profile("02")
	@Bean("cat02")
	public Cat catEvn02(){
		Cat cat = new Cat();
		cat.setName("Cat02");
		return cat;
	}
	
	@Profile("03")
	@Bean("cat03")
	public Cat catEvn03(){
		Cat cat = new Cat();
		cat.setName("Cat03");
		return cat;
	}
}
