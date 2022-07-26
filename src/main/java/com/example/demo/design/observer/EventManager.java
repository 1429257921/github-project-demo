package com.example.demo.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author gzc
 * @since 2022-7-22 16:52
 **/
public class EventManager {

	private List<EventListener> list = new ArrayList<>();

	public EventManager() {
		System.out.println("=======坤坤的微博===========");
	}

	/**
	 * 路转粉
	 */
	public void lzf(EventListener eventListener) {
		list.add(eventListener);
	}

	/**
	 * 路转黑
	 */
	public void lzh(EventListener eventListener) {
		list.remove(eventListener);
	}

	public void notify(String msg) {
		System.out.println("坤坤发送新的一条信息, 消息内容->" + msg);
		for (EventListener eventListener : list) {
			eventListener.doEvent(msg);
		}
	}
}
