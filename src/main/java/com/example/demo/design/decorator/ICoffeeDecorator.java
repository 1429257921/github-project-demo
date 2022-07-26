package com.example.demo.design.decorator;

/**
 * 咖啡抽象装饰类
 *
 * @author gzc
 * @since 2022-7-26 10:46
 **/
public abstract class ICoffeeDecorator implements ICoffee {

	private ICoffee iCoffee;

	public ICoffeeDecorator(ICoffee iCoffee) {
		this.iCoffee = iCoffee;
	}

	@Override
	public void makeCoffee() {
		iCoffee.makeCoffee();
	}
}
