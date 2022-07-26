package com.example.demo.design.observer;

/**
 * 小黑子
 *
 * @author gzc
 * @since 2022-7-22 16:49
 **/
public class Xhz implements EventListener {

	private String name;

	public Xhz(String name) {
		this.name = name;
	}

	@Override
	public void doEvent(String msg) {
		System.out.println(name + ":我家鸽鸽好厉害哦！下蛋你们都别想吃！");
		System.out.println("引用消息->" + msg);
	}
}
