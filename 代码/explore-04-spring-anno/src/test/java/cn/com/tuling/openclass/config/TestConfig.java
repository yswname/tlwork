package cn.com.tuling.openclass.config;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.com.tuling.openclass.beans.Cat;
import cn.com.tuling.openclass.beans.Dog;

public class TestConfig {
	@Test
	public void testFactoryBean(){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigFactoryBean.class);
        System.out.println("-------------inited context!");
        this.printNames(ctx);
        System.out.println("*********************");
        Object bean = ctx.getBean("catFactoryBean");
        System.out.println(bean);
        
        Object bean2 = ctx.getBean("&catFactoryBean");
        System.out.println(bean2);
		ctx.close();
	}
	@Test
	public void testImport(){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigImport.class);
        System.out.println("-------------inited context!");
        this.printNames(ctx);
		ctx.close();
	}
	@Test
	public void testConditional(){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigConditional.class);
        System.out.println("-------------inited context!");
        this.printNames(ctx);
		ctx.close();
	}
	@Test
	public void testScope(){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigScope.class);
        System.out.println("-------------inited context!");
        Dog dog1 = ctx.getBean(Dog.class);
        Dog dog2 = ctx.getBean(Dog.class);
        
        System.out.println(dog1 == dog2);
		
		ctx.close();
	}
	@Test
	public void testLazy(){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigLazy.class);
		System.out.println("---------inited container-------------");
		this.printNames(ctx);
		ctx.close();
	}
	@Test
	public void testComponentScan(){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigConfiguration.class);
		this.printNames(ctx);
		ctx.close();
	}
	@Test
    public void testConfiguration(){
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigConfiguration.class);
//    	String[] names = ctx.getBeanDefinitionNames();
//    	for(String name:names){
//    		System.out.println(name);
//    	}
    	Cat cat = ctx.getBean(Cat.class);
    	ctx.close();
    }
	
	private void printNames(ApplicationContext ctx){
		String[] names = ctx.getBeanDefinitionNames();
		System.out.println("-----------bean names:-------------");
		for(String name:names){
			System.out.println("   " + name);
		}
	}
}
