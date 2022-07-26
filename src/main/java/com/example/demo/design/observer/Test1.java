package com.example.demo.design.observer;

/**
 * 观察者模式测试
 *
 * @author gzc
 * @since 2022-7-22 16:41
 **/
public class Test1 {

	public static void main(String[] args) {
		EventManager eventManager = new EventManager();
		eventManager.lzf(new Zaf("小马"));
		eventManager.lzf(new Xhz("小黄"));
		eventManager.notify("大家好，我是练习时长两年半的个人练习生 菜虚鲲");
	}

}
