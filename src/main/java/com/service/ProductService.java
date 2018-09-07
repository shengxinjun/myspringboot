package com.service;

import java.util.List;


import com.domain.Product;

import com.util.Paging;

public interface ProductService {
	
	Product findProductById(Integer id);
	
	Paging<Product> productList(Paging<Product> paging);

	void updateProduct(Product product);

	void deleteProductById(Integer id);
	
	void insert(Product product);

	void deleteProductsByIds(List<Integer> ids);
}
