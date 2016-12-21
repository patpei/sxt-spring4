package cn.sxt09.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt09.service.UserService;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans09.xml");
		UserService userService = (UserService)ac.getBean("userService");
		userService.update(2);
	}
}
