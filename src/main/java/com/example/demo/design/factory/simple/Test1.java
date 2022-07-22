package com.example.demo.design.factory.simple;

import com.example.demo.design.factory.simple.factory.JpFactory;

/**
 * 测试简单工厂方法模式
 *
 * @author gzc
 * @since 2022-7-20 10:02
 **/
public class Test1 {

	public static void main(String[] args) throws Exception {
		JpFactory jpFactory = new JpFactory();
		IComService yhj = jpFactory.getJp(0);
		yhj.sendJP("123", null, null);
		System.out.println("==================================");
		IComService dhk = jpFactory.getJp(1);
		dhk.sendJP(null, "456", null);
		System.out.println("==================================");
		IComService sw = jpFactory.getJp(2);
		sw.sendJP(null, null, "789");
	}

}
