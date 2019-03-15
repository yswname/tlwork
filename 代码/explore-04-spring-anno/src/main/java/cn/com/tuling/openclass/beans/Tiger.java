package cn.com.tuling.openclass.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

@Lazy(value=false)
public class Tiger {
	
	public Tiger() {
		super();
		System.out.println("创建Tiger对象.........");
	}

	@Lazy(value=true)
	@Bean
    public Dog dog(){
    	return new Dog();
    }
}
