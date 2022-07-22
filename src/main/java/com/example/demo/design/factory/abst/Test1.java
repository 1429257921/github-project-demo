package com.example.demo.design.factory.abst;

import com.example.demo.design.factory.abst.factory.impl.FastDfsAdapter;
import com.example.demo.design.factory.abst.factory.ProxyFactory;
import com.example.demo.design.factory.abst.factory.impl.FtpAdapter;

/**
 * 抽象工厂测试
 *
 * @author gzc
 * @since 2022-7-20 11:28
 **/
public class Test1 {

	public static void main(String[] args) throws Exception {
		FileService proxy1 = ProxyFactory.getProxy(FileServiceImpl.class, new FastDfsAdapter());
		String download1 = proxy1.download("aljdklaj");
		String upload1 = proxy1.upload(download1);
		System.out.println(upload1);
		System.out.println("===================================");
		FileService proxy2 = ProxyFactory.getProxy(FileServiceImpl.class, new FtpAdapter());
		String download2 = proxy2.download("ftpladjklasd");
		String upload2 = proxy2.upload(download2);
		System.out.println(upload2);
	}

}
