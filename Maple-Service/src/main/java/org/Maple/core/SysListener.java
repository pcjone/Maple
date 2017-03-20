package org.Maple.core;

import javax.servlet.ServletContextEvent;

import org.Maple.core.listener.ServerListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

public class SysListener extends ServerListener{
	protected final Logger logger = LogManager.getLogger(this.getClass());

	public void contextInitialized(ServletContextEvent contextEvent) {
		WebApplicationContext context = ContextLoader.getCurrentWebApplicationContext();
		logger.info("=================================");
		logger.info("context 上下文获取bean");
		logger.info("=================================");
		//context.getBean(SysUserService.class).init();
		//SysDicService sysDicService = context.getBean(SysDicService.class);
		//sysDicService.getAllDic();
		super.contextInitialized(contextEvent);
	}
}
