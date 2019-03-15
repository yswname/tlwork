package cn.com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.com.tuling.explore.ExploreConfiguration;

public class Test01 {
	@Test
    public void test01() {
    	ApplicationContext context = new AnnotationConfigApplicationContext(ExploreConfiguration.class);
    }
}
