package cn.com.tuling.openclass.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.com.tuling.openclass.beans.Monkey;

@Configuration
public class ConfigAnnoInit {
	@Bean(initMethod="myInit")
	public Monkey monkey(){
		return new Monkey();
	}
}
