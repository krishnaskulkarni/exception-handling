package com.capgemini.model;

import com.capgemini.exception.InvalidDayException;
import com.capgemini.exception.InvalidMonthException;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private static int monthArray[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	
	public MyDate() {
		super();
	}
	
	public MyDate(int day, int month, int year) throws InvalidDayException, InvalidMonthException {
	//	super();
		this.day = day;
		this.month = month;
		this.year = year;
		
		
		if(this.month > 12 || this.month <1) {
			throw new InvalidMonthException("INVALID MONTH");
		}
		if(this.day > monthArray[this.month] || this.day < 1 ) {
			throw new InvalidDayException("INVALID DATE");
		}
		
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	

}
