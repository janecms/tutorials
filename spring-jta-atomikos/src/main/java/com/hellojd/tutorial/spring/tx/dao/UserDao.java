package com.hellojd.tutorial.spring.tx.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hellojd.tutorial.spring.tx.model.User;

@Repository
public class UserDao {

	@Resource(name="jdbcTemplateA")
	private JdbcTemplate jdbcTemplate;
	
	public void save(User user){
		jdbcTemplate.update("insert into user(name,age) values(?,?)",user.getName(),user.getAge());
	}
}
