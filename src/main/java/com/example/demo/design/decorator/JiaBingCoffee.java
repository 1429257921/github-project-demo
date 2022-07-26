package com.example.demo.design.decorator;

/**
 * 加冰扩展功能
 *
 * @author gzc
 * @since 2022-7-26 10:52
 **/
public class JiaBingCoffee extends ICoffeeDecorator {

	public JiaBingCoffee(ICoffee iCoffee) {
		super(iCoffee);
	}

	@Override
	public void makeCoffee() {
		super.makeCoffee();
		System.out.print("->加冰");
	}
}
