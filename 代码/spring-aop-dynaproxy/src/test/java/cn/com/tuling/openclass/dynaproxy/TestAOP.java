package cn.com.tuling.openclass.dynaproxy;

import cn.com.tuling.dynaproxy.aop.ApplicationContext;
import cn.com.tuling.dynaproxy.service.ILogService;
import cn.com.tuling.dynaproxy.service.IPowerService;

public class TestAOP {

	public static void main(String[] args) {
        ApplicationContext ctx = new ApplicationContext("beans.json");
        
        IPowerService power = (IPowerService)ctx.getBean("powerService2");
        boolean bool = power.login("zhangsan", "12");
        System.out.println(bool);
	}

}
