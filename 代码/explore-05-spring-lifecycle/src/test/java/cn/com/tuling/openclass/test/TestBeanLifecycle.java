package cn.com.tuling.openclass.test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.com.tuling.openclass.beans.Cat;
import cn.com.tuling.openclass.config.ConfigAnnoInit;
import cn.com.tuling.openclass.config.ConfigBeanAnno;
import cn.com.tuling.openclass.config.ConfigBeanPostProcessor;
import cn.com.tuling.openclass.config.ConfigInitializingAndDisposable;
import cn.com.tuling.openclass.config.ConfigProfile;

public class TestBeanLifecycle {
	@Test
    public void testProfile(){
    	//AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigProfile.class);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles("02","03");
		ctx.register(ConfigProfile.class);
		ctx.refresh();
    	System.out.println("-----------------------inited..................");
    	printBeans(ctx, Cat.class);
    	ctx.close();
    }
	
	private void printBeans(ApplicationContext ctx, Class clsType){
		Map beansOfType = ctx.getBeansOfType(clsType);
		Set<Entry<String,Object>> entrys = beansOfType.entrySet();
		for(Entry<String,Object> entry:entrys){
			System.out.println(entry.getKey() + "---" + entry.getValue());
		}
	}
	private void printNames(ApplicationContext ctx){
		String[] names = ctx.getBeanDefinitionNames();
		for(String name:names){
			System.out.println("  beanName:" + name);
		}
	}
	@Test
    public void testBeanPostProcessorInit(){
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigBeanPostProcessor.class);
    	System.out.println("-----------------------inited..................");
    	
    	ctx.close();
    }
	@Test
    public void testAnnoInit(){
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigAnnoInit.class);
    	System.out.println("-----------------------inited..................");
    	
    	ctx.close();
    }
	@Test
    public void testInitDisposable(){
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigInitializingAndDisposable.class);
    	System.out.println("-----------------------inited..................");
    	
    	ctx.close();
    }
	
	@Test
    public void testBeanAnnoLifecycle(){
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigBeanAnno.class);
    	System.out.println("-----------------------inited..................");
    	Object bean = ctx.getBean(Cat.class);
    	Object bean2 = ctx.getBean(Cat.class);
    	ctx.close();
    }
}
