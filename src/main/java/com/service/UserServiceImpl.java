package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.dao.CodeMessageDao;
import com.dao.UserDao;
import com.domain.User;
import com.util.MyException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private CodeMessageDao codeMessageDao;
	
	@Override
	public User checkUser(String telephone, String password) {
		User user = userDao.findUserByTelephone(telephone);
		if (ObjectUtils.isEmpty(user)) {
			throw new MyException(codeMessageDao.findById(101));
		}
		if (!password.equals(user.getPassword())) {
			throw new MyException(codeMessageDao.findById(102));
		}
		return user;
	}

}
