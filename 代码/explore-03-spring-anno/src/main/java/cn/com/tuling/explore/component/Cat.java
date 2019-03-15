package cn.com.tuling.explore.component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    public Cat() {
    	System.out.println("Cat construct.....");
    }
    
    @PostConstruct
    public void init() {
    	System.out.println("init cat ......");
    }
    
    @PreDestroy
    public void destory() {
    	System.out.println("destory cat ......");
    }
}
