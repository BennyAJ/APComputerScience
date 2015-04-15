package com.btp.recursion;

public class StringReverser {
	public static char[] reverseBounds(char[] text, int start, int end) {
		if(start < end) { //Runs when the bounds have not been reduced to 0 yet
			char tempChar = text[start];
			text[start] = text[end]; //Move char at end of bounds to start of bounds
			text[end] = tempChar; //Move char at start of bounds to end of bounds
			start++; //Move the bounds in by 1 increment
			end--;
			return reverseBounds(text, start, end); //Continue to reverse the text
		}
		else { //If bounds are reduced to 0
			return text;
		}
	}
	
	public static boolean isPalindrome(String text) {
		if(text.length() <= 1)
			return true; //If it gets to the end without returning false it is a palindrome
		else if(text.charAt(0) != text.charAt(text.length() - 1))
			return false; //Return false if any letter can't be reversed
		else //Remove one character from each side and restart
			return isPalindrome(text.substring(1, text.length() - 1));
	}
}
