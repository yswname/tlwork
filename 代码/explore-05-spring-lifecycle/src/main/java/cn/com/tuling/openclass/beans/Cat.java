package cn.com.tuling.openclass.beans;

public class Cat {
	private String name;
    public Cat(){
    	System.out.println("执行Cat构造器");
    }

    public void init(){
    	System.out.println("执行Cat的init方法");
    }
    
    public void destory(){
    	System.out.println("执行Cat的destory方法");
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}
