package com.example.demo.design.bridge;

/**
 * 密码识别模块
 *
 * @author gzc
 * @since 2022-7-27 10:54
 **/
public class CypherModel implements IPayModel {

	@Override
	public boolean security(String uId) {
		System.out.println("密码识别通过");
		return true;
	}
}
