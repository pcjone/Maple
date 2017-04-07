package org.Maple.service;

import java.util.List;

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
/**
 * 用户单元测试类
 *
 * @author panlei
 * @date 2017年3月31日
 */
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration({"classpath:Spring-Config.xml"}) 
public class UserServiceImplTest {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void Test(){
		//查询用户
		User user  = selectByPrimaryKey("iiiiiii");
	}
	
	/**
	 * 
	 * @Title: selectByPrimaryKey
	 * @Description: 根据ID查询
	 * @param @param id
	 * @return void
	 * @throws
	 */
	public User selectByPrimaryKey(String id){
		User user = null;
		try {
			user = userService.selectByPrimaryKey(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	/**
	 * 
	 * @Title: addUser
	 * @Description: 添加用户测试
	 * @param @param user
	 * @param @return
	 * @return Integer
	 * @throws
	 */
	public Integer addUser(User user){
		Integer index = 0;
		try {
			index = userService.insert(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return index;
	}
	/**
	 * 
	 * @Title: deleteUser
	 * @Description: 根据id删除用户测试
	 * @param @param id
	 * @param @return
	 * @return Integer
	 * @throws
	 */
	public Integer deleteUser(String id){
		Integer index = 0;
		try {
			index = userService.deleteByPrimaryKey(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return index;
	}
	/**
	 * 
	 * @Title: deleteUserList
	 * @Description: 根据id集合删除用户测试
	 * @param @param list
	 * @param @return
	 * @return Integer
	 * @throws
	 */
	public Integer deleteUserList(List list){
		Integer index = 0;
		try {
			index = userService.deleteByList(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return index;
	}
	/**
	 * 
	 * @Title: updateUser
	 * @Description: 更新用户测试
	 * @param @param user
	 * @param @return
	 * @return Integer
	 * @throws
	 */
	public Integer updateUser(User user){
		Integer index = 0;
		try {
			index = userService.updateByPrimaryKey(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return index;
	}
}
