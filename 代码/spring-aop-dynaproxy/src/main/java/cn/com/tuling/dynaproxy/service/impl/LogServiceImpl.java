package cn.com.tuling.dynaproxy.service.impl;

import cn.com.tuling.dynaproxy.service.ILogService;

public class LogServiceImpl implements ILogService {

	@Override
	public void log() {
		System.out.println("--------logging............");
	}

}
