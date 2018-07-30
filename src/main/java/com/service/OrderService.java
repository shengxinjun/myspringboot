package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.OrderDao;
import com.domain.Order;

public interface OrderService {
	
	
	Order findOrderById(Integer id);
	
}
