package com.example.demo.design.bridge;

/**
 * 支付模块接口
 *
 * @author gzc
 * @since 2022-7-27 10:51
 **/
public interface IPayModel {

	/**
	 * 安全
	 *
	 * @param uId
	 * @return
	 */
	boolean security(String uId);
}
