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
	@Override
	public void doAdd(Event event) {
		eventDao.insert(event);
		
	}
	@Override
	public Event findEventById(Integer id) {
		// TODO Auto-generated method stub
		return eventDao.findById(id);
	}
	@Override
	public void updateEvent(Event event) {
		eventDao.update(event);
	}
	@Override
	public void deleteEventById(Integer id) {
		eventDao.deleteById(id);
	}

}
