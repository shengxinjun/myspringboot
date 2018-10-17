/**
 * This class is generated by jOOQ
 */
package sxj.db.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sxj.db.tables.ExamCon;
import sxj.db.tables.records.ExamConRecord;


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
public class ExamConDao extends DAOImpl<ExamConRecord, sxj.db.tables.pojos.ExamCon, Integer> {

    /**
     * Create a new ExamConDao without any configuration
     */
    public ExamConDao() {
        super(ExamCon.EXAM_CON, sxj.db.tables.pojos.ExamCon.class);
    }

    /**
     * Create a new ExamConDao with an attached configuration
     */
    @Autowired
    public ExamConDao(Configuration configuration) {
        super(ExamCon.EXAM_CON, sxj.db.tables.pojos.ExamCon.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(sxj.db.tables.pojos.ExamCon object) {
        return object.getEid();
    }

    /**
     * Fetch records that have <code>eid IN (values)</code>
     */
    public List<sxj.db.tables.pojos.ExamCon> fetchByEid(Integer... values) {
        return fetch(ExamCon.EXAM_CON.EID, values);
    }

    /**
     * Fetch a unique record that has <code>eid = value</code>
     */
    public sxj.db.tables.pojos.ExamCon fetchOneByEid(Integer value) {
        return fetchOne(ExamCon.EXAM_CON.EID, value);
    }

    /**
     * Fetch records that have <code>coursename IN (values)</code>
     */
    public List<sxj.db.tables.pojos.ExamCon> fetchByCoursename(String... values) {
        return fetch(ExamCon.EXAM_CON.COURSENAME, values);
    }

    /**
     * Fetch records that have <code>exam IN (values)</code>
     */
    public List<sxj.db.tables.pojos.ExamCon> fetchByExam(String... values) {
        return fetch(ExamCon.EXAM_CON.EXAM, values);
    }
}
