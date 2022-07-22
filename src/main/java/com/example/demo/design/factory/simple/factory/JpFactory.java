package com.example.demo.design.factory.simple.factory;

import com.example.demo.design.factory.simple.IComService;
import com.example.demo.design.factory.simple.impl.DhkImpl;
import com.example.demo.design.factory.simple.impl.SwImpl;
import com.example.demo.design.factory.simple.impl.YhjImpl;

/**
 * 奖品工厂类
 *
 * @author gzc
 * @since 2022-7-20 9:58
 **/
public class JpFactory {

	public IComService getJp(Integer code) throws Exception {
		if (code == null) {
			return null;
		}
		IComService iComService;
		switch (code) {
			case 0:
				iComService = new YhjImpl();
				break;
			case 1:
				iComService = new DhkImpl();
				break;
			case 2:
				iComService = new SwImpl();
				break;
			default:
				throw new Exception("不存在的商品服务类型");
		}
		return iComService;
	}

}
