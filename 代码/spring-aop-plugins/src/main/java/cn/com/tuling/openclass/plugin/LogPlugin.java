package cn.com.tuling.openclass.plugin;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

import cn.com.tuling.openclass.pojo.Account;

public class LogPlugin implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		Account account = null;
		if(args != null && args.length>0) {
			account = (Account)args[0];
		}
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String dateStr = format.format(date);
		if(account == null) {
			System.out.printf("%s 方法在 %s 被调用，输入的账号对象为null\n",method.getName(), dateStr);
		}else {
			System.out.printf("%s 在 %s 进行登录\n", account.getAccName(), dateStr);
		}
	}

}
