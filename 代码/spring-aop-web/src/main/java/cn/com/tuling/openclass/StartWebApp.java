package cn.com.tuling.openclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Spring AOP即插即用启动类
 * 
 * @author 清风
 * @version 1.0
 * */
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class StartWebApp {
	
	public static void main(String[] args) {
		SpringApplication.run(StartWebApp.class, args);
	}
}
