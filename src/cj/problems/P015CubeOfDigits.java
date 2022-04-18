package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P015CubeOfDigits {
	
	// Given an integer number, find the cube of each digit.
	// Ex -> 152 - (1 ^ 3), (5 ^ 3), (2 ^ 3) = 1, 125, 8.
	// Hint: 1. Count the number of digits and create an array based on 
	//          the number of digits.
	//       2. Split the digits, then cube the number and 
	//          store them in the array in the respective position.
	private static int[] cubeOfDigits(int number) {
		
		// write code here.
		
		return null;
	}

	@Test
	void test() {
		int[] numbers = {1, 125, 8};
		assertEquals(numbers, cubeOfDigits(152));
	}

}
