/**
 * This class is generated by jOOQ
 */
package sxj.db.tables.records;


import java.util.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import sxj.db.tables.Order;


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
public class OrderRecord extends UpdatableRecordImpl<OrderRecord> implements Record6<Integer, String, Double, Integer, Integer, Date> {

    private static final long serialVersionUID = -1973147687;

    /**
     * Setter for <code>test.order.id</code>.
     */
    public OrderRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>test.order.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>test.order.name</code>.
     */
    public OrderRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>test.order.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>test.order.total_price</code>.
     */
    public OrderRecord setTotalPrice(Double value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>test.order.total_price</code>.
     */
    public Double getTotalPrice() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>test.order.user_id</code>.
     */
    public OrderRecord setUserId(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>test.order.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>test.order.deleted</code>.
     */
    public OrderRecord setDeleted(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>test.order.deleted</code>.
     */
    public Integer getDeleted() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>test.order.date</code>.
     */
    public OrderRecord setDate(Date value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>test.order.date</code>.
     */
    public Date getDate() {
        return (Date) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, Double, Integer, Integer, Date> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, Double, Integer, Integer, Date> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Order.ORDER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Order.ORDER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return Order.ORDER.TOTAL_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Order.ORDER.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Order.ORDER.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field6() {
        return Order.ORDER.DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value3() {
        return getTotalPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value6() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRecord value3(Double value) {
        setTotalPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRecord value4(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRecord value5(Integer value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRecord value6(Date value) {
        setDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRecord values(Integer value1, String value2, Double value3, Integer value4, Integer value5, Date value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderRecord
     */
    public OrderRecord() {
        super(Order.ORDER);
    }

    /**
     * Create a detached, initialised OrderRecord
     */
    public OrderRecord(Integer id, String name, Double totalPrice, Integer userId, Integer deleted, Date date) {
        super(Order.ORDER);

        set(0, id);
        set(1, name);
        set(2, totalPrice);
        set(3, userId);
        set(4, deleted);
        set(5, date);
    }
}
