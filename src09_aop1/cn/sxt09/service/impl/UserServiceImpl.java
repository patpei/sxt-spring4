package cn.sxt09.service.impl;

import cn.sxt09.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public void add() {
		System.out.println("�����û�");
	}

	@Override
	public void update(int a) {
		System.out.println("�޸��û�");
	}	

	@Override
	public void delete() {
		System.out.println("ɾ���û�");
	}

	@Override
	public void search() {
		System.out.println("��ѯ�û�");
	}

}
