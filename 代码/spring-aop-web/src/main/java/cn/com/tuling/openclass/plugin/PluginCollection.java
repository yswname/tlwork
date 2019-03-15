package cn.com.tuling.openclass.plugin;

import java.util.ArrayList;
import java.util.List;

import cn.com.tuling.openclass.pojo.PluginInfo;

public class PluginCollection {
    private List<PluginInfo> pluginList = new ArrayList<PluginInfo>();
    private String type;
	public PluginInfo[] getPlugins() {
		
		return this.pluginList.toArray(new PluginInfo[2]);
	}
	public void setPlugins(PluginInfo[] plugins) {
		if(plugins !=  null) {
			this.pluginList.clear();
			for(PluginInfo plugin:plugins) {
				this.pluginList.add(plugin);
			}
		}
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void addPlugin(PluginInfo plugin) {
		this.pluginList.add(plugin);
	}
}
