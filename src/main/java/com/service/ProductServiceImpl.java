package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.dao.CodeMessageDao;
import com.dao.OrderDao;
import com.dao.OrderItemDao;
import com.dao.ProductDao;
import com.domain.Order;
import com.domain.OrderItem;
import com.domain.Product;
import com.util.MyException;
import com.util.Paging;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Autowired
	private OrderDao orderDao;

	@Autowired
	private OrderItemDao orderItemDao;

	@Autowired
	private CodeMessageDao codeMessageDao;

	@Override
	public Product findProductById(Integer id) {
		// TODO Auto-generated method stub
		return productDao.findById(id);
	}

	@Override
	public Paging<Product> productList(Paging<Product> paging) {
		// TODO Auto-generated method stub
		return productDao.productList(paging);
	}

	@Override
	public void updateProduct(Product product) {
		productDao.update(product);
	}

	@Override
	public void deleteProductById(Integer id) {
		productDao.deleteById(id);
	}

	@Override
	public void insert(Product product) {
		productDao.insert(product);
	}

	@Override
	public void deleteProductsByIds(List<Integer> ids) {
		productDao.deleteById(ids);
	}

	@Override
	public void batchImport(List<Product> list) {
		productDao.insert(list);

	}

	@Override
	public void addProductToOrder(Integer productId, Integer orderId) {
		Order order = orderDao.findById(orderId);
		if (ObjectUtils.isEmpty(order)) {
			throw new MyException(codeMessageDao.findById(200));
		}
		Product product = productDao.findById(productId);
		if (ObjectUtils.isEmpty(product)) {
			throw new MyException(codeMessageDao.findById(300));
		}
		OrderItem orderItem = new OrderItem();
		orderItem.setOrderId(orderId).setDescription(product.getDescription()).setImgs(product.getImgs())
				.setName(product.getName()).setPrice(product.getPrice()).setType(product.getType());
		orderItemDao.insertAndReturnId(orderItem);
	}

}
