package cn.com.tuling.openclass.service.impl;

import org.springframework.stereotype.Service;

import cn.com.tuling.openclass.service.ITVService;


@Service
public class TVServiceImpl implements ITVService {

	@Override
	public void playProgram() {
		System.out.println("电视:我正在直播中国国足世界杯的半决赛....快来摔啤酒瓶啦 ^_^");
	}

}
