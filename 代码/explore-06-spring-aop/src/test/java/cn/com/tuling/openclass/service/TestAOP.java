package cn.com.tuling.openclass.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.com.tuling.openclass.config.ConfigAOP;

public class TestAOP {
	@Test
    public void test01(){
		// 容器
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigAOP.class);
    	IPowerService powerService = (IPowerService)ctx.getBean(IPowerService.class);
    	boolean bool = powerService.login("zhangsan", "123");
    	System.out.println(bool);
        ctx.close();
	}
}
