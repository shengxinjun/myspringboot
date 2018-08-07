/**
 * This class is generated by jOOQ
 */
package com.dao;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.CodeMessage;
import sxj.db.tables.records.CodeMessageRecord;
import static sxj.db.Tables.CODE_MESSAGE;

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
public class CodeMessageDao extends DAOImpl<CodeMessageRecord,CodeMessage, Integer> {


    /**
     * Create a new CodeMessageDao with an attached configuration
     */
    @Autowired
    public CodeMessageDao(Configuration configuration) {
        super(CODE_MESSAGE, CodeMessage.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(CodeMessage object) {
        return object.getCode();
    }

    
}
