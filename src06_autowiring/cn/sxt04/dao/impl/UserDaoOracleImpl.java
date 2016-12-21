package cn.sxt04.dao.impl;

import cn.sxt04.dao.UserDao;

public class UserDaoOracleImpl implements UserDao{
	@Override
	public void getUser() {
		System.out.println("oracle获取用户数据");
	}
}
