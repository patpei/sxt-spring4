package cn.sxt04.dao.impl;

import cn.sxt04.dao.UserDao;

public class UserDaoMySqlImpl implements UserDao{
	@Override
	public void getUser() {
		System.out.println("mysql获取用户数据");
	}
}
