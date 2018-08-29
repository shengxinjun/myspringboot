package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.OrderDao;
import com.domain.Order;
import com.util.Paging;

public interface OrderService {
	
	
	Order findOrderById(Integer id);
	
	Paging<Order> orderList(Paging paging);
	
	void deleteOrderById(Integer id);
	
}
