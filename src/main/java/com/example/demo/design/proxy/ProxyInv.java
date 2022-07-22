package com.example.demo.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 *
 * @author gzc
 * @since 2022-7-22 11:03
 **/
public class ProxyInv implements InvocationHandler {

	private Object target;

	public ProxyInv(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("前置");
		Object invoke = method.invoke(target, args);
		System.out.println(invoke);
		System.out.println("后置");
		return invoke;
	}

	public Object creatProxy() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
}
