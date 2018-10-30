package com.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.User;
import com.google.gson.Gson;
import com.model.Result;
import com.model.UserForm;
import com.service.EmailInfoService;
import com.service.UserService;
import com.util.MD5Util;
import com.util.MyException;
import com.util.WebUtils;

@Controller
@RequestMapping("/*")
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private EmailInfoService emailInfoService;
	
	@ResponseBody
	@RequestMapping("/login")
	Result login(HttpServletRequest request,HttpServletResponse response,String telephone,String password,String remember) {
		Result result = new Result();
		User user = new User();
		try {
			user = userService.checkUser(telephone, password);
			result.setCode(1);
		} catch (MyException e) {
			result.setCode(e.getCode());
			result.setMessage(e.getMessage());
			return result;
		}
		if (remember.equals("1")) {
			WebUtils.setCookie(request, response, "telephone", telephone, Integer.MAX_VALUE);
			WebUtils.setCookie(request, response, "password", password, Integer.MAX_VALUE);
		}
		WebUtils.setCookie(request, response, "uid", user.getId().toString(), Integer.MAX_VALUE);
		WebUtils.setCookie(request, response, "remember", remember, Integer.MAX_VALUE);
		return result;
	}
	
	@RequestMapping("/logout")
	String logout(HttpServletRequest request,HttpServletResponse response) {
		WebUtils.clearCookie(request, response, "uid");
		WebUtils.clearCookie(request, response, "telephone");
		WebUtils.clearCookie(request, response, "password");
		return "login/index";
	}
	
	/**
	 * 注册事件
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/register")
	Result register(String user) {
		Result result = new Result();
		Gson gson = new Gson();
		UserForm userForm = gson.fromJson(user,UserForm.class);
		User obj = new User();
		obj.setTelephone(userForm.getTelephone());
		obj.setName(userForm.getName());
		obj.setEmail(userForm.getEmail());
		obj.setRegisterDate(new Date());
		obj.setPassword(MD5Util.MD5(userForm.getPassword()));
		try {
			userService.insert(obj);
			result.setCode(1);
		} catch (MyException e) {
			result.setCode(e.getCode());
			result.setMessage(e.getMessage());
		}
		return result;
	}
	/**
	 * 获取验证码
	 * @param email
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/sendCheckCode")
	Result sendCheckCode(String email,String ip) {
		Result result = new Result();
		try {
			emailInfoService.forGetPassWord(email,ip);
			result.setCode(1);
		} catch (MyException e) {
			result.setCode(e.getCode());
			result.setMessage(e.getMessage());
		}
		return result;
	}
	/**
	 * 校验验证码
	 * @param email
	 * @param code
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/checkCode")
	Result checkCode(String email,String code) {
		Result result = new Result();
		boolean trueOrFalse = emailInfoService.checkEmailCode(email, code);
		if (trueOrFalse) {
			result.setCode(1);
			result.setMessage("密码已发送到您邮箱");
		}else {
			result.setCode(2);
		}
		
		return result;
	}
}
