
package com.dao;

import org.jooq.Condition;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.Table;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.domain.Product;
import com.util.Paging;

import sxj.db.tables.records.ProductRecord;
import static sxj.db.Tables.PRODUCT;

import java.util.List;

@Repository
public class ProductDao extends DAOImpl<ProductRecord,Product, Integer> {
	
	@Autowired
	private DSLContext dslContext;
	
	protected ProductDao(Configuration configuration) {
		super(PRODUCT, Product.class, configuration);
		
	}
	@Override
	protected Integer getId(Product product) {
		return product.getId();
	}
	/****************************************************
	 * 下面是自定义方法
	 ***************************************************************/
	
	List<Product> productList(Paging<Product> paging){
		List<Product> list = null;
		Condition condition = null;
		if (!StringUtils.isEmpty(paging.getKeyword())) {
			condition = PRODUCT.NAME.like(paging.getKeyword());
		}
		list = dslContext.select().from(PRODUCT).where(condition).orderBy(PRODUCT.ID).fetchInto(Product.class);
		return list;
	}
	
}
