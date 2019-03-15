package cn.com.tuling.openclass.config.importselector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata annoData) {
		String[] result = new String[]{"java.util.HashMap", "java.util.Vector"};
		return result;
	}

}
