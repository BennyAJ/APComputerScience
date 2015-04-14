package com.btp.recursion;

public class NumberAnalyzer {
	public static int getGCD(int x, int y) {
		if(y == 0) //If y is 0 return the final answer
			return x;
		else
			return getGCD(y, x % y); //Euclid's algorithm
	}
	
	public static int getSquare(int number) {
		if(number != 1) //Keep recursing until the number is 1
			return getSquare(number - 1) + 2 * number - 1;
		else
			return 1;
	}
	
	public static boolean isPrimeNumber(int number) {
		
	}
}
