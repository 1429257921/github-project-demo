package com.example.demo.design.singleton;

/**
 * 懒汉式单例模式(线程安全)
 *
 * @author gzc
 * @since 2022-7-20 16:03
 **/
public class MySingleton1 {

	private MySingleton1() {
	}

	public static MySingleton1 getInstance() {
		return SingletonHolder.mySingleton1;
	}

	private static class SingletonHolder {

		private static MySingleton1 mySingleton1 = new MySingleton1();
	}
}
