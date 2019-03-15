package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.exception.InvalidInputException;
import com.capgemini.exception.factorialException;
import com.capgemini.model.Factorial;

public class FactorialTest {

	Factorial factorial ;
	
	@Before
	public void setUp() {
		factorial = new Factorial();
	}
	
	@Test
	public void testGetFactorialWithValidValidInputs() throws InvalidInputException, factorialException {
		assertEquals(120, factorial.getFactorial(5));
		
	}

	@Test(expected = InvalidInputException.class)
	public void testGetFactorialWithInvalidValidInputs() throws InvalidInputException, factorialException {
		factorial.getFactorial(1);
		
	}
	@Test(expected = factorialException.class)
	public void testGetFactorialWithHighestValidInputs() throws InvalidInputException, factorialException {
		factorial.getFactorial(999999999);
		
	}
	
}
