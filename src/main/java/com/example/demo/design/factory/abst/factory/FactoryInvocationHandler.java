package com.example.demo.design.factory.abst.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.example.demo.design.factory.abst.ClassLoaderUtils;

/**
 * 工厂代理类
 *
 * @author gzc
 * @since 2022-7-20 11:09
 **/
public class FactoryInvocationHandler implements InvocationHandler {

	private IFileAdapter iFileAdapter;

	public FactoryInvocationHandler(IFileAdapter iFileAdapter) {
		this.iFileAdapter = iFileAdapter;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return IFileAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args))
				.invoke(iFileAdapter, args);
	}
}
