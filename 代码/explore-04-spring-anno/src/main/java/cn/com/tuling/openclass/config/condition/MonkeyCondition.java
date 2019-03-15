package cn.com.tuling.openclass.config.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MonkeyCondition implements Condition {

	@Override
	/**
	 * context 当前上下文（环境）
	 * metadata 注解元对象，获取当前对象的所有注解信息
	 * */
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		boolean bool = false;
		// 获取容器工厂
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		// 获取类加载器
		ClassLoader classLoader = context.getClassLoader();
		// 获取环境对象
		Environment environment = context.getEnvironment();
		// 获取bean定义注册器
		BeanDefinitionRegistry registry = context.getRegistry();
		// 获取资源加载器
		ResourceLoader resourceLoader = context.getResourceLoader();
		// 测试环境才注入（通过配置文件描述test|dev|prod）
		String currEvn = environment.getProperty("curr.env");
		bool = currEvn != null && "test".equals(currEvn);
		
		return bool;
	}

}
