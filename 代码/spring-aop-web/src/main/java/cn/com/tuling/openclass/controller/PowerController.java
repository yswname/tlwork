package cn.com.tuling.openclass.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import cn.com.tuling.openclass.exception.PowerControlException;
import cn.com.tuling.openclass.pojo.Account;
import cn.com.tuling.openclass.service.IPowerControlService;

/**
 * 
 * @version 1.0
 * @author 清风
 */
@Controller
@RequestMapping("/power")
@SessionAttributes(names="VERIFY_CODE")
public class PowerController {
	@Value("${system.config.verifyCode}")
	private String verifyCode;
	@Autowired
	private IPowerControlService powerService;

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String loginPage(Model model) {
		String result = "login";
		model.addAttribute("VERIFY_CODE", verifyCode);
		System.out.println("!!!!!" + powerService);
		return result;
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String login(Account account, Model model,HttpServletRequest request) {
		String result = "welcome";
		try {
			String verifyResult = this.powerService.verifyAccount(account, request);
		} catch (Exception e) {
			model.addAttribute("message", e.getMessage());
			result = "login";
		} 
		return result;
	}
}
