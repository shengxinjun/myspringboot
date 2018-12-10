package com.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import com.dao.CodeMessageDao;
import com.dao.UserDao;
import com.domain.User;
import com.util.MD5Util;
import com.util.MyException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private CodeMessageDao codeMessageDao;
	
	@Override
	public User checkUser(String email, String password) {
		User user = userDao.findUserByEmail(email);
		if (ObjectUtils.isEmpty(user)) {
			throw new MyException(codeMessageDao.findById(101));
		}
		if (!user.getPassword().equals(MD5Util.MD5(password))) {
			throw new MyException(codeMessageDao.findById(102));
		}
		if (user.getDeleted()!=null && user.getDeleted()==1) {
			throw new MyException(codeMessageDao.findById(107));
		}
		return user;
	}

	@Override
	public void insert(User user) {
		
		User dbUser = userDao.findUserByTelephone(user.getTelephone());
		if (!ObjectUtils.isEmpty(dbUser)) {
			throw new MyException(codeMessageDao.findById(103));
		}
		dbUser = userDao.findUserByEmail(user.getEmail());
		if (!ObjectUtils.isEmpty(dbUser)) {
			throw new MyException(codeMessageDao.findById(103));
		}
		userDao.insert(user);
	}

}
