package com.example.demo.design.factory.abst;

/**
 * ftp客户端实现
 *
 * @author gzc
 * @since 2022-7-20 10:52
 **/
public class Ftp {

	public String uploadFt(String filePath) {
		System.out.println("ftp上传文件");
		return filePath;
	}

	public String downloadFt(String filePath) {
		System.out.println("ftp下载文件");
		return "ftp99999999999999";
	}

}
