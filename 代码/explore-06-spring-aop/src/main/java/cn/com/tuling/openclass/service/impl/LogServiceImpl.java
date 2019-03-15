package cn.com.tuling.openclass.service.impl;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogServiceImpl{
	@Pointcut("execution(* cn.com.tuling..*.*(..))")
	public void myPointCut(){}
	@Pointcut("execution(* cn.com.tuling..*.*(..)) && args(uName,psw)")
	public void myPointCutArgs(String uName,String psw){}

	@Before("myPointCut()")
	public void logBefore() {
		System.out.println("....logServiceImpl.logBefore....");
	}

	
//	@Before(value="myPointCutArgs(uName,psw)",argNames="psw,uName")
//	public void logBefore(String a,String b) {
//		System.out.println("....logServiceImpl.logBefore....（"+a+","+b+"）");
//	}
	
    @After("myPointCut()")
	public void logAfter() {
		System.out.println("....logServiceImpl.logAfter....");
	}
    
    @AfterReturning("myPointCut()")
	public void logReturnAfter() {
		System.out.println("....logServiceImpl.logReturnAfter....");
	}

    @AfterThrowing("myPointCut()")
	public void logThrowing() {
		System.out.println("....logServiceImpl.logThrowing....");
	}
//    //@Around("myPointCut()")
//	public Object logArrount(ProceedingJoinPoint pjp) {
//		Object result = null;
//		System.out.println("-------------begin------------");
//		try {
//			result = pjp.proceed();
//		} catch (Throwable e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("-------------end---------------");
//		return result;
//	}

}
