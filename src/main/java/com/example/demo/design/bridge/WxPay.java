package com.example.demo.design.bridge;

import java.math.BigDecimal;

/**
 * 微信支付
 *
 * @author gzc
 * @since 2022-7-27 10:57
 **/
public class WxPay extends AbstractBridgePay {

	public WxPay(IPayModel iPayModel) {
		super(iPayModel);
	}

	@Override
	String transfer(String uId, String tradeId, BigDecimal amount) {
		boolean security = iPayModel.security(uId);
		if (!security) {
			System.out.println("微信支付失败");
			return "001";
		}
		System.out.println("微信支付成功");
		return "000";
	}
}
