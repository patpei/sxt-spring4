package cn.sxt08.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

import cn.sxt07.service.UserService;
import cn.sxt07.service.impl.UserServiceImpl;

public class Client {
	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();
		MyInvocationHandler pih = new MyInvocationHandler();
		pih.setTarget(userService);
		UserService proxy = (UserService)pih.getProxy();
		proxy.delete();
		
		MyInvocationHandler ph = new MyInvocationHandler();
		ph.setTarget(new ArrayList());
		List list = (List)ph.getProxy();
		list.add(1);
		
		Object o=getProxy();
		System.out.println(o.getClass().getName()); //com.sun.proxy.$Proxy0
		UserService proxy1 = (UserService) o;
		proxy1.delete();
		
	}
	
	public static Object getProxy(){
		UserService userServiceImpl = new UserServiceImpl();
		return Proxy.newProxyInstance(userServiceImpl.getClass().getClassLoader(), 
				UserServiceImpl.class.getInterfaces(), 
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
