package cn.sxt07.service.impl;

import cn.sxt07.service.UserService;

public class UserServiceProxy implements UserService{
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Override
	public void add() {
		log("add");
		userService.add();
	}
	@Override
	public int delete() {
		//日志，安全，缓存，事务，异常处理等
		log("delete");
		userService.delete();
		return 1;
	}
	@Override
	public void search() {
		log("search");
		userService.search();
	}
	public void update(int a) {
		log("update");
		userService.update(a);
	}
	public void log(String methodName){
		System.out.println("执行"+methodName+"方法");
	}
	
}
