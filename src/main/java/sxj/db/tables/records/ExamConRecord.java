/**
 * This class is generated by jOOQ
 */
package sxj.db.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import sxj.db.tables.ExamCon;


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
public class ExamConRecord extends UpdatableRecordImpl<ExamConRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = -866897915;

    /**
     * Setter for <code>test.exam_con.eid</code>.
     */
    public ExamConRecord setEid(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>test.exam_con.eid</code>.
     */
    public Integer getEid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>test.exam_con.coursename</code>.
     */
    public ExamConRecord setCoursename(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>test.exam_con.coursename</code>.
     */
    public String getCoursename() {
        return (String) get(1);
    }

    /**
     * Setter for <code>test.exam_con.exam</code>.
     */
    public ExamConRecord setExam(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>test.exam_con.exam</code>.
     */
    public String getExam() {
        return (String) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ExamCon.EXAM_CON.EID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ExamCon.EXAM_CON.COURSENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ExamCon.EXAM_CON.EXAM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getEid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCoursename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getExam();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExamConRecord value1(Integer value) {
        setEid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExamConRecord value2(String value) {
        setCoursename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExamConRecord value3(String value) {
        setExam(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExamConRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ExamConRecord
     */
    public ExamConRecord() {
        super(ExamCon.EXAM_CON);
    }

    /**
     * Create a detached, initialised ExamConRecord
     */
    public ExamConRecord(Integer eid, String coursename, String exam) {
        super(ExamCon.EXAM_CON);

        set(0, eid);
        set(1, coursename);
        set(2, exam);
    }
}
