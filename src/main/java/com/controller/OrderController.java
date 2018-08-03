package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.constrants.Constants;
import com.domain.Order;
import com.service.OrderService;
import com.util.Paging;

@Controller
@RequestMapping("/*")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/list")
	String list(Model model,String keyword,Integer pageNumber) {
		Paging<Order> paging = new Paging<>();
		paging.setKeyword(keyword);
		paging.setPageNumber(pageNumber);
		paging.setPageSize(Constants.pageSize.SMALL_SIZE);
		paging = orderService.orderList(paging);
		model.addAttribute("paging", paging);
		return "index";
	}
	
	@RequestMapping("/find")
	String findOrderById(Model model,Integer id) {
		
		Order order = orderService.findOrderById(id); 
		model.addAttribute("name", order);
		return "index";
	}
	
}
