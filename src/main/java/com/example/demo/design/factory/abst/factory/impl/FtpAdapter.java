package com.example.demo.design.factory.abst.factory.impl;

import com.example.demo.design.factory.abst.Ftp;
import com.example.demo.design.factory.abst.factory.IFileAdapter;

/**
 * ftp适配器
 *
 * @author gzc
 * @since 2022-7-20 11:03
 **/
public class FtpAdapter implements IFileAdapter {

	private Ftp ftp = new Ftp();

	@Override
	public String upload(String filePath) {
		return ftp.uploadFt(filePath);
	}

	@Override
	public String download(String filePath) {
		return ftp.downloadFt(filePath);
	}
}
