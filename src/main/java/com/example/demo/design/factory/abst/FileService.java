package com.example.demo.design.factory.abst;

/**
 * 文件操作接口
 *
 * @author gzc
 * @since 2022-7-20 11:36
 **/
public interface FileService {


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
