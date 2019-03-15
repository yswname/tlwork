package cn.com.tuling.openclass.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.framework.Advised;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.com.tuling.openclass.AppStart;
import cn.com.tuling.openclass.service.IDeskLampService;
import cn.com.tuling.openclass.service.ITVService;
import net.bytebuddy.asm.Advice;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=AppStart.class)
public class TestTVServiceImpl {
	@Autowired
	private IDeskLampService deskLampService;
	@Autowired
    private ITVService tvService;
	
	@Test
	public void testPlayProgram() {
		tvService.playProgram();
		System.out.println("=======================");
		if(tvService instanceof Advised) {
			System.out.println("tvService是Advised对象啦，哈哈哈");
		}else {
			System.out.println("tvService不是Advised对象，呜呜呜");
		}
	}
}
