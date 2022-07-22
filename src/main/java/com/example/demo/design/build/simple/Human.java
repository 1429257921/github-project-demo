package com.example.demo.design.build.simple;

import lombok.Data;

/**
 * 人类
 *
 * @author gzc
 * @since 2022-7-20 14:44
 **/
@Data
public class Human {

	/**
	 * 头
	 */
	private String head;
	/**
	 * 身体
	 */
	private String body;
	/**
	 * 手
	 */
	private String hand;
	/**
	 * 脚
	 */
	private String foot;

	public Builder builder() {
		return new Builder();
	}


	/**
	 * 静态建造者内部类
	 */
	static class Builder {

		/**
		 * 头
		 */
		private String head;
		/**
		 * 身体
		 */
		private String body;
		/**
		 * 手
		 */
		private String hand;
		/**
		 * 脚
		 */
		private String foot;

		public Builder head(String head) {
			this.head = head;
			return this;
		}

		public Builder body(String body) {
			this.body = body;
			return this;
		}

		public Builder hand(String hand) {
			this.hand = hand;
			return this;
		}

		public Builder foot(String foot) {
			this.foot = foot;
			return this;
		}

		/**
		 * 构建非常聪明的人
		 */
		public Builder cm() {
			this.head = "智商1800";
			this.body = "身材弱小";
			this.hand = "手短";
			this.foot = "腿短";
			return this;
		}

		/**
		 * 构建强壮的人
		 */
		public Builder qz() {
			this.head = "智商10";
			this.body = "身材魁梧";
			this.hand = "手臂强壮";
			this.foot = "腿粗";
			return this;
		}

		/**
		 * 构建运动员
		 */
		public Builder ydy() {
			this.head = "智商100";
			this.body = "身材充满腱子肉";
			this.hand = "手长";
			this.foot = "腿长";
			return this;
		}

		/**
		 * 构建正常人
		 */
		public Builder zcr() {
			this.head = "智商90";
			this.body = "身材标准";
			this.hand = "手标准";
			this.foot = "腿标准";
			return this;
		}

		/**
		 * 返回构建人类
		 */
		public Human build() {
			Human human = new Human();
			human.setHead(this.head);
			human.setBody(this.body);
			human.setHand(this.hand);
			human.setFoot(this.foot);
			return human;
		}
	}

}
