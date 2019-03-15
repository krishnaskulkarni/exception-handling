package com.capgemini.model;

import com.capgemini.exception.AgeNotWithinRangeException;
import com.capgemini.exception.NameNotValidException;

public class Student {

	private String studentName;
	private int rollNo;
	private int age;
	private String course;
	
	

	public Student() {
		super();
	}


	public Student(String studentName, int rollNo, int age, String course) throws NameNotValidException, AgeNotWithinRangeException {
		super();
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.age = age;
		this.course = course;
		if(studentName.matches("^[a-zA-Z\\s]+")) {
			 
		 }
		 else
			 throw new NameNotValidException("INVALID NAME");	 
		
		if (15 <= this.age && this.age <= 21) {
			
		} else
			throw new AgeNotWithinRangeException("Age is naot in the range");
		 
	}
	

	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) throws NameNotValidException {
		this.studentName = studentName;
		if(studentName.matches("^[a-zA-Z\\s]+")) {
			 
		 }
		 else
			 throw new NameNotValidException("INVALID NAME");	 
		 
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) throws AgeNotWithinRangeException {
		this.age = age;

		if (15 <= this.age && this.age <= 21) {
			
		} else
			throw new AgeNotWithinRangeException("Age is naot in the range");
		 
	}

}
