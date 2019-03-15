package cn.com.tuling.openclass.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.tuling.openclass.pojo.PluginInfo;
import cn.com.tuling.openclass.service.IPluginService;
import cn.com.tuling.openclass.service.IPowerControlService;

@Controller
@RequestMapping("/plugin")
public class PluginController {
	@Autowired
	private IPluginService pluginService;

	@RequestMapping("/active")
	@ResponseBody
	public String activePlugin(String plgId) {
		String result = "success";
		try {
			pluginService.activePlugin(plgId, IPowerControlService.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping("/disable")
	@ResponseBody
	public String deactivePlugin(String plgId) {
		String result = "success";
		try {
			pluginService.disablePlugin(plgId, IPowerControlService.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping("/view")
	public String viewPlugins(Model model) {
		String result = "pluginsDiv";
		List<PluginInfo> pluginInfoList = this.pluginService.fetchAllPluginInfos();
		model.addAttribute("pluginList", pluginInfoList);
		return result;
	}
	
	@RequestMapping("/init")
	public String initPlugins(Model model) {
		String result = "pluginsDiv";
		List<PluginInfo> pluginInfoList = this.pluginService.fetchAllPluginInfos();
		if(pluginInfoList != null) {
			for(PluginInfo info:pluginInfoList) {
				if(info.isActived()) {
					pluginService.activePlugin(info.getName(), IPowerControlService.class);
				}
			}
		}
		model.addAttribute("pluginList", pluginInfoList);
		return result;
	}
	@RequestMapping("/updatePlugins")
	@ResponseBody
	public String updatePlugins() {
		List<PluginInfo> pluginInfoList = this.pluginService.fetchAllPluginInfos();
		for(PluginInfo info:pluginInfoList) {
			pluginService.disablePlugin(info.getName(), IPowerControlService.class);
		}
		this.pluginService.updatePlugins();
		return "success";
	}
}
