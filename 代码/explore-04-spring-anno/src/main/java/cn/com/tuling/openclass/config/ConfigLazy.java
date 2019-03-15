package cn.com.tuling.openclass.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import cn.com.tuling.openclass.beans.Cat;
import cn.com.tuling.openclass.beans.Tiger;

@Configuration
@ComponentScan(value = { "cn.com.tuling.openclass" },
               useDefaultFilters=false,
               includeFilters={
            		   @Filter(type=FilterType.ASSIGNABLE_TYPE,classes={Tiger.class})
               })
public class ConfigLazy {
	@Bean("myCat")
	public Cat cat() {
		System.out.println("create cat instance,name is myCat");
		return new Cat();
	}
}
