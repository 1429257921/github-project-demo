package com.example.demo.design.factory.simple.impl;

import com.example.demo.design.factory.simple.IComService;

/**
 * 发送优惠券奖品
 *
 * @author gzc
 * @since 2022-7-20 9:55
 **/
public class YhjImpl implements IComService {

	@Override
	public void sendJP(String yhj, String dhk, String sw) {
		System.out.println("开始发送优惠券, 优惠券ID->" + yhj);
	}
}
