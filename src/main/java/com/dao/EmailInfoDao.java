package com.dao;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Condition;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.domain.EmailInfo;

import sxj.db.tables.records.EmailInfoRecord;

import static sxj.db.Tables.EMAIL_INFO;;
@Repository
public class EmailInfoDao extends DAOImpl<EmailInfoRecord,EmailInfo, Integer> {

	@Autowired
	private DSLContext dslContext;
	
    @Autowired
    public EmailInfoDao(Configuration configuration) {
        super(EMAIL_INFO, EmailInfo.class, configuration);
    }

    @Override
    protected Integer getId(EmailInfo emailInfo) {
        return emailInfo.getId();
    } 
    
    
    /****************************************************
	 * 下面是自定义方法
	 ***************************************************************/
    
    /**
     * 通过收件邮箱查询最新一条邮件
     * @param email
     * @return
     */
    public EmailInfo getEmailInfoByEmail(String email) {
    	Condition condition = null;
    	if (!StringUtils.isEmpty(email)) {
			condition = EMAIL_INFO.RECEIVER.eq(email);
		}
    	return dslContext.select().from(EMAIL_INFO).where(condition).orderBy(EMAIL_INFO.SEND_DATE.desc()).limit(1).fetchOneInto(EmailInfo.class);
    }
}
