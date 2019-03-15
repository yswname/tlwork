package cn.com.tuling.dynaproxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynaProxyFactory {
    public static Object getProxy(Object target, Object advice, String adviceName) {
    	Object proxyObj = null;
    	JDKInvocationHandler handler = new JDKInvocationHandler(target, advice, adviceName);
    	proxyObj = Proxy.newProxyInstance(JdkDynaProxyFactory.class.getClassLoader(), target.getClass().getInterfaces(), handler);
    	return proxyObj;
    }
    
    static class JDKInvocationHandler implements InvocationHandler{
    	private Object target;
    	private Object advice;
    	private String adviceName;
    	public JDKInvocationHandler(Object target, Object advice, String adviceName) {
    		this.target = target;
    		this.advice = advice;
    		this.adviceName = adviceName;
		}
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			Method adviceMethod = advice.getClass().getDeclaredMethod(adviceName, null);
			adviceMethod.invoke(advice, null);
			return method.invoke(target, args);
		}
    }
}
