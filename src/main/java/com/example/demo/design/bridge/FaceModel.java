package com.example.demo.design.bridge;

/**
 * 人脸识别模块
 *
 * @author gzc
 * @since 2022-7-27 10:52
 **/
public class FaceModel implements IPayModel {

	@Override
	public boolean security(String uId) {
		System.out.println("人脸识别通过");
		return true;
	}
}
