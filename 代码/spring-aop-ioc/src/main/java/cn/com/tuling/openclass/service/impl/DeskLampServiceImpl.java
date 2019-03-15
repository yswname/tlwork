package cn.com.tuling.openclass.service.impl;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

import cn.com.tuling.openclass.service.IDeskLampService;

@Aspect
@Service
public class DeskLampServiceImpl implements IDeskLampService {
	@Override
	@Before("execution(* cn.com.tuling.openclass.service.**.*(..))")
	public void shining() {
		System.out.println("台灯：我正在发着柔和的橘色光，浪漫吧... ... &_^");
	}
}
