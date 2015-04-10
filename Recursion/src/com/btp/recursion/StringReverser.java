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
}
