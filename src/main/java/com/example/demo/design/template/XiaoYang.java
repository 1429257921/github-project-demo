package com.example.demo.design.template;

/**
 * 小杨的一天
 *
 * @author gzc
 * @since 2022-7-26 16:00
 **/
public class XiaoYang extends AbstractPersonDay {

	@Override
	protected void dinner() {
		System.out.println("晚上加班");
	}

	@Override
	protected void afternoon() {
		System.out.println("下午上班");
	}

	@Override
	protected void lunch() {
		System.out.println("中午上班");
	}

	@Override
	protected void morning() {
		System.out.println("早上上班");
	}

	@Override
	protected void hoop() {
		super.hoop();
		System.out.println("看片");
	}
}
