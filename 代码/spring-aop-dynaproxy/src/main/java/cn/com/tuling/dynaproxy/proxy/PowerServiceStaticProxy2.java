package cn.com.tuling.dynaproxy.proxy;

import java.lang.reflect.Method;

import cn.com.tuling.dynaproxy.service.impl.PowerServiceVersion2Impl;

public class PowerServiceStaticProxy2 extends PowerServiceVersion2Impl {
	private Object advice;
	private String adviceMethodName;

	private PowerServiceStaticProxy2(Object advice, String adviceMethodName) {
		this.advice = advice;
		this.adviceMethodName = adviceMethodName;
	}

	public static PowerServiceVersion2Impl createProxy(Object advice, String adviceMethodName) {
		return new PowerServiceStaticProxy2(advice, adviceMethodName);
	}

	@Override
	public boolean login(String userName, String password) {
		try {
			Method adviceMethod = this.advice.getClass().getMethod(adviceMethodName, null);
			adviceMethod.invoke(this.advice, null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return super.login(userName, password);
	}

}
