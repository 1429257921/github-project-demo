package com.example.demo.design.singleton;

/**
 * 饿汉式单例模式(线程安全)
 *
 * @author gzc
 * @since 2022-7-20 16:03
 **/
public class MySingleton3 {

	private MySingleton3() { }

	private static MySingleton3 mySingleton3 = new MySingleton3();

	public static MySingleton3 getInstance(){
		return mySingleton3;
	}
}
