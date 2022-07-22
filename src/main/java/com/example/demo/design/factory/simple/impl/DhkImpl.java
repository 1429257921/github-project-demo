package com.example.demo.design.factory.simple.impl;

import com.example.demo.design.factory.simple.IComService;

/**
 * 发送兑换卡奖品
 *
 * @author gzc
 * @since 2022-7-20 9:56
 **/
public class DhkImpl implements IComService {

	@Override
	public void sendJP(String yhj, String dhk, String sw) {
		System.out.println("发送兑换卡奖品, 兑换卡ID->" + dhk);
	}
}
