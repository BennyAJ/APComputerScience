package com.btp.romannumerals;

public class RomanConverter {
	
	private static String convertPlaceToRoman(int num, char low, char mid, char high) {
		String tempNumeral = "";
		if(num < 4) //If the digit is 1-3
			for(int i = 0; i < num; i++)
				tempNumeral += low; //Add a low numeral for each 1 of the digit
		
		else if(num == 4) //If the digit is 4
			tempNumeral += "" + low + mid; //Add a low numeral subtracted from a mid
		
		else if(num < 9) { //If 4 < digit < 9
			tempNumeral += mid; //Add a mid numeral
			for(int i = 0; i < num - 5; i++)
				tempNumeral += low; //Add a low for every remaining 1 of the digit
		}
		
		else //If the hundreds digit is 9
			tempNumeral += "" + low + high; //Add a low numeral subtracted from a high
		
		return tempNumeral;
	}
	
	public static String toRomanNumerals(int arabicNum) {
		int tempNum = 0;
		String romanNumeral = "";
		char lowDigit = ' '; //Holds the smallest letter used for a place(100's, 10's, 1's)
		char midDigit = ' '; //Holds medium letter used for a place(500's, 50's, 5's)
		char highDigit = ' '; //Holds highest letter used for a place(1000's, 100's, 10's)
		
		if(arabicNum >= 1000) {
			tempNum =  (arabicNum / 1000) % 10;
			lowDigit = 'M'; //Only num needed is 1000
			romanNumeral += convertPlaceToRoman(tempNum, lowDigit, midDigit, highDigit);
			//Gets a Roman numeral from the number in this place and given characters
		}
		
		if(arabicNum >= 100) {
			tempNum = (arabicNum / 100) % 10; //Isolate hundreds digit
			lowDigit = 'C'; //uses 100
			midDigit = 'D'; //uses 500
			highDigit = 'M'; //uses 1000
			romanNumeral += convertPlaceToRoman(tempNum, lowDigit, midDigit, highDigit);
			//Gets a Roman numeral from the number in this place and given characters
		}
		
		if(arabicNum >= 10) {
			tempNum = (arabicNum / 10) % 10; //Isolate tens digit
			lowDigit = 'X'; //Uses 10
			midDigit = 'L'; //Uses 50
			highDigit = 'C'; //Uses 100
			romanNumeral += convertPlaceToRoman(tempNum, lowDigit, midDigit, highDigit);
			//Gets a Roman numeral from the number in this place and given characters
		}
		
		if(arabicNum >= 1) {
			tempNum = arabicNum % 10; //Isolate ones digit
			lowDigit = 'I'; //Uses 1
			midDigit = 'V'; //Uses 5
			highDigit = 'X'; //Uses 10
			romanNumeral += convertPlaceToRoman(tempNum, lowDigit, midDigit, highDigit);
			//Gets a Roman numeral from the number in this place and given characters
		}
		return romanNumeral;
	}
	
	private static int getNumeralValue(char numeral) {
		switch (numeral) { //Outputs int based on input numeral
			case 'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 10;
			case 'L':
				return 50;
			case 'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000;
		}
		
		return 0; //Return 0 if the char is invalid
	}
	
	public static int toArabicNum(String numeral) {
		int arabicNum = 0; //Holds final num
		
		//If the current number is smaller than the following number then it's a subtractor
		//If the current number is larger or the same as the following number then it's an adder
		
		for(int i = 0; i < numeral.length() - 1; i++) {
				if(getNumeralValue(numeral.charAt(i)) >= getNumeralValue(numeral.charAt(i + 1)))
					arabicNum += getNumeralValue(numeral.charAt(i));
					//If number is an adder then add its value to the arabic num
				else
					arabicNum -= getNumeralValue(numeral.charAt(i));
					//If number is a subtractor then subtract it from the arabic num
		}
		arabicNum += getNumeralValue(numeral.charAt(numeral.length() - 1));
		//Adds the last numeral since it will always be added so it doesn't need a check
		
		return arabicNum; //Returns the arabic num
	}
}
