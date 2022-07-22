package com.example.demo.design.build.intricacy;

/**
 * 人类建造管理者
 *
 * @author gzc
 * @since 2022-7-20 15:20
 **/
public class HumanDirector {

	/**
	 * 创建人类
	 *
	 * @param iBuilderHuman
	 * @return
	 */
	public Human createHumanByDirector(IBuilderHuman iBuilderHuman) {
		iBuilderHuman.buildHead();
		iBuilderHuman.buildBody();
		iBuilderHuman.buildHand();
		iBuilderHuman.buildFoot();
		return iBuilderHuman.createHuman();
	}
}
