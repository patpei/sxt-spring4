package cn.sxt04.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt04.service.UserService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans04.xml");
		UserService us = (UserService)ac.getBean("service");
		us.getUser();
	}
}
