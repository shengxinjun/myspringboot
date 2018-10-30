package com.dao;

import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.domain.OrderItem;

import static sxj.db.Tables.ORDER_ITEM;

import java.util.List;

import sxj.db.tables.records.OrderItemRecord;

@Repository
public class OrderItemDao extends DAOImpl<OrderItemRecord,OrderItem, Integer> {
	

	@Autowired
	private DSLContext dslContext;
	
    @Autowired
    public OrderItemDao(Configuration configuration) {
        super(ORDER_ITEM, OrderItem.class, configuration);
    }
    @Override
    protected Integer getId(OrderItem orderItem) {
        return orderItem.getId();
    }
    
    public Integer insertAndReturnId(OrderItem orderItem) {
    	OrderItemRecord record = dslContext.newRecord(ORDER_ITEM,orderItem);
    	record.insert();
    	return record.getId();
    }

    public List<OrderItem> findItemsByOrderId(Integer orderId){
    	
    	return dslContext.select().from(ORDER_ITEM).where(ORDER_ITEM.ORDER_ID.eq(orderId)).fetchInto(OrderItem.class);
    }
    
    public void deleteByOrderId(Integer orderId) {
    	dslContext.deleteFrom(ORDER_ITEM).where(ORDER_ITEM.ORDER_ID.eq(orderId));
    }
}
