package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.Event;
import com.google.gson.Gson;
import com.model.Result;
import com.service.EventService;
import com.util.DateUtil;

@Controller
@RequestMapping("/event")
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@RequestMapping("/list")
	String list(@CookieValue("uid")  Integer userId,Model model) {
		
		List<Event> events = eventService.findEventByUserId(userId);
		/*String eventStr = "[";
		for(Event event :events) {
			eventStr+="{";
			eventStr+="title:'"+event.getTitle()+"',";
			eventStr+="start:new Date(2018,11,6),";
			eventStr+="className:'"+event.getClassName()+"'";
			eventStr+="},";
		}
		eventStr+="]";
		model.addAttribute("eventStr", eventStr);*/
		model.addAttribute("events", events);
		
		return "event/event";
	}
	
	@ResponseBody
	@RequestMapping("/doAdd")
	Result doAdd(@CookieValue("uid")Integer userId,String eventStr) {
		Result result = new Result();
		Gson gson = new Gson();
		Event event = gson.fromJson(eventStr,Event.class);
		String date = event.getStart();
		date = date.replace("Z", " UTC");//注意是空格+UTC
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");//注意格式化的表达式
		try {
			Date d = format.parse(date);
			event.setStart(DateUtil.dateTime(d));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		event.setUserId(userId);
		try {
			eventService.doAdd(event);
			result.setCode(1);
		} catch (Exception e) {
			result.setCode(500);
		}
		return result;
	}
}
