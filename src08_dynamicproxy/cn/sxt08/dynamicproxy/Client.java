package cn.sxt08.dynamicproxy;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
//		UserService userService = new UserServiceImpl();
//		ProxyInovationHandler pih = new ProxyInovationHandler();
//		pih.setTarget(userService);
//		UserService proxy = (UserService)pih.getProxy();
//		proxy.delete();
		
		MyInvocationHandler ph = new MyInvocationHandler();
		ph.setTarget(new ArrayList());
		List list = (List)ph.getProxy();
		list.add(1);
	}
}
