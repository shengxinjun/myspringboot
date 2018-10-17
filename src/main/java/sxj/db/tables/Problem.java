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
import sxj.db.tables.records.ProblemRecord;


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
public class Problem extends TableImpl<ProblemRecord> {

    private static final long serialVersionUID = 93784789;

    /**
     * The reference instance of <code>test.problem</code>
     */
    public static final Problem PROBLEM = new Problem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProblemRecord> getRecordType() {
        return ProblemRecord.class;
    }

    /**
     * The column <code>test.problem.id</code>.
     */
    public final TableField<ProblemRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.problem.name</code>. 问题名称
     */
    public final TableField<ProblemRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "问题名称");

    /**
     * The column <code>test.problem.score</code>. ??
     */
    public final TableField<ProblemRecord, Double> SCORE = createField("score", org.jooq.impl.SQLDataType.FLOAT, this, "??");

    /**
     * The column <code>test.problem.course_id</code>. course_id
     */
    public final TableField<ProblemRecord, Integer> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.INTEGER, this, "course_id");

    /**
     * The column <code>test.problem.student_id</code>. student_id
     */
    public final TableField<ProblemRecord, Integer> STUDENT_ID = createField("student_id", org.jooq.impl.SQLDataType.INTEGER, this, "student_id");

    /**
     * The column <code>test.problem.question_id</code>. ??question
     */
    public final TableField<ProblemRecord, Integer> QUESTION_ID = createField("question_id", org.jooq.impl.SQLDataType.INTEGER, this, "??question");

    /**
     * The column <code>test.problem.weight</code>. ??
     */
    public final TableField<ProblemRecord, Double> WEIGHT = createField("weight", org.jooq.impl.SQLDataType.FLOAT, this, "??");

    /**
     * Create a <code>test.problem</code> table reference
     */
    public Problem() {
        this("problem", null);
    }

    /**
     * Create an aliased <code>test.problem</code> table reference
     */
    public Problem(String alias) {
        this(alias, PROBLEM);
    }

    private Problem(String alias, Table<ProblemRecord> aliased) {
        this(alias, aliased, null);
    }

    private Problem(String alias, Table<ProblemRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ProblemRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PROBLEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProblemRecord> getPrimaryKey() {
        return Keys.KEY_PROBLEM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProblemRecord>> getKeys() {
        return Arrays.<UniqueKey<ProblemRecord>>asList(Keys.KEY_PROBLEM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Problem as(String alias) {
        return new Problem(alias, this);
    }

    /**
     * Rename this table
     */
    public Problem rename(String name) {
        return new Problem(name, null);
    }
}
