package org.Maple.core.aspect;

import java.lang.reflect.Method;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 
 * ClassName: DataSourceAspect <br/>
 * Function: 不同方法调用不同数据源 <br/>
 * date: 2017年2月28日 上午10:51:14 <br/>
 * 
 * @author panlei
 * @version
 * @since JDK 1.7
 */
@Aspect
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class DataSourceAspectNext {
	
	private final Logger logger = LogManager.getLogger();

	@Pointcut("execution(* org.Maple.provider..*.*(..))")
	public void aspect() {
	}

	/**
	 * 配置前置通知,使用在方法aspect()上注册的切入点
	 */
	@Before("aspect()")
	public void before(JoinPoint point) {
		String className = point.getTarget().getClass().getName();
		String method = point.getSignature().getName();
		logger.info(className + "." + method + "(" + StringUtils.join(point.getArgs(), ",") + ")");
		try {
			L: for (String key : DynamicDataSource.METHODTYPE.keySet()) {
				for (String type : DynamicDataSource.METHODTYPE.get(key)) {
					if (method.startsWith(type)) {
						logger.info(key);
						DataSourceContextHolder.setDataSourceType(key);
						break L;
					}
				}
			}
		} catch (Exception e) {
			logger.error(e);
			DataSourceContextHolder.setDataSourceType("write");
		}
	}

	@After("aspect()")
	public void after(JoinPoint point) {
		DataSourceContextHolder.clearDataSourceType();
	}
}
