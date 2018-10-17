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

import sxj.db.tables.Clazz;
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
@Repository
public class ClazzDao extends DAOImpl<ClazzRecord, sxj.db.tables.pojos.Clazz, Integer> {

    /**
     * Create a new ClazzDao without any configuration
     */
    public ClazzDao() {
        super(Clazz.CLAZZ, sxj.db.tables.pojos.Clazz.class);
    }

    /**
     * Create a new ClazzDao with an attached configuration
     */
    @Autowired
    public ClazzDao(Configuration configuration) {
        super(Clazz.CLAZZ, sxj.db.tables.pojos.Clazz.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(sxj.db.tables.pojos.Clazz object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<sxj.db.tables.pojos.Clazz> fetchById(Integer... values) {
        return fetch(Clazz.CLAZZ.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public sxj.db.tables.pojos.Clazz fetchOneById(Integer value) {
        return fetchOne(Clazz.CLAZZ.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<sxj.db.tables.pojos.Clazz> fetchByName(String... values) {
        return fetch(Clazz.CLAZZ.NAME, values);
    }
}
