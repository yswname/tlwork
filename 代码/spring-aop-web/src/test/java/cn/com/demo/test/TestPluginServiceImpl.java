package cn.com.demo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.com.tuling.openclass.StartWebApp;
import cn.com.tuling.openclass.pojo.Account;
import cn.com.tuling.openclass.service.IPluginService;
import cn.com.tuling.openclass.service.IPowerControlService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=StartWebApp.class)
public class TestPluginServiceImpl {
	@Autowired
    private IPluginService pluginService;
	@Autowired
	private IPowerControlService powerControlService;
	
	@Test
	public void testActivePlugin() {
		Account account = new Account();
		account.setAccName("zhang12345");
		account.setAccPassword("abc12345");
		System.out.println("---------before------------");
		this.powerControlService.verifyAccount(account,null);
		System.out.println("-----------added-----------");
		this.pluginService.activePlugin("logPlugin", IPowerControlService.class);
		this.pluginService.activePlugin("demoPlugin", IPowerControlService.class);
		this.powerControlService.verifyAccount(account,null);
		System.out.println("-----------removed-----------");
		this.pluginService.disablePlugin("logPlugin", IPowerControlService.class);
		this.powerControlService.verifyAccount(account,null);
		
	}
}
