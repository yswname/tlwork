package cn.com.tuling.openclass.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.Advised;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import cn.com.tuling.openclass.plugin.PluginFactory;
import cn.com.tuling.openclass.pojo.PluginInfo;
import cn.com.tuling.openclass.service.IPluginService;
import cn.com.tuling.openclass.util.BaseHolder;

@Service
public class PluginServiceImpl implements IPluginService {
	@Autowired
	private PluginFactory pluginFactory;

	@Override
	public void activePlugin(String plgId, Class serviceType) {
		Advice advice = this.pluginFactory.createPlugin(plgId);
		if (advice == null) {
			throw new RuntimeException(plgId + "对应的插件不存在");
		}
		ApplicationContext applicationContext = BaseHolder.getApplicationContext();
		Advised advised = (Advised) applicationContext.getBean(serviceType);
		if (advised == null || this == advised) {
			throw new RuntimeException("目标对象不存在或是自己");
		}
		if (!this.hasAdvice(advised, advice.getClass())) {
			advised.addAdvice(0, advice);
			PluginInfo pluginInfo = pluginFactory.getPluginInfo(plgId);
			pluginInfo.setActived(true);
		}
	}

	@Override
	public void disablePlugin(String plgId, Class serviceType) {
		ApplicationContext applicationContext = BaseHolder.getApplicationContext();
		Advised advised = (Advised) applicationContext.getBean(serviceType);
		if (advised == null || this == advised) {
			throw new RuntimeException("目标对象不存在或是自己");
		}
		Advice advice = this.pluginFactory.createPlugin(plgId);
		if (advice == null) {
			throw new RuntimeException(plgId + "对应的插件不存在");
		}
		if (this.hasAdvice(advised, advice.getClass())) {
			advised.removeAdvice(advice);
			PluginInfo pluginInfo = pluginFactory.getPluginInfo(plgId);
			pluginInfo.setActived(false);
		}
	}

	@Override
	public List<PluginInfo> fetchAllPluginInfos() {
		List<PluginInfo> infos = null;
		PluginInfo[] infoArray = this.pluginFactory.getPluginInfos();
		if (infoArray != null && infoArray.length > 0) {
			infos = new ArrayList<PluginInfo>();
			for (PluginInfo info : infoArray) {
				infos.add(info);
			}
		}
		return infos;
	}

	@Override
	public void updatePlugins() {
		this.pluginFactory.resetPlugins();
	}

	private boolean hasAdvice(Advised advised, Class adviceType) {
		boolean bool = false;
		if (advised != null) {
			Advisor[] advisors = advised.getAdvisors();
			if (advisors != null && advisors.length > 0) {
				for (Advisor advisor : advisors) {
					if (advisor.getAdvice().getClass().getName().equals(adviceType.getName())) {
						bool = true;
						break;
					}
				}
			}
		}
		return bool;
	}

}
