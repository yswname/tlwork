package cn.com.tuling.openclass.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AspectPointConfig {
	@Pointcut("execution(* cn.com.tuling.openclass.service.**.*(..))")
    public void executeService() {}
	
	@Before(value="executeService()")
	public void init() {
	}
}
