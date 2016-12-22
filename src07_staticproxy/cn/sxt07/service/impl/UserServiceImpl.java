package cn.sxt07.service.impl;

import cn.sxt07.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public void add() {
		//公共的业务----日志，安全，权限，缓存，事务等等
		//A.log();---分离的思想--纸质阅读器；osgi--java模块开发-spring--osgi
		System.out.println("增加用户");
	}

	@Override
	public void update(int a) {
		System.out.println("修改用户");
	}	

	@Override
	public int delete() {
		System.out.println("删除用户");
		return 1;
	}

	@Override
	public void search() {
		System.out.println("查询用户");
	}
}
