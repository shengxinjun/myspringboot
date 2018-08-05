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

import sxj.db.tables.CodeMessage;
import sxj.db.tables.records.CodeMessageRecord;


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
public class CodeMessageDao extends DAOImpl<CodeMessageRecord, sxj.db.tables.pojos.CodeMessage, Integer> {

    /**
     * Create a new CodeMessageDao without any configuration
     */
    public CodeMessageDao() {
        super(CodeMessage.CODE_MESSAGE, sxj.db.tables.pojos.CodeMessage.class);
    }

    /**
     * Create a new CodeMessageDao with an attached configuration
     */
    @Autowired
    public CodeMessageDao(Configuration configuration) {
        super(CodeMessage.CODE_MESSAGE, sxj.db.tables.pojos.CodeMessage.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(sxj.db.tables.pojos.CodeMessage object) {
        return object.getCode();
    }

    /**
     * Fetch records that have <code>code IN (values)</code>
     */
    public List<sxj.db.tables.pojos.CodeMessage> fetchByCode(Integer... values) {
        return fetch(CodeMessage.CODE_MESSAGE.CODE, values);
    }

    /**
     * Fetch a unique record that has <code>code = value</code>
     */
    public sxj.db.tables.pojos.CodeMessage fetchOneByCode(Integer value) {
        return fetchOne(CodeMessage.CODE_MESSAGE.CODE, value);
    }

    /**
     * Fetch records that have <code>message IN (values)</code>
     */
    public List<sxj.db.tables.pojos.CodeMessage> fetchByMessage(String... values) {
        return fetch(CodeMessage.CODE_MESSAGE.MESSAGE, values);
    }
}