package org.Maple.core.aspect;

import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * 
 * ClassName: DataSourceAspect <br/>
 * Function: 数据源切换 <br/>
 * date: 2017年2月28日 上午10:51:14 <br/>
 * 
 * @author panlei
 * @version
 * @since JDK 1.7
 */
public class DataSourceAspect {
	
	private final Logger logger = LogManager.getLogger();

	/**
	 * 拦截目标方法，获取由@DataSource指定的数据源标识，设置到线程存储中以便切换数据源
	 * 
	 * @param point
	 * @throws Exception
	 */
	public void intercept(JoinPoint point) throws Exception {
		Class<?> target = point.getTarget().getClass();
		MethodSignature signature = (MethodSignature) point.getSignature();
		// 默认使用目标类型的注解，如果没有则使用其实现接口的注解
		for (Class<?> clazz : target.getInterfaces()) {
			resolveDataSource(clazz, signature.getMethod());
		}
		resolveDataSource(target, signature.getMethod());
	}

	/**
	 * 提取目标对象方法注解和类型注解中的数据源标识
	 * 
	 * @param clazz
	 * @param method
	 */
	private void resolveDataSource(Class<?> clazz, Method method) {
		try {
			Class<?>[] types = method.getParameterTypes();
			// 默认使用类型注解
			if (clazz.isAnnotationPresent(DataSource.class)) {
				DataSource source = clazz.getAnnotation(DataSource.class);
				DataSourceContextHolder.setDataSourceType(source.value());
				logger.info( "默认类型:" + source.value());
			}
			// 方法注解可以覆盖类型注解
			Method m = clazz.getMethod(method.getName(), types);
			if (m != null && m.isAnnotationPresent(DataSource.class)) {
				DataSource source = m.getAnnotation(DataSource.class);
				DataSourceContextHolder.setDataSourceType(source.value());
				logger.info( "方法注解可以覆盖类型注解:" + source.value());
			}
		} catch (Exception e) {
			logger.info(clazz + ":" + e.getMessage());
		}
	}
}
