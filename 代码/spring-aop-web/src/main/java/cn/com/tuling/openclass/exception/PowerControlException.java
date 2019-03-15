package cn.com.tuling.openclass.exception;
/**
 * 权限控制异常类
 * 
 * @version 1.0
 * @author NobleYang-清风
 * */
public class PowerControlException extends RuntimeException {
	private String message;
	private String msgCode;
    public PowerControlException(String message){
    	super(message);
    	this.message = message;
    }
    
    public PowerControlException(String message,String msgCode){
    	super(msgCode + ":" + message);
    	this.message = message;
    	this.msgCode = msgCode;
    }

	public String getMessage() {
		return message;
	}

	public String getMsgCode() {
		return msgCode;
	}
}
