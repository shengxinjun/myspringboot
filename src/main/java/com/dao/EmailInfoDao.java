package com.dao;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.domain.EmailInfo;

import sxj.db.tables.records.EmailInfoRecord;

import static sxj.db.Tables.EMAIL_INFO;;
@Repository
public class EmailInfoDao extends DAOImpl<EmailInfoRecord,EmailInfo, Integer> {


    @Autowired
    public EmailInfoDao(Configuration configuration) {
        super(EMAIL_INFO, EmailInfo.class, configuration);
    }

    @Override
    protected Integer getId(EmailInfo emailInfo) {
        return emailInfo.getId();
    }

    
}
