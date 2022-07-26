package com.example.demo.design.observer;

/**
 * 鲲的真爱粉
 *
 * @author gzc
 * @since 2022-7-22 16:50
 **/
public class Zaf implements EventListener {

	private String name;

	public Zaf(String name) {
		this.name = name;
	}

	@Override
	public void doEvent(String msg) {
		System.out.println(name + ":我家割割好帅！好喜欢他");
		System.out.println("引用消息->" + msg);

	}
}
