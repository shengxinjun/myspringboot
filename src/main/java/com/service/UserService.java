package com.service;

import com.domain.User;

public interface UserService {
	
	User checkUser(String telephone,String password);
	
}
