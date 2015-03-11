package com.btp.linkedlists;

import java.io.IOException;
import java.util.Scanner;

public class InputManager {
	private static Scanner consoleReader = new Scanner(System.in); //Gets input
	
	public static void waitForInput(String prompt) {
		System.out.println(prompt); //Prints a prompt to the user
		try {
			System.in.read(); //Waits for any input before moving on in console
		} catch (IOException e) { //Stops program from crashing in case of I/O exception
		}
	}
	
	public static String getStringInput(String prompt) {
		String tempString; //Holds user input before putting in list
		System.out.println(prompt); //Prompts user for input
		tempString = consoleReader.next(); //Gets user input
		return tempString; //Returns input
	}
	
	public static int getNumInput(String prompt) {
		boolean inputFound = false; //Used to control the loop stopping
		String tempString; //Holds input as a string
		int tempNum = 0; //Holds user input as a number
		System.out.println(prompt); //Prompts user for input
		do {
			try {
				tempString = consoleReader.next(); //Gets user input
				tempNum = Integer.parseInt(tempString); //Converts string into an int if possible
				inputFound = true; //Confirms input received if there is no error
			}
			catch(NumberFormatException error) { //If there is an error
				System.out.println("Integer input not found");
				//Couldn't get number input from console so it starts over
			}
		} while(!inputFound); //Loops until a valid int is given
		
		return tempNum; //Returns input
	}
}
