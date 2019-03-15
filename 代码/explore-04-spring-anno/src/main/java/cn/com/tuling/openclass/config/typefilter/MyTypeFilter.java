package cn.com.tuling.openclass.config.typefilter;

import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.util.MultiValueMap;

public class MyTypeFilter implements TypeFilter {

	@Override
	/**
	 * metadataReader 当前类的信息 metadataReaderFactory 能获取类信息的工厂对象
	 */
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		boolean bool = false;
//		// 获取注解信息
//		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
//		if (annotationMetadata != null) {
//			MultiValueMap<String, Object> attrs = annotationMetadata
//					.getAllAnnotationAttributes("org.springframework.stereotype.Controller");
//			if (attrs != null) {
//				Set<Entry<String, List<Object>>> entrySet = attrs.entrySet();
//				for (Entry<String, List<Object>> entry : entrySet) {
//					System.out.println("   " + entry.getKey() + "--->" + entry.getValue());
//				}
//			}
//		}
//		// 获取类信息
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
//		System.out.println(classMetadata.getClassName());
		String clsName = classMetadata.getClassName();
		if(clsName != null && clsName.contains("Impl")){
			bool = true;
		}
//		// 获取类的资源信息
//		Resource resource = metadataReader.getResource();
//		System.out.println("  url->" + resource.getURL().toString());

		return bool;
	}

}
