package cn.com.tuling.openclass.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BaseHolder implements ApplicationContextAware {
    private static ApplicationContext appContext;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		BaseHolder.appContext = applicationContext;
	}

	public static ApplicationContext getApplicationContext() {
		return BaseHolder.appContext;
	}
	
	public static <T>T getBean(String beanName){
		return (T)appContext.getBean(beanName);
	}
	
	public static <T>T getBean(Class<T> cls){
		return (T)appContext.getBean(cls);
	}
	
	public static String[] getBeanNames() {
		return appContext.getBeanDefinitionNames();
	}
}
