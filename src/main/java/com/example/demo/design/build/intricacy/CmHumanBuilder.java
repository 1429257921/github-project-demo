package com.example.demo.design.build.intricacy;

/**
 * 建造聪明人的实现类
 *
 * @author gzc
 * @since 2022-7-20 15:14
 **/
public class CmHumanBuilder implements IBuilderHuman {

	private Human human = new Human();

	@Override
	public void buildHead() {
		this.human.setHead("智商99999999999");
	}

	@Override
	public void buildBody() {
		this.human.setBody("身体弱小");
	}

	@Override
	public void buildHand() {
		this.human.setHand("手短");
	}

	@Override
	public void buildFoot() {
		this.human.setFoot("腿短");
	}

	@Override
	public Human createHuman() {
		return this.human;
	}
}
