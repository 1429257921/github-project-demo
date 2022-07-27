package com.example.demo.design.bridge;

import java.math.BigDecimal;

/**
 * 桥接模式测试
 *
 * @author gzc
 * @since 2022-7-27 10:56
 **/
public class Test1 {

	public static void main(String[] args) {
		WxPay wxPay = new WxPay(new FaceModel());
		wxPay.transfer("abc", "cba", new BigDecimal(100));
		ZfbPay zfbPay = new ZfbPay(new FingerModel());
		zfbPay.transfer("abc", "cba", new BigDecimal(100));
	}

}
