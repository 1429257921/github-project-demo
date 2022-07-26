package com.example.demo.design.template;

/**
 * 小明的一天
 *
 * @author gzc
 * @since 2022-7-26 15:59
 **/
public class XiaoMing extends AbstractPersonDay {

	@Override
	protected void dinner() {
		System.out.println("晚餐吃泡面加香肠");
	}

	@Override
	protected void afternoon() {
		System.out.println("下午打游戏");
	}

	@Override
	protected void lunch() {
		System.out.println("中午睡觉");
	}

	@Override
	protected void morning() {
		System.out.println("早上睡觉");
	}
}
