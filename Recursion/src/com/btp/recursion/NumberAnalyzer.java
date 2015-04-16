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
	
	public static boolean isPrimeNumber(int number, int divisor) {
		if(divisor == 1) //If it reaches 1 without returning false it is prime
			return true;
		else if((number % divisor) == 0)
			return false; //If any divisor other than 1 works it is not prime
		else
			return isPrimeNumber(number, divisor - 1); //Decrement divisor and run again
	}
	
	public static int getSum(int[] array, int index) {
		if(index == array.length) 
			return 0; //Return 0 when the whole array has been read
		else
			return array[index] + getSum(array, index + 1); //Add next entry to sum
	}
	
	public static float getSqrt(float number, float estimate) {
		float quotient = number/estimate;
		if(Math.abs(estimate - quotient) > .005) //Run again until estimate is close enough
			return getSqrt(number, (estimate + quotient)/2);
		else
			return estimate; //Return final estimate when it is close enough
	}
	
	public static double getFactorial(int number) {
		if(number > 1) //Multiply by each number until reaching 1
			return number * getFactorial(number - 1);
		else
			return 1; //End recursion by multiplying by 1 instead of recalling function
	}
	
	public static int getPermutations(int n, int r) {
		return (int) (getFactorial(n)/getFactorial(n - r)); // n!/(n-r)!
	}
}
