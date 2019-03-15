package cn.com.tuling.dynaproxy.service;

import cn.com.tuling.dynaproxy.proxy.JdkDynaProxyFactory;
import cn.com.tuling.dynaproxy.service.impl.LogServiceImpl;
import cn.com.tuling.dynaproxy.service.impl.PowerServiceImpl;

public class PowerServiceFactory {
	public static IPowerService createPowerService() {
		// return new PowerServiceImpl();
		// return new PowerServiceVersion2Impl();
		Object advice = new LogServiceImpl();
		// return PowerServiceStaticProxy.createProxy(new PowerServiceImpl(),
		// advice, "log");
		// return PowerServiceStaticProxy2.createProxy(advice, "log");
		Object target = new PowerServiceImpl();
		String adviceMethodName = "log";
		 return (IPowerService)JdkDynaProxyFactory.getProxy(target, advice,
		 adviceMethodName);

//		return (IPowerService) CGLIBDynaProxyFactory.getProxy(target, advice, "log");
//		return (IPowerService) JavassistDynaProxyFactory.createProxy(target, advice, "log");
	}
}
