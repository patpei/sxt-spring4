package cn.sxt11.service.impl;

import cn.sxt11.service.UserService;

public class UserServiceImpl implements UserService{
	@Override
	public void add() {
		System.out.println("-------����û�����-------");
	}
	public int add(int a,int c){
		return 1;
	}
	@Override
	public int delete() {
		System.out.println("-------ɾ���û�����-------");
		return 1;
	}
}
