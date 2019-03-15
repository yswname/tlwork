package cn.com.tuling.openclass.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Scope(scopeName=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Dog {

	public Dog() {
		super();
		System.out.println("创建Dog对象......");
	}

}
