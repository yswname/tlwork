package cn.com.tuling.openclass.service;

import java.util.List;

import cn.com.tuling.openclass.pojo.PluginInfo;

public interface IPluginService {
	public void activePlugin(String plgId, Class serviceType);
	public void disablePlugin(String plgId, Class serviceType);
	public List<PluginInfo> fetchAllPluginInfos();
	public void updatePlugins();
}
