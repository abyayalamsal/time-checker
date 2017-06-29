package com.marsassignment.Test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TimeController {

	private int minutes;
	private int hours;
	
	@RequestMapping(value = "/api/v1/time/NewYork", method = RequestMethod.GET)
	@ResponseBody
	public String getTime(
			@RequestParam(value = "time", required = true) String temp,
			@RequestParam(value = "city", required = false) String name){
		String numOnly = temp.substring(0, 4);
		String [] components = numOnly.split(":");
		hours = Integer.parseInt(components[0]);
		minutes = Integer.parseInt(components[1]);
	    int NYHour = hours - 9;
	    if (NYHour < 0){
	    	NYHour = 12 + NYHour;
	    }
	    int NYMinutes = minutes - 45;
	    if (NYMinutes < 0){
	    	NYMinutes = 60 + NYMinutes;
	    }
	    String newLine = System.getProperty("line.separator");
	    return newLine + "city: New York" + newLine + "time: " + NYHour + ":" + NYMinutes;
	}
	
	
}
