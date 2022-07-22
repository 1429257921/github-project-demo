package com.example.demo.design.factory.abst.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 抽象工厂
 *
 * @author gzc
 * @since 2022-7-20 11:05
 **/
public class ProxyFactory {

	/**
	 * 获取代理对象
	 *
	 * @param interfaceClass
	 * @param cacheAdapter
	 * @param <T>
	 * @return
	 * @throws Exception
	 */
	public static <T> T getProxy(Class<T> interfaceClass, IFileAdapter cacheAdapter) throws Exception {
		InvocationHandler handler = new FactoryInvocationHandler(cacheAdapter);
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		Class<?>[] classes = interfaceClass.getInterfaces();
		return (T) Proxy.newProxyInstance(classLoader, new Class[]{classes[0]}, handler);
	}

}
