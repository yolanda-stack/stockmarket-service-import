package com.smc.utils;

/**
 * @version 1.0
 * @Author Yolanda
 * @description 自定义响应码
 */

public class ResponseCode {
	
	protected ResponseCode() {

	}

	//成功
	public static final int SUCCESS = 200;
	//服务不可用
	public static final int ERROR_SERVICE_UNAVAILABLE = 405;
	//系统错误
	public static final int ERROR_SYS = 500;
	 //文件格式错误
    public static final int FILE_FORMAT_ERROR = 6001;
    //数据访问失败
    public static final int ERROR_ACCESS_DB = 6002;

}
