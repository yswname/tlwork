package cn.com.tuling.openclass.plugin;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

import cn.com.tuling.openclass.pojo.Account;

public class DemoPlugin2 implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("这是简单Demo22222，当前逻辑进入了DemoPlugin... ...");
	}

}
