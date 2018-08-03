package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.OrderDao;
import com.domain.Order;
import com.util.Paging;


@Service
public class OrderServiceImpl implements OrderService {
	

	@Autowired
	private OrderDao orderDao;
	
	@Override
	public Order findOrderById(Integer id) {
		return orderDao.findOrderById(id);
	}

	@Override
	public Paging<Order> orderList(Paging paging) {
		return orderDao.orderList(paging);
	}
	
	
}
