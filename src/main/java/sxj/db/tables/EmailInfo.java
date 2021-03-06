/**
 * This class is generated by jOOQ
 */
package sxj.db.tables;


import com.util.Timestamp2DateConverter;

import java.util.Arrays;
import java.util.Date;
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
import sxj.db.tables.records.EmailInfoRecord;


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
public class EmailInfo extends TableImpl<EmailInfoRecord> {

    private static final long serialVersionUID = 1845635318;

    /**
     * The reference instance of <code>test.email_info</code>
     */
    public static final EmailInfo EMAIL_INFO = new EmailInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmailInfoRecord> getRecordType() {
        return EmailInfoRecord.class;
    }

    /**
     * The column <code>test.email_info.id</code>.
     */
    public final TableField<EmailInfoRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.email_info.sender</code>.
     */
    public final TableField<EmailInfoRecord, String> SENDER = createField("sender", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>test.email_info.receiver</code>.
     */
    public final TableField<EmailInfoRecord, String> RECEIVER = createField("receiver", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>test.email_info.context</code>.
     */
    public final TableField<EmailInfoRecord, String> CONTEXT = createField("context", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>test.email_info.code</code>.
     */
    public final TableField<EmailInfoRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>test.email_info.subject</code>.
     */
    public final TableField<EmailInfoRecord, String> SUBJECT = createField("subject", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>test.email_info.send_date</code>.
     */
    public final TableField<EmailInfoRecord, Date> SEND_DATE = createField("send_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new Timestamp2DateConverter());

    /**
     * The column <code>test.email_info.ip</code>.
     */
    public final TableField<EmailInfoRecord, String> IP = createField("ip", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>test.email_info</code> table reference
     */
    public EmailInfo() {
        this("email_info", null);
    }

    /**
     * Create an aliased <code>test.email_info</code> table reference
     */
    public EmailInfo(String alias) {
        this(alias, EMAIL_INFO);
    }

    private EmailInfo(String alias, Table<EmailInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private EmailInfo(String alias, Table<EmailInfoRecord> aliased, Field<?>[] parameters) {
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
    public Identity<EmailInfoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_EMAIL_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EmailInfoRecord> getPrimaryKey() {
        return Keys.KEY_EMAIL_INFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EmailInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<EmailInfoRecord>>asList(Keys.KEY_EMAIL_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailInfo as(String alias) {
        return new EmailInfo(alias, this);
    }

    /**
     * Rename this table
     */
    public EmailInfo rename(String name) {
        return new EmailInfo(name, null);
    }
}
