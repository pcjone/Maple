package org.Maple.core.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 
 * ClassName: DataSource <br/> 
 * Function: 定义数据源注解 <br/> 
 * date: 2017年2月28日 上午10:16:57 <br/> 
 * 
 * @author panlei 
 * @version  
 * @since JDK 1.7
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DataSource {
	String value();
}
