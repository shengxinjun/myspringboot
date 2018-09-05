package com.controller.UrlCheck;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.util.WebUtils;

@ControllerAdvice
public class UrlCheckController {
	
	
	@ModelAttribute
	void modelAttribute(Model model, HttpServletRequest request) throws ServletRequestBindingException {
		Cookie cookie = WebUtils.getCookie(request, "uid");
		StringBuffer requestURL = request.getRequestURL();
		String servletPath = request.getServletPath();

		// 是否为登录首页
		boolean isNotLoginOrOut = false;
		if (servletPath.equals("/") || servletPath.equals("/login")) {
			isNotLoginOrOut = true;
		}

		// 如果userId为空，且不是登录页，则报异常，跳到登录页
		if (null == cookie && isNotLoginOrOut == false) {
			throw new ServletRequestBindingException("return login");
		}
	}

	@ExceptionHandler(ServletRequestBindingException.class)
	ModelAndView exceptionHandler(ServletRequestBindingException e) {
		// 返回成功页面
		ModelAndView view = new ModelAndView();
		view.setView(new RedirectView("/", true, false));
	return view;
	}
	
}	
