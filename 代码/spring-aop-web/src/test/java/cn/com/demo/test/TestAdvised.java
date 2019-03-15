package cn.com.demo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.com.tuling.openclass.StartWebApp;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=StartWebApp.class)
public class TestAdvised {
	@Test
    public void test() {
//    	LogPlugin plugin = new LogPlugin();
//		Advised advised = (Advised)BaseHolder.getBean(IPowerControlService.class);
//		
//		
//		Class[] classes = advised.getProxiedInterfaces();
//		for(Class advisor:classes) {
//			System.out.println("***" + advisor.getName());
//		}
//		advised.addAdvice(plugin);
//		Advisor[] advisors = advised.getAdvisors();
//		for(Advisor a:advisors) {
//			System.out.println("#####"+a.getAdvice().getClass().getName());
//		}
//    	//Advised
////    	System.out.println(advised);
//    	IPowerControlService service = (IPowerControlService)advised;
//    	service.verifyAccount(null);
    }
}
