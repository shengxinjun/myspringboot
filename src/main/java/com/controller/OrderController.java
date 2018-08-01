package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.Order;
import com.service.OrderService;

@Controller
@RequestMapping("/*")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/find")
	String findOrderById(Model model,Integer id) {
		
		//Order order = orderService.findOrderById(id); 
		model.addAttribute("name", "abc");
		return "index";
	}
}
