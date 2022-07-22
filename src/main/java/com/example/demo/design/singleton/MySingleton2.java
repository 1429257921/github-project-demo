package com.example.demo.design.singleton;

/**
 * 懒汉单例模式（线程安全）
 *
 * @author gzc
 * @since 2022-7-20 16:03
 **/
public class MySingleton2 {

	private static volatile MySingleton2 mySingleton2;

	private MySingleton2() {}

	public static MySingleton2 getInstance() {
		if (mySingleton2 == null) {
			synchronized (MySingleton2.class) {
				if (mySingleton2 == null) {
					mySingleton2 = new MySingleton2();
				}
			}
		}
		return mySingleton2;
	}
}
