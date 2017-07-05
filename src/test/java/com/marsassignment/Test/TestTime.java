package com.marsassignment.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTime {
  @Test
  public void timeConverterTest() {
	  String city = "NewYork";
	  String time = "11:35pm";
	  
	  TimeModal obj = null;
	  obj = new TimeModal(city, time);
	  
	  TimeController temp = new TimeController(city, time);
	  String newLine = System.getProperty("line.separator");
	  Assert.assertEquals(temp.getConvertedTime(obj.getTime(), obj.getCity()), 
			  "city: KTM" + newLine + "time: " + "11:35" + newLine + "city: New York" + newLine + "time: " + "2:50");
  }
}
