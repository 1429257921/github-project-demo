package com.example.demo.design.factory.abst.factory;

/**
 * 文件服务器适配器接口
 *
 * @author gzc
 * @since 2022-7-20 11:00
 **/
public interface IFileAdapter {


	/**
	 * 上传
	 *
	 * @param filePath 文件路径
	 * @return 文件路径
	 */
	String upload(String filePath);

	/**
	 * 下载
	 *
	 * @param filePath 文件路径
	 * @return 文件数据
	 */
	String download(String filePath);

}
