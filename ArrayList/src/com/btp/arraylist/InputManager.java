package com.btp.arraylist;

import java.util.Scanner;

public class InputManager { 
	private static Scanner scanner = new Scanner(System.in); //Used to get input
	
	public static String getStringInput(String prompt) {
		System.out.println(prompt);
		return scanner.nextLine();
	}
}
