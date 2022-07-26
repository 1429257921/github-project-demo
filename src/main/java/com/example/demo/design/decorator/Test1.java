package com.example.demo.design.decorator;

/**
 * 装饰器模式测试
 *
 * @author gzc
 * @since 2022-7-26 10:53
 **/
public class Test1 {

	public static void main(String[] args) {
		ICoffee yuanWeiCoffee = new YuanWeiCoffee();
		yuanWeiCoffee.makeCoffee();
		System.out.println();
		yuanWeiCoffee = new JiaBingCoffee(yuanWeiCoffee);
		yuanWeiCoffee.makeCoffee();
		System.out.println();
		yuanWeiCoffee = new JiaTangCoffee(yuanWeiCoffee);
		yuanWeiCoffee.makeCoffee();
		System.out.println();
		yuanWeiCoffee = new JiaNaiCoffee(yuanWeiCoffee);
		yuanWeiCoffee.makeCoffee();
	}

}
