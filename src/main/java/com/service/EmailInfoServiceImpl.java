package com.service;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dao.EmailInfoDao;
import com.domain.EmailInfo;
import com.util.EmailUtil;

@Service
public class EmailInfoServiceImpl implements EmailfInfoService {
	
	@Autowired
	private EmailUtil emailUtil;
	
	@Autowired
	private EmailInfoDao emailInfoDao;
	
	@Value("${email.account}")
	private String sender_username;
	
	@Override
	public void forGetPassWord(String email) {
		EmailInfo emailInfo = new EmailInfo();
		int code = (int) (Math.random()%1000000);
		emailInfo.setCode(String.valueOf(code));
		String context = "验证码为："+code;
		emailInfo.setContext(context);
		emailInfo.setReceiver(email);
		emailInfo.setSubject("找回密码");
		emailInfo.setSender(sender_username);
		emailInfo.setSendDate(new Date());
		emailInfoDao.insert(emailInfo);
		emailUtil.doSendHtmlEmail("ace system for your password", context, email);
		
	}

}
