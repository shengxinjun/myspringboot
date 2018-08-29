package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.dao.CodeMessageDao;
import com.dao.OrderDao;
import com.domain.Order;
import com.util.MyException;
import com.util.Paging;


@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private CodeMessageDao codeMessageDao;
	
	@Autowired
	private OrderDao orderDao;
	
	@Override
	public Order findOrderById(Integer id) {
		if (id == null ) {
			throw new MyException(codeMessageDao.findById(1));
		}
		return orderDao.findById(id);
	}

	@Override
	public Paging<Order> orderList(Paging paging) {
		return orderDao.orderList(paging);
	}

	@Override
	public void deleteOrderById(Integer id) {
		orderDao.deleteById(id);
		
	}

	@Override
	public void updateOrder(Order order) {
		orderDao.update(order);
		
	}

	@Override
	public void insert(Order order) {
		orderDao.insert(order);
		
	}
	
	
}
