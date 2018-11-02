package com.service;

import java.util.List;

import com.domain.Event;

public interface EventService {
	
	List<Event> findEventByUserId(Integer id);
	
}
