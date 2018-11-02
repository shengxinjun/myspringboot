package com.dao;

import org.jooq.Condition;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.domain.Event;

import sxj.db.tables.records.EventRecord;
import static sxj.db.Tables.EVENT;

import java.util.ArrayList;
import java.util.List;
@Repository
public class EventDao extends DAOImpl<EventRecord,Event, Integer>{
	
	@Autowired
	private DSLContext dslContext;
	
	@Autowired
    public EventDao(Configuration configuration) {
        super(EVENT, Event.class, configuration);
    }

    @Override
    protected Integer getId(Event event) {
        return event.getId();
    } 
    
    
    public List<Event> findEventByUserId(Integer userId) {
    	List<Condition> conditions  = new ArrayList<>();
    	if (null != userId) {
			conditions.add(EVENT.USER_ID.eq(userId));
		}
    	return dslContext.select().from(EVENT).where(conditions).fetchInto(Event.class);
    }
	
}
