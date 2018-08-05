package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.util.RedisUtil;

import redis.clients.jedis.Jedis;

@Controller
@RequestMapping("/*")
public class IndexController {
	
	@Autowired
	private RedisUtil redisUtil;
	
	@RequestMapping("")
	String index() {
		
		return "index";
	}
}
