package com.example.demo.design.bridge;

import java.math.BigDecimal;

/**
 * 支付宝支付
 *
 * @author gzc
 * @since 2022-7-27 10:59
 **/
public class ZfbPay extends AbstractBridgePay {

	public ZfbPay(IPayModel iPayModel) {
		super(iPayModel);
	}

	@Override
	String transfer(String uId, String tradeId, BigDecimal amount) {
		boolean security = iPayModel.security(uId);
		if (!security) {
			System.out.println("支付宝支付失败");
			return "001";
		}
		System.out.println("支付宝支付成功");
		return "000";
	}
}
