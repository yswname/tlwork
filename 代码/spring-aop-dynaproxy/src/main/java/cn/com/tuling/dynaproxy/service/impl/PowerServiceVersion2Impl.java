package cn.com.tuling.dynaproxy.service.impl;

import cn.com.tuling.dynaproxy.service.IPowerService;

public class PowerServiceVersion2Impl implements IPowerService {

	@Override
	public boolean login(String userName, String password) {
		System.out.println("PowerServiceVersion2Impl.login method ......userName:" + userName +",password:"+password );
		return true;
	}

}
