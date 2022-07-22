package com.example.demo.design.factory.simple.impl;

import com.example.demo.design.factory.simple.IComService;

/**
 * 发送实物奖品
 *
 * @author gzc
 * @since 2022-7-20 9:58
 **/
public class SwImpl implements IComService {

	@Override
	public void sendJP(String yhj, String dhk, String sw) {
		System.out.println("发送实物奖品, 实物ID->" + sw);
	}
}
