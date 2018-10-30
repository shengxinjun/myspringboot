/**
 * This class is generated by jOOQ
 */
package sxj.db.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import sxj.db.Keys;
import sxj.db.Test;
import sxj.db.tables.records.OrderItemRecord;


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
public class OrderItem extends TableImpl<OrderItemRecord> {

    private static final long serialVersionUID = 817869472;

    /**
     * The reference instance of <code>test.order_item</code>
     */
    public static final OrderItem ORDER_ITEM = new OrderItem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderItemRecord> getRecordType() {
        return OrderItemRecord.class;
    }

    /**
     * The column <code>test.order_item.id</code>.
     */
    public final TableField<OrderItemRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.order_item.imgs</code>.
     */
    public final TableField<OrderItemRecord, String> IMGS = createField("imgs", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>test.order_item.description</code>.
     */
    public final TableField<OrderItemRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>test.order_item.name</code>.
     */
    public final TableField<OrderItemRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>test.order_item.price</code>.
     */
    public final TableField<OrderItemRecord, Double> PRICE = createField("price", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>test.order_item.type</code>.
     */
    public final TableField<OrderItemRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>test.order_item.order_id</code>.
     */
    public final TableField<OrderItemRecord, Integer> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>test.order_item</code> table reference
     */
    public OrderItem() {
        this("order_item", null);
    }

    /**
     * Create an aliased <code>test.order_item</code> table reference
     */
    public OrderItem(String alias) {
        this(alias, ORDER_ITEM);
    }

    private OrderItem(String alias, Table<OrderItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrderItem(String alias, Table<OrderItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Test.TEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OrderItemRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ORDER_ITEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OrderItemRecord> getPrimaryKey() {
        return Keys.KEY_ORDER_ITEM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrderItemRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderItemRecord>>asList(Keys.KEY_ORDER_ITEM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderItem as(String alias) {
        return new OrderItem(alias, this);
    }

    /**
     * Rename this table
     */
    public OrderItem rename(String name) {
        return new OrderItem(name, null);
    }
}
