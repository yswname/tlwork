package cn.com.tuling.openclass.dynaproxy;

import cn.com.tuling.dynaproxy.service.IPowerService;
import cn.com.tuling.dynaproxy.service.PowerServiceFactory;

public class ProxyClient {
	public static void main(String[] args) {
		IPowerService powerService = PowerServiceFactory.createPowerService();
		boolean bool = powerService.login("zhangsan", "abc123");
	}
}
