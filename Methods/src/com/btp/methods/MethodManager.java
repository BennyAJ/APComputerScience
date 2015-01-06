package com.btp.methods;

import java.util.Random;

public class MethodManager {
	public static void rollDice(int[] diceArray, int rolls) {
		Random rand = new Random(); //Random number generator
		for(int i = 0; i < diceArray.length; i++)
			diceArray[i] = 0; //Resets the array to 0
		
		for(int i = 0; i < rolls; i++) //Runs for amount of rolls the user chose
			diceArray[rand.nextInt(6)]++; //Increments a random value between 0 and 5
	}
	
	public static void displayDiceRolls(int[] diceArray) {
		System.out.println("The results of the dice rolls were:");
		for(int i = 0; i < diceArray.length; i++) //Increments through array
			System.out.println((i + 1) + " = " + diceArray[i]); //Print results
	}
	
	public static int getPower(int num, int exponent) {
		int initialNum = num; //Saves the number to be multiplied by
		for(int i = 1; i < exponent; i++) //Runs for as many times as exponent says
			num *= initialNum; //Multiplies num by the initial num
		
		return num; //Returns the power
	}
	
	public static double getHypotenuse(int side1, int side2) {
		return Math.sqrt((side1 * side1) + (side2 * side2)); //c^2 = a^2 + b^2
	}
	
	public static boolean isEven(int num) {
		if(num % 2 == 0) //If number is divisible by 2
			return true; //Return true
		return false; //Return false otherwise
	}
	
	public static double getSide(int side, int hypotenuse) {
		return Math.sqrt((hypotenuse * hypotenuse) - (side * side)); //b^2 = c^2 - a^2
	}
	
	public static float roundDecimal(float num, int places) {
		num *= Math.pow(10, places); //Move decimal point x amount of places
		num += .5f; //Add .5 to cause it to round up if greater than .5
		num = (int) num; //Truncate everything after the decimal place
		num /= Math.pow(10, places); //Move decimal back to the start point
		
		return num;
	}
	
	public static float celsiusToFahrenheit(float celsius) {
		return ((celsius * 1.8f) + 32); //F = 9/5 * C + 32
	}
	
	public static float fahrenheitToCelsius(float fahrenheit) {
		return ((fahrenheit - 32) * 5) / 9; //C = (F - 32) * 5/9 
	}
	
	public static boolean isPrime(int num) {
		if (num == 2) //Checks for the only even prime number
			return true;
		else if(num % 2 == 0) //Checks if num is even
			return false; //No even number other than 2 is prime
		
		for(int i = 3; i < num; i += 2) //Skips 1, skips evens, ends before num
			if(num % i == 0) //If divisible by any num below it
				return false; //Number is not prime
		return true; //Number is prime otherwise
	}
	
	public static boolean isMultiple(int num1, int num2) {
		if(num1 % num2 == 0) //If second num can be evenly divided into first
			return true; //It's a multiple
		return false; //Return false otherwise
	}
	
	public static String reverseString(String inputString) {
		String tempString = "";
		for(int i = inputString.length() - 1; i >= 0; i--) //Iterate in reverse order
			tempString += inputString.charAt(i); //Load inputString into new string backwards
		return tempString; //Return new backwards string
	}
	
	public static boolean isArmstrongNum(int num) { //Compatible with any amount of digits
		int tempNum = 0;
		int highestPlace = 1;
		int numLength = 1;
		
		while((num / highestPlace) > 10) { //Runs until finding length of int
			highestPlace *= 10; //Used for loop and as divisor, saves us from using pow every iteration
			numLength++; //Amount of digits in number, used for pow function
		}
		
		for(int i = 1; i <= highestPlace; i *= 10) //Runs once for each place in the num
			tempNum += Math.pow((num / i) % 10, numLength); //Puts place to power of amount of digits
		
		if(tempNum == num) //Checks if new num is equal to original num
			return true; //If it is it's an armstrong number
		return false; //Return false otherwise
		
		
	}
}
