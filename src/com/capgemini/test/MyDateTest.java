package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.exception.InvalidDayException;
import com.capgemini.exception.InvalidMonthException;
import com.capgemini.model.MyDate;

public class MyDateTest {

	@Test(expected = InvalidDayException.class)
	public void testObjectInitializationForDay() throws InvalidDayException, InvalidMonthException {
		MyDate date1 = new MyDate(56,6,2019);
	}

	@Test(expected = InvalidMonthException.class)
	public void testObjectInitializationForMonth() throws InvalidDayException, InvalidMonthException {
		MyDate date12 = new MyDate(5,16,2019);
	}
	
}

