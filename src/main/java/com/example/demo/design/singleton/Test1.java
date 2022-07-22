package com.example.demo.design.singleton;

/**
 * 单例模式测试
 *
 * @author gzc
 * @since 2022-7-20 16:11
 **/
public class Test1 {

	public static void main(String[] args) {
		MySingleton2 instance = MySingleton2.getInstance();
		System.out.println(instance);
		MySingleton2 instance2 = MySingleton2.getInstance();
		System.out.println(instance2);
		System.out.println("===============================");
		MySingleton1 instance3 = MySingleton1.getInstance();
		System.out.println(instance3);
		MySingleton1 instance4 = MySingleton1.getInstance();
		System.out.println(instance4);
	}
}
