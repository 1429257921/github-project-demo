package com.example.demo.design.template;

/**
 * 人们的一天
 *
 * @author gzc
 * @since 2022-7-26 15:47
 **/
public abstract class AbstractPersonDay {

	public final void start(String name) {
		System.out.println(name + "的一天开始啦");
		wakeUp();
		morning();
		lunch();
		afternoon();
		dinner();
		hoop();
		sleep();
		System.out.println(name + "的一天结束啦");
	}

	protected abstract void dinner();

	protected abstract void afternoon();

	protected abstract void lunch();

	protected abstract void morning();

	/**
	 * 钩子方法, 空方法
	 */
	protected void hoop() {

	}

	private void sleep() {
		System.out.println("上床睡觉");
	}

	private void wakeUp() {
		System.out.println("睡醒起床");
	}

}
