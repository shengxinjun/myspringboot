package com.service;

import java.util.List;

import com.domain.Event;

public interface EventService {
	
	List<Event> findEventByUserId(Integer id);
	
	void doAdd(Event event);
	
	Event findEventById(Integer id);
	
	void updateEvent(Event event);
	
	void deleteEventById(Integer id);
}
