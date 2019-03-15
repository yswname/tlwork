package cn.com.tuling.openclass.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;

public class Monkey implements InitializingBean{
    public Monkey(){
    	System.out.println("ceate Monkey ");
    }
    
    public void myInit(){
    	System.out.println("bean init");
    }
    
    public void myDestory(){
    	System.out.println("bean destory");
    }
    @PostConstruct
    public void annoInit(){
    	System.out.println("annotation init");
    }
    @PreDestroy
    public void annoDestory(){
    	System.out.println("annotation destory");
    }

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initalizing init");
	}
}
