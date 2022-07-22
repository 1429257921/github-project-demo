package com.example.demo.design.proxy;

/**
 * 动态代理测试
 *
 * @author gzc
 * @since 2022-7-22 11:10
 **/
public class Test1 {

	public static void main(String[] args) {

		ProxyInv proxyInv = new ProxyInv((UserDao) id -> null);
		UserDao userDao = (UserDao) proxyInv.creatProxy();
		userDao.queryById("aaa");
		System.out.println("========================================");
		ProxyMethod proxyMethod = new ProxyMethod(new UserDaoImpl());
		UserDaoImpl proxyInstance = (UserDaoImpl) proxyMethod.getProxyInstance();
		proxyInstance.queryById("cba");
	}

}
