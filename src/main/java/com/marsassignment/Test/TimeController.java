package com.marsassignment.Test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TimeController {
	
	private String strMinutes;
	private String strHours;

	private int minutes;
	private int hours;
	

	public TimeController(String strMinutes, String strHours) {
		this.setStrMinutes(strMinutes);
		this.setStrHours(strHours);
	}


	@RequestMapping(value = "/api/v1/time/NewYork", method = RequestMethod.GET)
	@ResponseBody
	public String getConvertedTime(
			@RequestParam(value = "time", required = true) String temp,
			@RequestParam(value = "city", required = false) String name){
		
		String numOnly = temp.substring(0, 5);
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
	    	NYHour -= 1;
	    }
	    
	    String strMin = Integer.toString(NYMinutes);
	    String strHr = Integer.toString(NYHour);
	    if (strMin.length() == 1){
	    	strMin = "0" + strMin;
	    }
	    if (strHr.length() == 1){
	    	strHr = "0" + strHr;
	    }
	    
	    String newLine = System.getProperty("line.separator");
	    return "city: KTM" + newLine + "time: " + numOnly + newLine + "city: New York" + newLine + "time: " + strHr + ":" + strMin;
	}


	public String getStrMinutes() {
		return strMinutes;
	}


	public void setStrMinutes(String strMinutes) {
		this.strMinutes = strMinutes;
	}


	public String getStrHours() {
		return strHours;
	}


	public void setStrHours(String strHours) {
		this.strHours = strHours;
	}
	
	
}
