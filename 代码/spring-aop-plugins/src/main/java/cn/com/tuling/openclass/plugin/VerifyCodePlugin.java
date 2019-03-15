package cn.com.tuling.openclass.plugin;

import java.lang.reflect.Method;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.aop.MethodBeforeAdvice;

import cn.com.tuling.openclass.pojo.Account;

public class VerifyCodePlugin implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		if (target.getClass().getName().equals("cn.com.tuling.openclass.service.impl.PowerControlServiceImpl")
				&& method.getName().equals("verifyAccount")) {
            Account account = (Account)args[0];
            HttpServletRequest request = (HttpServletRequest)args[1];
            HttpSession session = request.getSession();
            String verifyCode = (String)session.getAttribute("VERIFY_CODE");
            System.out.printf("系统验证码是'%s'， 用户输入的验证码是：'%s'\n", verifyCode, account.getVerifyCode());
            if(verifyCode == null || !verifyCode.equals(account.getVerifyCode()) ) {
            	throw new RuntimeException("验证码输入错误");
            }
		}
	}

}
