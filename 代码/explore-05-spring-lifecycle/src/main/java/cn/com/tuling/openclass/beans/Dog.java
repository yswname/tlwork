package cn.com.tuling.openclass.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

public class Dog implements InitializingBean, DisposableBean {

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean destory");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean afterPropertiesSet");
	}
	
	public void myInit(){
		System.out.println("Dog myInit");
	}
	
	public void myDestory(){
		System.out.println("Dog myDestory");
	}

}
