/**
 * This class is generated by jOOQ
 */
package sxj.db.tables.records;


import java.util.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import sxj.db.tables.User;


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
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record9<Integer, String, String, String, String, Date, Date, String, String> {

    private static final long serialVersionUID = -954334986;

    /**
     * Setter for <code>test.user.id</code>.
     */
    public UserRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>test.user.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>test.user.name</code>.
     */
    public UserRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>test.user.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>test.user.password</code>.
     */
    public UserRecord setPassword(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>test.user.password</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>test.user.telephone</code>.
     */
    public UserRecord setTelephone(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>test.user.telephone</code>.
     */
    public String getTelephone() {
        return (String) get(3);
    }

    /**
     * Setter for <code>test.user.imgs</code>.
     */
    public UserRecord setImgs(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>test.user.imgs</code>.
     */
    public String getImgs() {
        return (String) get(4);
    }

    /**
     * Setter for <code>test.user.last_login_date</code>.
     */
    public UserRecord setLastLoginDate(Date value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>test.user.last_login_date</code>.
     */
    public Date getLastLoginDate() {
        return (Date) get(5);
    }

    /**
     * Setter for <code>test.user.register_date</code>.
     */
    public UserRecord setRegisterDate(Date value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>test.user.register_date</code>.
     */
    public Date getRegisterDate() {
        return (Date) get(6);
    }

    /**
     * Setter for <code>test.user.email</code>.
     */
    public UserRecord setEmail(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>test.user.email</code>.
     */
    public String getEmail() {
        return (String) get(7);
    }

    /**
     * Setter for <code>test.user.role</code>.
     */
    public UserRecord setRole(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>test.user.role</code>.
     */
    public String getRole() {
        return (String) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, String, Date, Date, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, String, Date, Date, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return User.USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return User.USER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return User.USER.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return User.USER.TELEPHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return User.USER.IMGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field6() {
        return User.USER.LAST_LOGIN_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field7() {
        return User.USER.REGISTER_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return User.USER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return User.USER.ROLE;
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
    public String value3() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTelephone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getImgs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value6() {
        return getLastLoginDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value7() {
        return getRegisterDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value3(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value4(String value) {
        setTelephone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value5(String value) {
        setImgs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value6(Date value) {
        setLastLoginDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value7(Date value) {
        setRegisterDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value8(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value9(String value) {
        setRole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord values(Integer value1, String value2, String value3, String value4, String value5, Date value6, Date value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(Integer id, String name, String password, String telephone, String imgs, Date lastLoginDate, Date registerDate, String email, String role) {
        super(User.USER);

        set(0, id);
        set(1, name);
        set(2, password);
        set(3, telephone);
        set(4, imgs);
        set(5, lastLoginDate);
        set(6, registerDate);
        set(7, email);
        set(8, role);
    }
}
