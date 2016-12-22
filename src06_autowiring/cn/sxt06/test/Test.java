package cn.sxt06.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt06.service.UserService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans06.xml");
		UserService us = (UserService)ac.getBean("service");
		us.getUser();
	}
}
