package cn.com.tuling.openclass.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Import;

import cn.com.tuling.openclass.beans.Cat;
import cn.com.tuling.openclass.config.importselector.MyImportBeanDefinitionRegistar;
import cn.com.tuling.openclass.config.importselector.MyImportSelector;

@Import(value={Cat.class, ArrayList.class, MyImportSelector.class, MyImportBeanDefinitionRegistar.class})

public class ConfigImport {
	
}
