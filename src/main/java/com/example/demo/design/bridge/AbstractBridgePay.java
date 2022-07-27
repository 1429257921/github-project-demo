package com.example.demo.design.bridge;

import java.math.BigDecimal;

/**
 * 支付桥接类
 *
 * @author gzc
 * @since 2022-7-27 10:40
 **/
public abstract class AbstractBridgePay {

	protected IPayModel iPayModel;

	public AbstractBridgePay(IPayModel iPayModel) {
		this.iPayModel = iPayModel;
	}

	/**
	 * 划账
	 *
	 * @param uId
	 * @param tradeId
	 * @param amount
	 * @return
	 */
	abstract String transfer(String uId, String tradeId, BigDecimal amount);

}
