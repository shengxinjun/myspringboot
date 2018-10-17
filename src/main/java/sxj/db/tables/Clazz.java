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
import sxj.db.tables.records.ClazzRecord;


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
public class Clazz extends TableImpl<ClazzRecord> {

    private static final long serialVersionUID = -1285514947;

    /**
     * The reference instance of <code>test.clazz</code>
     */
    public static final Clazz CLAZZ = new Clazz();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClazzRecord> getRecordType() {
        return ClazzRecord.class;
    }

    /**
     * The column <code>test.clazz.id</code>.
     */
    public final TableField<ClazzRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.clazz.name</code>. 班级名称
     */
    public final TableField<ClazzRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "班级名称");

    /**
     * Create a <code>test.clazz</code> table reference
     */
    public Clazz() {
        this("clazz", null);
    }

    /**
     * Create an aliased <code>test.clazz</code> table reference
     */
    public Clazz(String alias) {
        this(alias, CLAZZ);
    }

    private Clazz(String alias, Table<ClazzRecord> aliased) {
        this(alias, aliased, null);
    }

    private Clazz(String alias, Table<ClazzRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ClazzRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CLAZZ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ClazzRecord> getPrimaryKey() {
        return Keys.KEY_CLAZZ_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ClazzRecord>> getKeys() {
        return Arrays.<UniqueKey<ClazzRecord>>asList(Keys.KEY_CLAZZ_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Clazz as(String alias) {
        return new Clazz(alias, this);
    }

    /**
     * Rename this table
     */
    public Clazz rename(String name) {
        return new Clazz(name, null);
    }
}