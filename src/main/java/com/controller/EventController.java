package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/event")
public class EventController {
	
	
	@RequestMapping("/list")
	String list() {
		return "event/event";
	}
}
