package com.example.demo.design.template;

/**
 * 模板方法模式测试
 *
 * @author gzc
 * @since 2022-7-26 16:01
 **/
public class Test1 {

	public static void main(String[] args) {
		AbstractPersonDay xiaoMing = new XiaoMing();
		xiaoMing.start("小明");
		System.out.println("====================");
		AbstractPersonDay xiaoYang = new XiaoYang();
		xiaoYang.start("小杨");
	}

}
