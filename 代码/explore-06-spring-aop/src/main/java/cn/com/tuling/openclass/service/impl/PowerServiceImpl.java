package cn.com.tuling.openclass.service.impl;

import org.springframework.stereotype.Service;

import cn.com.tuling.openclass.service.IPowerService;

@Service
public class PowerServiceImpl implements IPowerService {

	@Override
	public boolean login(String userName, String password) {
		boolean bool = false;
		System.out.println("to execute PowerServiceImpl.login() method...");
		bool = userName != null && userName.startsWith("zhang");
		return bool;
	}

}
