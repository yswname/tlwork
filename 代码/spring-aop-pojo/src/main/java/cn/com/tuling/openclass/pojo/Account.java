package cn.com.tuling.openclass.pojo;

/**
 * 登录账号的封装类
 * 
 * @version 1.0
 * @author NobleYang-清风
 * */
public class Account {
    private String accName;// 账号名（登录名）
    private String accPassword;// 账号密码（登录密码）
    private String verifyCode;
    
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccPassword() {
		return accPassword;
	}
	public void setAccPassword(String accPassword) {
		this.accPassword = accPassword;
	}
	public String getVerifyCode() {
		return verifyCode;
	}
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
}
