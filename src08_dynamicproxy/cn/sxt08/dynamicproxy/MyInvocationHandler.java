package cn.sxt08.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler{
	private Object target;//目标对象--真实对象
	public void setTarget(Object target) {
		this.target = target;
	}
	/**
	 * 生成代理类
	 * */
	public Object getProxy(){
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), this);
	}
	/**
	 * proxy是代理类
	 * method 代理类的调用处理程序的方法对象
	 * */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if (args!=null){
			System.out.println("args="+args[0]);
		}
		log(method.getName());
		Object result = method.invoke(target, args);
		return result;
	}
	public void log(String methodName){
		System.out.println("执行"+methodName+"方法");
	}
}
