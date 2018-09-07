package com.dao;


import java.text.ParseException;
import java.util.Date;
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
import com.google.common.collect.Lists;
import com.util.DateUtil;

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
    /**
     * 计算date这一天这个ip共发送了多少邮件
     * @param ip
     * @return
     * @throws ParseException 
     */
    public Integer countEmailInfoByIpAndDate(String ip,Date date)  {
    	List<Condition> conditions = Lists.newArrayList();
    	if (!StringUtils.isEmpty(ip)) {
			conditions.add(EMAIL_INFO.IP.eq(ip));
		}
    	if (date==null) {
    		date = new Date();
		}
		try {
			conditions.add(EMAIL_INFO.SEND_DATE.ge(DateUtil.date(DateUtil.date(date))));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return dslContext.fetchCount(dslContext.select().from(EMAIL_INFO).where(conditions));
    }
    
    
}
