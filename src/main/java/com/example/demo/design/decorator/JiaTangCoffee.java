package com.example.demo.design.decorator;

/**
 * 加糖扩展功能
 *
 * @author gzc
 * @since 2022-7-26 10:51
 **/
public class JiaTangCoffee extends ICoffeeDecorator {

	public JiaTangCoffee(ICoffee iCoffee) {
		super(iCoffee);
	}

	@Override
	public void makeCoffee() {
		super.makeCoffee();
		System.out.print("->加糖");
	}
}
