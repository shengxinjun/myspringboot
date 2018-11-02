package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.domain.Event;
import com.service.EventService;

@Controller
@RequestMapping("/event")
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@RequestMapping("/list")
	String list(@CookieValue("uid")  Integer userId,Model model) {
		
		List<Event> events = eventService.findEventByUserId(userId);
		model.addAttribute("events", events.toString());
		
		return "event/event";
	}
}
