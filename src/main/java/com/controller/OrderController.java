package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.Order;
import com.service.OrderService;

@Controller
@RequestMapping("/*")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@ResponseBody
	@RequestMapping("/find")
	String findOrderById(Integer id) {
		
		Order order = orderService.findOrderById(id); 
		
		return order.toString();
	}
}
