package com.btp.recursion;

public class Main {

	public static void main(String[] args) {
		int temp = BinaryConverter.binaryToInteger(1001010, 0);
		System.out.println(1001010 + " = " + temp);
		System.out.println(temp + " = " + BinaryConverter.integerToBinary(temp));
		System.out.print("Compound interest of $500 in 10 years with 10% interest = ");
		System.out.println(FinanceManager.getCompoundInterest(.1f, 500, 10));
		System.out.println("GCD of 10 and 20 = " + NumberAnalyzer.getGCD(20, 10));
		System.out.println("Square of 5 = " + NumberAnalyzer.getSquare(5));
		System.out.println("7 is a prime number = " + NumberAnalyzer.isPrimeNumber(7, 6));
		System.out.println("12 is a prime number = " + NumberAnalyzer.isPrimeNumber(12, 11));
		int[] tempArray = new int[] {1,2,3,4,5};
		System.out.println("Sum of array of 1 - 5  = " + NumberAnalyzer.getSum(tempArray, 0));
		System.out.println("Square root of 25 = " + NumberAnalyzer.getSqrt(25, 10));
		System.out.println("5! = " + NumberAnalyzer.getFactorial(5));
		System.out.println("Permutations of 10 people picked 3 at a time = " + NumberAnalyzer.getPermutations(10, 3));
		System.out.println("Elephant reversed = " + String.valueOf(StringReverser.reverseBounds("Elephant".toCharArray(), 0, 7)));
		System.out.println("racecar is a palindrome = " + StringReverser.isPalindrome("racecar"));
		System.out.println("elephant is a palindrome = " + StringReverser.isPalindrome("elephant"));
	}

}
