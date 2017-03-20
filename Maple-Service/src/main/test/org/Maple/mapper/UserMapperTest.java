package org.Maple.mapper;

import org.Maple.Api.entity.User;
import org.Maple.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration({"classpath:Spring-Config.xml"}) 
public class UserMapperTest {
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@Test
	public void test(){
		try {
			User user = userService.selectByPrimaryKey("111111111");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
