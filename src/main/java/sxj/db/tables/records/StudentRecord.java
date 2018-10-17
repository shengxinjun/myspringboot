/**
 * This class is generated by jOOQ
 */
package sxj.db.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import sxj.db.tables.Student;


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
public class StudentRecord extends UpdatableRecordImpl<StudentRecord> implements Record4<Integer, String, String, Integer> {

    private static final long serialVersionUID = -1591208547;

    /**
     * Setter for <code>test.student.id</code>.
     */
    public StudentRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>test.student.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>test.student.number</code>. 学号
     */
    public StudentRecord setNumber(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>test.student.number</code>. 学号
     */
    public String getNumber() {
        return (String) get(1);
    }

    /**
     * Setter for <code>test.student.name</code>. 姓名
     */
    public StudentRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>test.student.name</code>. 姓名
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>test.student.clazz_id</code>. 所属班级
     */
    public StudentRecord setClazzId(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>test.student.clazz_id</code>. 所属班级
     */
    public Integer getClazzId() {
        return (Integer) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Student.STUDENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Student.STUDENT.NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Student.STUDENT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Student.STUDENT.CLAZZ_ID;
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
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getClazzId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value2(String value) {
        setNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value4(Integer value) {
        setClazzId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord values(Integer value1, String value2, String value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StudentRecord
     */
    public StudentRecord() {
        super(Student.STUDENT);
    }

    /**
     * Create a detached, initialised StudentRecord
     */
    public StudentRecord(Integer id, String number, String name, Integer clazzId) {
        super(Student.STUDENT);

        set(0, id);
        set(1, number);
        set(2, name);
        set(3, clazzId);
    }
}
