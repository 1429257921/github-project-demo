package com.example.demo.design.factory.abst;

/**
 * fastDfs客户端实现
 *
 * @author gzc
 * @since 2022-7-20 10:53
 **/
public class FastDfs {


	public String uploadFD() {
		System.out.println("fastDfs上传文件");
		return "fastDfs12345567788789";
	}

	public String downloadFD(String fileId) {
		System.out.println("fastDfs下载文件");
		return "fd88888888";
	}

}
