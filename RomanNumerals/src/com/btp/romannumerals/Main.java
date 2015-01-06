package com.btp.romannumerals;


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////Benny Johnson Roman Numerals WS////////////////////////////////////////////////////////
///////////////////////////////////////Completed 9/29/2014////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Main {
	public static void main(String[] args) {
		int tempNum = 0; //Holds number input
		String tempString = ""; //Holds string input
		
		do {
			printMenu(); //Prints menu
			tempNum = InputManager.getNumInput(""); //Gets input for selection
			
			switch(tempNum) {
				case 1:
					tempNum = InputManager.getNumInput("Input a number to convert"); //Get num
					System.out.print("This number is equal to ");
					System.out.println(RomanConverter.toRomanNumerals(tempNum)); //Prints numeral
					break;
				case 2:
					tempString = InputManager.getStringInput("Input a numeral to convert"); //Get numeral
					System.out.print("This numeral is equal to ");
					System.out.println(RomanConverter.toArabicNum(tempString)); //Prints num
					break;
			}
			InputManager.waitForInput("Press any key to return to the menu");
		} while(tempNum != 3); //Runs until the user inputs 3 to end the program
	}
	
	private static void printMenu() {
		System.out.println("Input a number to choose a program");
		System.out.println("1. Arabic Number to Roman Numeral Converter");
		System.out.println("2. Roman Numeral to Arabic Number Converter");
		System.out.println("3. End program");
	}
}
