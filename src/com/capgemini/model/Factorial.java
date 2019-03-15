package com.capgemini.model;

import com.capgemini.exception.InvalidInputException;
import com.capgemini.exception.factorialException;

public class Factorial {

	int number;

	public Factorial() {
		super();

	}

	public Factorial(int number) {
		super();
		this.number = number;
	}

	public long getFactorial(int number) throws InvalidInputException, factorialException {
		long result = 1;

		if (number >= 2) {

			for (int i = number; i > 0; i--) {
				result = result * i;
				if(result > Integer.MAX_VALUE) {
					throw new factorialException("factorial answer exceeds the highest value");
				}
			}
		} else
			throw new InvalidInputException("number is less than two");

		
		
		return result;
	}

}
