package cn.sxt11.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt11.service.UserService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans11.xml");
		UserService userService = (UserService)ac.getBean("userService");
		userService.delete();
	}
}
