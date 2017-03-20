package org.Maple.service;

import org.Maple.Api.entity.User;
import org.Maple.service.UserService;
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration({"classpath:Spring-Config.xml"}) 
public class UserMapperTest {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void test(){
		//ApplicationContext testContext = new ClassPathXmlApplicationContext("classpath:Spring-Config.xml");  
		//UserService userService = (UserService)testContext.getBean("userService");  	
		try {
			User user = userService.selectByPrimaryKey("111111111");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
