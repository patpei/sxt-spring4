package cn.sxt06.service.impl;

import cn.sxt06.dao.UserDao;
import cn.sxt06.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userDao=null;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	public void getUser() {
		userDao.getUser();
	}
}
