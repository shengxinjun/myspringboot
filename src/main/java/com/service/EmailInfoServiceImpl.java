package com.service;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.dao.CodeMessageDao;
import com.dao.EmailInfoDao;
import com.dao.UserDao;
import com.domain.EmailInfo;
import com.domain.User;
import com.util.EmailUtil;
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
	public void forGetPassWord(String email) {
		User dbUser = userDao.findUserByEmail(email);
		if (ObjectUtils.isEmpty(dbUser)) {
			throw new MyException(codeMessageDao.findById(104));
		}
		EmailInfo emailInfo = new EmailInfo();
		int code = (int) ((Math.random()*9+1)*100000);
		emailInfo.setCode(String.valueOf(code));
		String context = "验证码为："+code;
		emailInfo.setContext(context);
		emailInfo.setReceiver(email);
		emailInfo.setSubject("找回密码");
		emailInfo.setSendDate(new Date());
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
			User dbUser = userDao.findUserByEmail(email);
			EmailInfo sendPassword = new EmailInfo();
			sendPassword.setContext("你的密码为："+dbUser.getPassword());
			sendPassword.setReceiver(email);
			sendPassword.setSubject("topest level---ace system");
			sendPassword.setSendDate(new Date());
			emailInfoDao.insert(sendPassword);
			EmailUtil emailUtil = new EmailUtil(true);
			emailUtil.doSendHtmlEmail("topest level---ace system", "你的密码为："+dbUser.getPassword(), email);
		}
		return result;
	}

}
