package cn.com.tuling.dynaproxy.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CGLIBDynaProxyFactory {

	public static Object getProxy(Object target, Object advice, String methodName) {
		Object proxy = null;
		
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(new CGLIBMethodInterceptor(advice, methodName));
		proxy = enhancer.create();
		
		return proxy;
	}
	
	static class CGLIBMethodInterceptor implements MethodInterceptor{
		private Object advice;
		private String adviceMethodName;
		public CGLIBMethodInterceptor(Object advice, String adviceMethodName) {
			this.advice = advice;
			this.adviceMethodName = adviceMethodName;
		}
		@Override
		/**
	     * @param obj "this", the enhanced object
	     * @param method intercepted Method
	     * @param args argument array; primitive types are wrapped
	     * @param proxy used to invoke super (non-intercepted method); may be called
	     * as many times as needed
	     * @throws Throwable any exception may be thrown; if so, super method will not be invoked
	     * @return any value compatible with the signature of the proxied method. Method returning void will ignore this value.
	     */    
		public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
			Object result = null;
			
			Method adviceMethod = this.advice.getClass().getMethod(adviceMethodName, null);
			adviceMethod.invoke(this.advice, null);
			
			result = proxy.invokeSuper(obj, args);
			
			return result;
		}
		
	}
}
