package cn.com.tuling.openclass.beans;

import org.springframework.context.annotation.Conditional;

import cn.com.tuling.openclass.config.condition.MonkeyCondition;

@Conditional(value={MonkeyCondition.class})
public class Monkey {

	public Monkey() {
		super();
		System.out.println("创建Monkey对象.........");
	}

}
