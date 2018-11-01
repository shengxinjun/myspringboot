package com.service;
import java.util.List;
import com.domain.Order;
import com.util.Paging;

public interface OrderService {
	
	
	Order findOrderById(Integer id);
	
	Paging<Order> orderList(Paging paging);
	
	void deleteOrderById(Integer id);
	
	void updateOrder(Order order);
	
	void insert(Order order);
	
	void deleteOrdersByIds(List<Integer> ids);
	
}
