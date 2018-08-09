package com.hellojd.tutorial.spring.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hellojd.tutorial.spring.tx.dao.LogDao;
import com.hellojd.tutorial.spring.tx.dao.UserDao;
import com.hellojd.tutorial.spring.tx.model.User;

/**
 * @author zhaoguoyu
 */
@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	@Autowired
	private LogDao logDao;
	
	@Transactional
	public void save(User user){
		userDao.save(user);
		logDao.save(user);
		throw new RuntimeException();
	}
}
