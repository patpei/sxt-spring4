package cn.sxt10.service.impl;

import cn.sxt10.service.UserService;

public class UserServiceImpl implements UserService{
	@Override
	public void add() {
		System.out.println("-------����û�����-------");
	}
	@Override
	public int delete() {
		System.out.println("-------ɾ���û�����-------");
		return 1;
	}
}
