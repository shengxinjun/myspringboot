package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.OrderDao;
import com.domain.Order;


@Service
public class OrderServiceImpl implements OrderService {
	

	@Autowired
	private OrderDao orderDao;
	
	@Override
	public Order findOrderById(Integer id) {
		return orderDao.findOrderById(id);
	}

}
