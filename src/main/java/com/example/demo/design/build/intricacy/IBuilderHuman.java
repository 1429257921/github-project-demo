package com.example.demo.design.build.intricacy;

/**
 * 构建人类标准接口
 *
 * @author gzc
 * @since 2022-7-20 15:12
 **/
public interface IBuilderHuman {

	/**
	 * 构建头
	 */
	void buildHead();

	/**
	 * 构建身体
	 */
	void buildBody();

	/**
	 * 构建手
	 */
	void buildHand();

	/**
	 * 构建脚
	 */
	void buildFoot();

	/**
	 * 构建完整人类
	 * @return human
	 */
	Human createHuman();

}
