package cn.com.tuling.dynaproxy.proxy;

import java.lang.reflect.Method;

import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.ProxyFactory;
import net.sf.cglib.proxy.MethodProxy;

public class JavassistDynaProxyFactory {
	public static Object createProxy(Object target, Object advice, String adviceMethodName) {
		Object result = null;
		
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setSuperclass(target.getClass());
		proxyFactory.setHandler(new JavassistMethodInteceptor(advice, adviceMethodName));
		
		try {
			result = proxyFactory.createClass().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return result;
	}

	static class JavassistMethodInteceptor implements MethodHandler {
		private Object advice;
		private String adviceMethodName;

		public JavassistMethodInteceptor(Object advice, String adviceMethodName) {
			this.advice = advice;
			this.adviceMethodName = adviceMethodName;
		}

		@Override
		 public Object invoke(Object self, Method thismethod, Method proceed, Object[] args) throws Throwable {
			Object result = null;

			Method adviceMethod = this.advice.getClass().getMethod(adviceMethodName, null);
			adviceMethod.invoke(this.advice, null);

			result = proceed.invoke(self, args);

			return result;
		}

	}
}
