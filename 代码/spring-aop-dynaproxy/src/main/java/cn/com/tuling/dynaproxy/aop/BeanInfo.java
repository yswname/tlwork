package cn.com.tuling.dynaproxy.aop;

public class BeanInfo {
	private String name;
	private String clsName;
	private String adviceName;
	private String adviceMethod;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClsName() {
		return clsName;
	}

	public void setClsName(String clsName) {
		this.clsName = clsName;
	}

	public String getAdviceName() {
		return adviceName;
	}

	public void setAdviceName(String adviceName) {
		this.adviceName = adviceName;
	}

	public String getAdviceMethod() {
		return adviceMethod;
	}

	public void setAdviceMethod(String adviceMethod) {
		this.adviceMethod = adviceMethod;
	}

}