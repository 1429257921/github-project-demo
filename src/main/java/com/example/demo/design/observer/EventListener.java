package com.example.demo.design.observer;

/**
 * 鲲的微博
 *
 * @author gzc
 * @since 2022-7-22 16:43
 **/
public interface EventListener {



	/**
	 * 发微博
	 *
	 * @param msg
	 */
	void doEvent(String msg);
}
