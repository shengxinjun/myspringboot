/**
 * This class is generated by jOOQ
 */
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

import com.domain.User;

import sxj.db.tables.records.UserRecord;

import static sxj.db.Tables.USER;;


@Repository
public class UserDao extends DAOImpl<UserRecord, User, Integer> {
	@Autowired
	private DSLContext dslContext;

	public UserDao(Configuration configuration) {
		super(USER, User.class, configuration);
	}

	@Override
	protected Integer getId(User user) {
		// TODO Auto-generated method stub
		return user.getId();
	}
	/****************************************************
	 * 下面是自定义方法
	 ***************************************************************/
	
	/**
	 * 根据手机号码查询user
	 * @param telephone
	 * @return
	 */
	public User findUserByTelephone(String telephone) {
		Condition condition = null;
		if (!StringUtils.isEmpty(telephone)) {
			condition =USER.TELEPHONE.eq(telephone);
		}
		User user = dslContext.select().from(USER).where(condition).fetchOneInto(User.class);
		return user;
	}
	
	/**
	 * 根据邮箱查询user
	 * @param email
	 * @return
	 */
	public User findUserByEmail(String email) {
		Condition condition = null;
		if (!StringUtils.isEmpty(email)) {
			condition =USER.EMAIL.eq(email);
		}
		User user = dslContext.select().from(USER).where(condition).fetchOneInto(User.class);
		return user;
	}
	
}
