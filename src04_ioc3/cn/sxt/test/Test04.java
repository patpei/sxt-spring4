package cn.sxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt.vo.User;

public class Test04 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans04.xml");
		User user = (User)ac.getBean("u3");
		user.show();
	}
}
