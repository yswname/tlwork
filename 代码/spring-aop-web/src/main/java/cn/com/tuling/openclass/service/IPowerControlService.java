package cn.com.tuling.openclass.service;

import javax.servlet.http.HttpServletRequest;

import cn.com.tuling.openclass.pojo.Account;

/**
 * 权限控制服务接口
 * 
 * @version 1.0
 * @author NobleYang-清风
 * */
public interface IPowerControlService {
    public String verifyAccount(Account account,HttpServletRequest request);
}
