package cn.com.tuling.openclass.config.factorybean;

import org.springframework.beans.factory.FactoryBean;

import cn.com.tuling.openclass.beans.Cat;

public class CatFactoryBean implements FactoryBean{

	public CatFactoryBean(){
		System.out.println("create CatFactoryBean");
	}
	@Override
	public Object getObject() throws Exception {
		return new Cat();
	}

	@Override
	public Class getObjectType() {
		return Cat.class;
	}

}
