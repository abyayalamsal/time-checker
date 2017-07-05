package com.marsassignment.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTime {
	@Test
	public void timeConverterTest() {
		// ====
		String city = "NewYork";
		String time = "12:33pm";

		// ====

		TimeModal obj = null;
		obj = new TimeModal(city, time);

		TimeController temp = new TimeController(city, time);
		String newLine = System.getProperty("line.separator");
		Assert.assertEquals(temp.getConvertedTime(obj.getTime(), obj.getCity()),
				"city: KTM" + newLine + "time: " + "12:33" + newLine + "city: New York" + newLine + "time: " + "02:48");
		Assert.assertEquals(temp.getConvertedTime("12:46", "New York"),
				"city: KTM" + newLine + "time: " + "12:46" + newLine + "city: New York" + newLine + "time: " + "03:01");
	}
}
