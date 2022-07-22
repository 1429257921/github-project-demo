package com.example.demo.design.factory.abst.factory.impl;

import com.example.demo.design.factory.abst.FastDfs;
import com.example.demo.design.factory.abst.factory.IFileAdapter;

/**
 * fastDfs适配器
 *
 * @author gzc
 * @since 2022-7-20 10:59
 **/
public class FastDfsAdapter implements IFileAdapter {

	private FastDfs fastDfs = new FastDfs();

	@Override
	public String upload(String filePath) {
		return fastDfs.uploadFD();
	}

	@Override
	public String download(String filePath) {
		return fastDfs.downloadFD(filePath);
	}
}
