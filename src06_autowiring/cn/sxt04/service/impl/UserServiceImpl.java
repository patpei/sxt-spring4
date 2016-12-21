package cn.sxt04.service.impl;

import cn.sxt04.dao.UserDao;
import cn.sxt04.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userDao=null;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	public void getUser() {
		userDao.getUser();
	}
}
