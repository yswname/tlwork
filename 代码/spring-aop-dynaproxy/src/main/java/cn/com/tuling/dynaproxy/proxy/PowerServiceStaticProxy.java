package cn.com.tuling.dynaproxy.proxy;

import java.lang.reflect.Method;

import cn.com.tuling.dynaproxy.service.IPowerService;

public class PowerServiceStaticProxy implements IPowerService {
	private IPowerService target;
	private Object advice;
	private String adviceName;

	private PowerServiceStaticProxy(IPowerService target, Object advice, String methodName) {
		this.target = target;
		this.advice = advice;
		this.adviceName = methodName;
	}

	public static IPowerService createProxy(IPowerService target, Object advice, String methodName) {
		return new PowerServiceStaticProxy(target, advice, methodName);
	}

	@Override
	public boolean login(String userName, String password) {
		boolean bool = false;
		try {
			Method adviceMethod = this.advice.getClass().getMethod(adviceName, null);
			adviceMethod.invoke(this.advice, null);
			
			bool = this.target.login(userName, password);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return bool;
	}

}
