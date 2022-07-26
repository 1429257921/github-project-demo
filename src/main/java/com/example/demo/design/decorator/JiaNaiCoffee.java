package com.example.demo.design.decorator;

/**
 * 咖啡加奶 扩展功能
 *
 * @author gzc
 * @since 2022-7-26 11:05
 **/
public class JiaNaiCoffee extends ICoffeeDecorator {

	public JiaNaiCoffee(ICoffee iCoffee) {
		super(iCoffee);
	}

	@Override
	public void makeCoffee() {
		super.makeCoffee();
		System.out.print("->加奶");
	}
}
