/**
 * This class is generated by jOOQ
 */
package sxj.db;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import sxj.db.tables.CodeMessage;
import sxj.db.tables.Order;
import sxj.db.tables.Product;


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
public class Test extends SchemaImpl {

    private static final long serialVersionUID = -584629762;

    /**
     * The reference instance of <code>test</code>
     */
    public static final Test TEST = new Test();

    /**
     * The table <code>test.code_message</code>.
     */
    public final CodeMessage CODE_MESSAGE = sxj.db.tables.CodeMessage.CODE_MESSAGE;

    /**
     * The table <code>test.order</code>.
     */
    public final Order ORDER = sxj.db.tables.Order.ORDER;

    /**
     * The table <code>test.product</code>.
     */
    public final Product PRODUCT = sxj.db.tables.Product.PRODUCT;

    /**
     * No further instances allowed
     */
    private Test() {
        super("test", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            CodeMessage.CODE_MESSAGE,
            Order.ORDER,
            Product.PRODUCT);
    }
}
