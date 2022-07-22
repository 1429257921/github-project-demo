package com.example.demo.design.proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * CgLib动态代理实现
 *
 * @author gzc
 * @since 2022-7-22 14:58
 **/
public class ProxyMethod<T> implements MethodInterceptor {

	private T target;

	public ProxyMethod(T target) {
		this.target = target;
	}

	@Override
	public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("cglib前置");
		Object invoke = method.invoke(target, args);
		System.out.println("invoke");
		System.out.println("cglib后置");
		return invoke;
	}

	// 创建代理对象
	public T getProxyInstance() {
		// 1. 创建Enhancer类对象，它类似于咱们JDK动态代理中的Proxy类，该类就是用来获取代理对象的
		Enhancer enhancer = new Enhancer();
		// 2. 设置父类的字节码对象。为啥子要这样做呢？因为使用CGLIB生成的代理类是属于目标类的子类的，也就是说代理类是要继承自目标类的
		enhancer.setSuperclass(target.getClass());
		// 3. 设置回调函数
		enhancer.setCallback(this);
		// 4. 创建代理对象
		return (T) enhancer.create();
	}
}
