package com.example.demo.design.factory.simple;

/**
 * 奖品统一接口
 *
 * @author gzc
 * @since 2022-7-20 9:53
 **/
public interface IComService {

	/**
	 * 发送奖品
	 *
	 * @param yhj 优惠券ID
	 * @param dhk 兑换卡ID
	 * @param sw  实物奖品
	 */
	void sendJP(String yhj, String dhk, String sw);

}

