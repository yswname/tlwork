package cn.com.tuling.openclass.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import cn.com.tuling.openclass.exception.ExceptionCode;
import cn.com.tuling.openclass.exception.PowerControlException;
import cn.com.tuling.openclass.pojo.Account;
import cn.com.tuling.openclass.service.IPowerControlService;

/**
 * 权限控制服务实现类
 * 
 * @version 1.0
 * @author NobleYang-清风
 */
@Service
@Scope(value=WebApplicationContext.SCOPE_SESSION, proxyMode=ScopedProxyMode.INTERFACES)
public class PowerControlServiceImpl implements IPowerControlService {
	@Override
	public String verifyAccount(Account account, HttpServletRequest request) {
		String result = "success";
		System.out.println("现在开始账号和密码的验证");
		if (account == null || account.getAccName() == null || account.getAccPassword() == null
				|| account.getAccName().length() < 6 || account.getAccPassword().length() < 6) {
			throw new PowerControlException("登录账号和密码不合法", ExceptionCode.INVALID_ACCOUNT);
		}else if(!account.getAccName().startsWith("zhang")){
			throw new PowerControlException("账号不存在", ExceptionCode.NO_ACCOUNT);
		}else if(!account.getAccPassword().startsWith("abc")){
			throw new PowerControlException("账号和密码不匹配", ExceptionCode.INVALID_PASSWORD);
		}
		return result;
	}

}
