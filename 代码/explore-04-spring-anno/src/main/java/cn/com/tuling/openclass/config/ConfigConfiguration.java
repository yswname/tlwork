package cn.com.tuling.openclass.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Lazy;

import cn.com.tuling.openclass.beans.Cat;
import cn.com.tuling.openclass.beans.Tiger;

@Configuration
//@ComponentScan(basePackages={"cn.com.tuling.openclass"})
@ComponentScan(
//		      basePackageClasses={ControllerMark.class, ServiceMark.class, DAOMark.class},
		      value={"cn.com.tuling.openclass"},
//               excludeFilters={
////            	  @Filter(type=FilterType.ANNOTATION, classes={Service.class}),
////            	  @Filter(type=FilterType.ASSIGNABLE_TYPE, classes={IUserDAO.class}),
//            	  @Filter(type=FilterType.CUSTOM, classes={MyTypeFilter.class})
//               }
		       useDefaultFilters=false,
               includeFilters={
            		   @Filter(type=FilterType.ASSIGNABLE_TYPE, classes={Tiger.class})
               }
               
)
public class ConfigConfiguration {
	//@Bean
	@Bean("myCat")
    public Cat cat(){
		System.out.println("create cat instance,name is myCat");
    	return new Cat();
    }
}
