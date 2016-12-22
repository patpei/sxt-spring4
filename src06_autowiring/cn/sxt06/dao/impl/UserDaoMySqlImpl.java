package cn.sxt06.dao.impl;

import cn.sxt06.dao.UserDao;

public class UserDaoMySqlImpl implements UserDao{
	@Override
	public void getUser() {
		System.out.println("mysql获取用户数据");
	}
}
