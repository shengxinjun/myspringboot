
package com.dao;

import org.jooq.Condition;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.domain.Product;
import com.util.Paging;

import sxj.db.tables.records.ProductRecord;
import static sxj.db.Tables.PRODUCT;

import java.util.ArrayList;
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
	
	public Paging<Product> productList(Paging<Product> paging){
		List<Product> list = null;
		List<Condition> conditions = new ArrayList<>();
		if (!StringUtils.isEmpty(paging.getKeyword())) {
			conditions.add(PRODUCT.NAME.like("%"+paging.getKeyword()+"%"));
		}
		conditions.add(PRODUCT.DELETED.eq(0));
		list = dslContext.select().from(PRODUCT).where(conditions).orderBy(PRODUCT.UPDATE_DATE.desc()).limit(paging.offset(), paging.getPageSize()).fetchInto(Product.class);
		int totalCount = dslContext.fetchCount(dslContext.select().from(PRODUCT).where(conditions));
		paging.setList(list);
		paging.setTotalCount(totalCount);
		return paging;
	}
	
}
