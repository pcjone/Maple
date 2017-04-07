package org.Maple.service;

import org.Maple.Api.entity.Permission;
import org.Maple.Api.enums.BaseEnums;
import org.Maple.core.util.DateUtil;
import org.Maple.core.util.UuidUtil;
import org.Maple.service.PermissionService;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.dubbo.common.utils.Assert;
/**
 * 权限单元测试
 *
 * @author panlei
 * @date 2017年4月5日
 */
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration({"classpath:Spring-Config.xml"}) 
public class PermissionServiceImplTest {
	
	@Autowired
	private PermissionService permissionService;
	
	@Test
	public void Test(){
		try {			
			Permission permission =  addPermission();
			System.out.println(permission.getId());
			permission = permissionService.selectByPrimaryKey(permission.getId());
			System.out.println(permission.getName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//添加菜单权限
	public Permission addPermission() throws Exception{
		Permission permission = new Permission();
		permission.setId(UuidUtil.getUUID());
		permission.setSystemId("1");
		permission.setIcon("");
		permission.setName("系统管理");
		permission.setOrders(0l);
		permission.setParentId("0");
		permission.setPermissionValue(null);
		permission.setUri(null);
		permission.setRemark("备注");
		permission.setType((byte)1);
		permission.setCreateDate(DateUtil.getNow());
		permission.setCreateUser("admin");
		permission.setStatus((byte)0);
		permission.setDeleted((byte)0);
		System.out.println(permissionService.insert(permission));
		return permission;
	}
}
