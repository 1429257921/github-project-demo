package com.example.demo.design.decorator;

/**
 * 原味咖啡
 *
 * @author gzc
 * @since 2022-7-26 10:45
 **/
public class YuanWeiCoffee implements ICoffee {

	@Override
	public void makeCoffee() {
		System.out.print("制作原味咖啡");
	}
}
