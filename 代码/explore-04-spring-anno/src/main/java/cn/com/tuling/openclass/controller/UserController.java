package cn.com.tuling.openclass.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;

import cn.com.tuling.openclass.service.UserService;

@Controller
public class UserController {
	@Inject
    private UserService userService;
    
    public UserService getUserService(){
    	return this.userService;
    }
}
