package cn.com.tuling.dynaproxy.service.impl;

import cn.com.tuling.dynaproxy.service.IPowerService;

public class PowerServiceImpl implements IPowerService {
	@Override
	public boolean login(String userName, String password) {
		System.out.println("powerServiceImpl.login method ......userName:" + userName +",password:"+password );
		return true;
	}

}
