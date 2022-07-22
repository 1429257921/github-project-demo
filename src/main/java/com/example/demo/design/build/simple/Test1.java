package com.example.demo.design.build.simple;

import com.alibaba.fastjson.JSON;

/**
 * 简单建造者模式测试
 *
 * @author gzc
 * @since 2022-7-20 14:52
 **/
public class Test1 {

	public static void main(String[] args) {
		Human human = new Human().builder()
				.head("智商180")
				.foot("大长腿")
				.hand("大长臂")
				.body("大胸肌")
				.build();
		System.out.println(JSON.toJSONString(human));
		System.out.println("================================");
		Human human1 = new Human.Builder().cm().build();
		System.out.println(JSON.toJSONString(human1));
		System.out.println("================================");
		Human human2 = new Human.Builder().qz().build();
		System.out.println(JSON.toJSONString(human2));
		System.out.println("================================");
		Human human3 = new Human.Builder().ydy().build();
		System.out.println(JSON.toJSONString(human3));
		System.out.println("================================");
		Human human4 = new Human.Builder().zcr().build();
		System.out.println(JSON.toJSONString(human4));
	}

}
