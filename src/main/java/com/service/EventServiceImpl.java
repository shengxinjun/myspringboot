package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EventDao;
import com.domain.Event;

@Service
public class EventServiceImpl implements EventService{
	
	
	@Autowired
	private EventDao eventDao;
	@Override
	public List<Event> findEventByUserId(Integer id) {
		// TODO Auto-generated method stub
		return eventDao.findEventByUserId(id);
	}

}
