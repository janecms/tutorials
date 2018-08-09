package com.hellojd.tutorial.spring;

import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hellojd.tutorial.spring.tx.model.User;
import com.hellojd.tutorial.spring.tx.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class UserServiceTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void saveUser() throws SQLException{
		User user=new User();
		user.setName("lg");
		user.setAge(15);
		userService.save(user);
	}
}
