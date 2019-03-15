package cn.com.tuling.explore;

import java.lang.reflect.Method;

import org.junit.Test;

public class TestCustomizedClassLoader {
    private String jarPath = "E:\\work\\code\\tulingWorkspace\\explore-01\\target\\explore-0.0.1-SNAPSHOT.jar";
    @Test
    public void testLoadJar()throws Exception{
    	CustomizedClassLoader clsLoader = new CustomizedClassLoader();
    	clsLoader.loadJar(jarPath);
    	
    	Class cls = Class.forName("cn.com.tuling.explore.utils.Tool");
    	Object obj = cls.newInstance();
    	Class[] types = {int.class,int.class};
    	Method addMethod = cls.getDeclaredMethod("add", types);
    	Object result = addMethod.invoke(obj, 3,4);
        System.out.println(result);
        
    }
}
