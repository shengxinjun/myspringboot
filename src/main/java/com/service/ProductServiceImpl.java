package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ProductDao;
import com.domain.Product;
import com.util.Paging;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao productDao;
	
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

}
