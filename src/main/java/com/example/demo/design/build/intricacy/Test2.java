package com.example.demo.design.build.intricacy;

import com.alibaba.fastjson.JSON;

/**
 * 复杂建造者模式测试
 *
 * @author gzc
 * @since 2022-7-20 15:16
 **/
public class Test2 {

	public static void main(String[] args) {
		IBuilderHuman cmHumanBuilder = new CmHumanBuilder();
		cmHumanBuilder.buildHead();
		cmHumanBuilder.buildBody();
		cmHumanBuilder.buildHand();
		cmHumanBuilder.buildFoot();
		Human human = cmHumanBuilder.createHuman();
		System.out.println(JSON.toJSONString(human));
		System.out.println("==========================");

		HumanDirector humanDirector = new HumanDirector();
		Human humanByDirector = humanDirector.createHumanByDirector(new SbHumanBuilder());
		System.out.println(JSON.toJSONString(humanByDirector));
	}

}
