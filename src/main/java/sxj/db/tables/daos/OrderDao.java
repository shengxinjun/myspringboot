/**
 * This class is generated by jOOQ
 */
package sxj.db.tables.daos;


import java.sql.Date;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sxj.db.tables.Order;
import sxj.db.tables.records.OrderRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class OrderDao extends DAOImpl<OrderRecord, sxj.db.tables.pojos.Order, Integer> {

    /**
     * Create a new OrderDao without any configuration
     */
    public OrderDao() {
        super(Order.ORDER, sxj.db.tables.pojos.Order.class);
    }

    /**
     * Create a new OrderDao with an attached configuration
     */
    @Autowired
    public OrderDao(Configuration configuration) {
        super(Order.ORDER, sxj.db.tables.pojos.Order.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(sxj.db.tables.pojos.Order object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<sxj.db.tables.pojos.Order> fetchById(Integer... values) {
        return fetch(Order.ORDER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public sxj.db.tables.pojos.Order fetchOneById(Integer value) {
        return fetchOne(Order.ORDER.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<sxj.db.tables.pojos.Order> fetchByName(String... values) {
        return fetch(Order.ORDER.NAME, values);
    }

    /**
     * Fetch records that have <code>total_price IN (values)</code>
     */
    public List<sxj.db.tables.pojos.Order> fetchByTotalPrice(Double... values) {
        return fetch(Order.ORDER.TOTAL_PRICE, values);
    }

    /**
     * Fetch records that have <code>desc IN (values)</code>
     */
    public List<sxj.db.tables.pojos.Order> fetchByDesc(String... values) {
        return fetch(Order.ORDER.DESC, values);
    }

    /**
     * Fetch records that have <code>date IN (values)</code>
     */
    public List<sxj.db.tables.pojos.Order> fetchByDate(Date... values) {
        return fetch(Order.ORDER.DATE, values);
    }
}
