package cn.sxt08.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

import cn.sxt08.service.UserService;
import cn.sxt08.service.UserServiceImpl;

public class Client {
	public static void main(String[] args) {
		
//		MyInvocationHandler pih = new MyInvocationHandler();
//		pih.setTarget(userService);
//		UserService proxy = (UserService)pih.getProxy();
//		proxy.delete();
//		
//		MyInvocationHandler ph = new MyInvocationHandler();
//		ph.setTarget(new ArrayList());
//		List list = (List)ph.getProxy();
//		list.add(1);
		
		UserService proxy = (UserService) getProxy();
		proxy.delete();
		
	}
	
	public static Object getProxy(){
		UserService userServiceImpl = new UserServiceImpl();
		return Proxy.newProxyInstance(userServiceImpl.getClass().getClassLoader(), 
				userServiceImpl.getClass().getInterfaces(), 
				new InvocationHandler(){
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("begin proxy");
				Object res= method.invoke(userServiceImpl, args);
				System.out.println("end proxy");
				return res;
				
			}
			
		});
	}
}
