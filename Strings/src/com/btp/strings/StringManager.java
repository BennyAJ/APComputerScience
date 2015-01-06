package com.btp.strings;

import java.util.List;

public class StringManager {
	
	private static boolean isVowel(char letter) {
		letter = Character.toLowerCase(letter); //Converts char to lower case
		switch(letter) //Checks if letter is a lower case vowel
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				return true; //True if it is a lower case vowel
		}
		return false; //False if it is not
	}
	
	public static String combineInitials(String inputString1, String inputString2) {
		String tempString;
		tempString = inputString1 + ". " + inputString2 + "."; //Forms the string
		return tempString; //Returns the formed string
	}
	
	public static int getVowelCount(List<String> inputList) {
		int vowels = 0; //Counts the vowels
		
		for(int i = 0; i < inputList.size(); i++) //Iterates through strings
			for(int j = 0; j < inputList.get(i).length(); j++) //Iterates through chars in string
				if(isVowel(inputList.get(i).charAt(j))) //If the char is a vowel...
					vowels++; //Add to the vowel counter
		
		return vowels; //Return final vowel count
	}
	
	public static int getLength(String inputString1) {
		return inputString1.length(); //Returns the saved size
	}
	
	public static String reverseString(String inputString1) {
		String tempString = ""; //Initializes temp string
		for(int i = inputString1.length() - 1; i >= 0; i--) { //Move through it backwards
			tempString += inputString1.charAt(i); //Adds chars to the temp string backwards
		}
		return tempString; //Returns reversed string
	}
	
	public static boolean isEqual(String inputString1, String inputString2) {
		return inputString1.equals(inputString2); //Returns true if strings are equal
	}
	
	public static boolean isEqualLength(String inputString1, String inputString2) {
		if(inputString1.length() == inputString2.length())
			return true; //Returns true if the lengths are equal
		return false; //Returns false otherwise
	}
	
	public static String interlaceStrings(String inputString1, String inputString2) {
		String tempString = "";
		int counter = 0; //Used to increment index each iteration
		do { //Adds a letter from each to the new string each iteration
			tempString += "" + inputString1.charAt(counter) + inputString2.charAt(counter);
			counter++; //Iterate index
		} while(counter < inputString1.length() && counter < inputString2.length());
		//Runs until one of the strings is out of letters
		
		
		if(!isEqualLength(inputString1, inputString2)) { //Doesn't need to do this if strings are equal
			tempString += "" + inputString1.substring(counter); //Adds remaining substring
			tempString += "" + inputString2.substring(counter); //Adds other substring
			
			//Adding both will cause whatever is left over to be tacked onto the end
			//without having to use any logic statements to decide which one
		}
		return tempString;
	}
	
	public static String replaceVowels(String inputString1) {
		String tempString = "";
		for(int i = 0; i < inputString1.length(); i++) { //Goes through string
			if(isVowel(inputString1.charAt(i))) //If char a vowel...
				tempString += '$'; //Put a $ in its place
			else //If char isn't a vowel
				tempString += inputString1.charAt(i); //Put the char in the new string
		}
		
		return tempString;
	}
	
	public static String toPigLatin(String inputString1) {
		String tempString = "";
		tempString += inputString1.substring(1); //Adds all but first letter
		tempString += inputString1.charAt(0); //First letter on the end
		tempString += "AY"; //Add AY after the word
		return tempString; //Outputs pig latin string
	}
	
	public static String stringToLowercase(String inputString1) {
		return inputString1.toLowerCase(); //Prints as lowercase..
	}
	
	public static String getFirstNCharacters(String inputString1, int N) {
		return inputString1.substring(0, N);
		//Gets substring from index 0(inclusive) to index N(exclusive)
	}
	
	public static String getLastNCharacters(String inputString1, int N) {
		return inputString1.substring(N);
		//Gets substring from index N - 1(inclusive) to end of string
	}
	
	public static String getYCharactersAtX(String inputString1, int X, int Y) {
		X -= 1; //Example uses 1 as the starting position so subtract 1 from X
		return inputString1.substring(X, X + Y);
		//Gets substring from index X(inclusive) to index X + Y(Exclusive)
	}
	
	public static int firstOccurrenceOfAs(String inputString1) {
		return inputString1.indexOf("as");
		//Returns index of first occurrence of "as"
	}
	
	public static int lastOccurrenceOfAs(String inputString1) {
		return inputString1.lastIndexOf("as");
		//Returns index of last occurrence of "as" 
	}
	
	public static boolean startsWithAs(String inputString1) {
		return inputString1.startsWith("as");
		//Returns true if the string starts with "as"
	}
	
	public static boolean endsWithAs(String inputString1) {
		return inputString1.endsWith("as");
		//Returns true if the string ends with "as"
	}
	
	public static boolean containsAs(String inputString1) {
		return inputString1.contains("as");
		//Returns true if "as" is found in string
	}
}
