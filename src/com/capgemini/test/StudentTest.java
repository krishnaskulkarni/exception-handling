package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.exception.AgeNotWithinRangeException;
import com.capgemini.exception.NameNotValidException;
import com.capgemini.model.Student;

public class StudentTest {
	

	@Test(expected = AgeNotWithinRangeException.class)
	public void testAgeValidateWithValidInput() throws AgeNotWithinRangeException, NameNotValidException {
		Student student = new Student("john doe",1,26,"arts");
		
	}
	
	@Test(expected = AgeNotWithinRangeException.class)
	public void testAgeValidateWithInvalidInput() throws AgeNotWithinRangeException, NameNotValidException {
		Student student = new Student("john doe",1,30,"arts");
		
	}

	@Test(expected = NameNotValidException.class)
	public void testSetStudentNameWithInvalidInput() throws NameNotValidException {
		Student student = new Student();
		student.setStudentName("$%krish");
	}
	
	@Test(expected = AgeNotWithinRangeException.class)
	public void testSetAgeWithInvalidInput() throws AgeNotWithinRangeException {
		Student student = new Student();
		student.setAge(56);
	}
	
	@Test
	public void testAgeWithValidInput() throws AgeNotWithinRangeException, NameNotValidException {
		Student student = new Student("john doe",1,18,"arts");
		assertEquals(18, student.getAge());
	}
	
	@Test
	public void testNameWithValidInput() throws AgeNotWithinRangeException, NameNotValidException {
		Student student = new Student("john doe",1,18,"arts");
		assertEquals("john doe", student.getStudentName());
	}
}
