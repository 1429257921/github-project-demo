package com.example.demo.design.bridge;

/**
 * 指纹识别模块
 *
 * @author gzc
 * @since 2022-7-27 10:53
 **/
public class FingerModel implements IPayModel {

	@Override
	public boolean security(String uId) {
		System.out.println("指纹识别通过");
		return true;
	}
}
