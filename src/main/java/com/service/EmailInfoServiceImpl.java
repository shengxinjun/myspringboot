package com.service;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.dao.CodeMessageDao;
import com.dao.EmailInfoDao;
import com.dao.UserDao;
import com.domain.EmailInfo;
import com.domain.User;
import com.util.EmailUtil;
import com.util.MD5Util;
import com.util.MyException;

@Service
public class EmailInfoServiceImpl implements EmailInfoService {
	
	@Autowired
	private EmailInfoDao emailInfoDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private CodeMessageDao codeMessageDao;
	
	@Override
	public void forGetPassWord(String email,String ip) {
		User dbUser = userDao.findUserByEmail(email);
		if (ObjectUtils.isEmpty(dbUser)) {
			throw new MyException(codeMessageDao.findById(104));
		}
		int count = emailInfoDao.countEmailInfoByIpAndDate(ip, new Date());
		if (count>=10) {
			throw new MyException(codeMessageDao.findById(106));
		}
		EmailInfo emailInfo = new EmailInfo();
		int code = (int) ((Math.random()*9+1)*100000);
		emailInfo.setCode(String.valueOf(code));
		String context = "验证码为："+code;
		emailInfo.setContext(context);
		emailInfo.setReceiver(email);
		emailInfo.setSubject("找回密码");
		emailInfo.setSendDate(new Date());
		emailInfo.setIp(ip);
		emailInfoDao.insert(emailInfo);
		EmailUtil emailUtil = new EmailUtil(true);
		emailUtil.doSendHtmlEmail("ace system for your password", context, email);
		
	}

	@Override
	public boolean checkEmailCode(String email, String code) {
		boolean result = false;
		EmailInfo emailInfo = emailInfoDao.getEmailInfoByEmail(email);
		if (StringUtils.isEmpty(emailInfo)) {
			throw new MyException(codeMessageDao.findById(104));
		}
		if (emailInfo.getCode().equals(code)) {
			result = true;
			//找到该用户并更新其密码
			User dbUser = userDao.findUserByEmail(email);
			Integer random = (int)((Math.random()*9+1)*100000);
			String password = String.valueOf(random);
			dbUser.setPassword(MD5Util.MD5(password));
			userDao.update(dbUser);
			//将新密码发送给该用户
			EmailInfo sendPassword = new EmailInfo();
			sendPassword.setContext("你的新密码为："+password);
			sendPassword.setReceiver(email);
			sendPassword.setSubject("topest level---ace system");
			sendPassword.setSendDate(new Date());
			emailInfoDao.insert(sendPassword);
			EmailUtil emailUtil = new EmailUtil(true);
			emailUtil.doSendHtmlEmail("topest level---ace system", "你的新密码为："+password, email);
		}
		return result;
	}

}
