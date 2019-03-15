package cn.com.tuling.openclass.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import cn.com.tuling.openclass.beans.Cat;
import cn.com.tuling.openclass.beans.Dog;

@Configuration
@ComponentScan(value = { "cn.com.tuling.openclass" },
               useDefaultFilters=false,
               includeFilters={
            		   @Filter(type=FilterType.ASSIGNABLE_TYPE,classes={Dog.class})
               })
public class ConfigScope {
	@Bean("myCat")
	public Cat cat() {
		System.out.println("create cat instance,name is myCat");
		return new Cat();
	}
}
