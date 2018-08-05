package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.constrants.Constants;
import com.domain.Order;
import com.mysql.cj.util.StringUtils;
import com.service.OrderService;
import com.util.Paging;
import com.util.RedisUtil;

import redis.clients.jedis.Jedis;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	@Autowired
	private RedisUtil redisUtil;
	
	@RequestMapping("/list")
	String list(Model model,@RequestParam(required = false)String keyword,@RequestParam(defaultValue="1")Integer pageNumber) {
		Jedis jedis = redisUtil.getJedis();
		String username= "shengxinjun";
		String velidate = jedis.get(username);
		if(!StringUtils.isNullOrEmpty(velidate)){
			String message = "1分钟内不可重复访问";
			System.out.println(message);
			model.addAttribute("message", message);
			return "index";
		}else{
			jedis.set(username, "用redis设置1分钟内不可重复访问");
			jedis.expire(username, 60);
		}
		Paging<Order> paging = new Paging<>();
		paging.setKeyword(keyword);
		paging.setPageNumber(pageNumber);
		paging.setPageSize(Constants.pageSize.SMALL_SIZE);
		paging = orderService.orderList(paging);
		model.addAttribute("paging", paging);
		return "orderList";
	}
	
	@RequestMapping("/findOrderById/{id}")
	String findOrderById(Model model,@PathVariable Integer id) {
		
		Order order = orderService.findOrderById(id); 
		model.addAttribute("order", order);
		return "orderDetail";
	}
	
	@RequestMapping("/getValue")
	String getRedisValue(Model model){

		Jedis jedis = redisUtil.getJedis();
		String name = jedis.get("name");
		model.addAttribute("name", name);
		return "orderList";
	}
	
}
