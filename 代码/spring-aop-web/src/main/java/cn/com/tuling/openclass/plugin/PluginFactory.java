package cn.com.tuling.openclass.plugin;

import org.aopalliance.aop.Advice;

import cn.com.tuling.openclass.pojo.PluginInfo;

public abstract class PluginFactory {
	public abstract Advice createPlugin(String plgName);
	public abstract PluginInfo getPluginInfo(String plgName);
	public abstract Advice[] createAllPlugins();
	public abstract PluginInfo[] getPluginInfos();
	public abstract void resetPlugins();
}
