package cn.com.tuling.explore;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class CustomizedClassLoader {
    public static void loadJar(String jarPath){
    	File jarFile = new File(jarPath);
    	Method method = null;
    	try {
			method = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
			method.setAccessible(true);
			URLClassLoader clsLoader = (URLClassLoader)ClassLoader.getSystemClassLoader();
			URL url = jarFile.toURI().toURL();
			method.invoke(clsLoader, url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
