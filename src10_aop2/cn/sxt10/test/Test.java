package cn.sxt10.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt10.service.UserService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans10.xml");
		UserService userService = (UserService)ac.getBean("userService");
		userService.delete();
	}
}
