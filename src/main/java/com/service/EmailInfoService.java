package com.service;


public interface EmailInfoService {
	
	/**
	 * 获取验证码
	 * @param email
	 */
	void forGetPassWord(String email,String ip);
	
	/**
	 * 校验验证码,如果正确将密码发送到邮箱
	 * @param email
	 * @param code
	 * @return
	 */
	boolean checkEmailCode(String email,String code);
}
