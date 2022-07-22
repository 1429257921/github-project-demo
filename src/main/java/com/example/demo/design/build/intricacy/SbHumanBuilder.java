package com.example.demo.design.build.intricacy;

/**
 * 建造傻逼的实现类
 *
 * @author gzc
 * @since 2022-7-20 15:14
 **/
public class SbHumanBuilder implements IBuilderHuman {

	private Human human = new Human();

	@Override
	public void buildHead() {
		this.human.setHead("智商250");
	}

	@Override
	public void buildBody() {
		this.human.setBody("身体偏瘫");
	}

	@Override
	public void buildHand() {
		this.human.setHand("手一长一短");
	}

	@Override
	public void buildFoot() {
		this.human.setFoot("O型腿");
	}

	@Override
	public Human createHuman() {
		return this.human;
	}
}
