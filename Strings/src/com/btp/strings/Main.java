package com.btp.strings;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////Benny Johnson Strings Worksheet///////////////////////////////////////////////////////
///////////////////////////////////////Completed 9/18/2014///////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Main {
	public static void main(String[] args) {
		String tempString1; //Holds strings for short term use
		String tempString2; //Holds strings for short term use
		int tempNum1 = 0; //Holds numbers for short term use
		int tempNum2 = 0; //Holds numbers for short term use
		
		do {
			printMenu();
			tempNum1 = InputManager.getNumInput("Input here: ");
			
			switch(tempNum1) {
				case 1: //Take initials and put them into one string
					tempString1 = InputManager.getStringInput("Input your first initial");
					tempString2 = InputManager.getStringInput("Input your last initial");
					System.out.println(StringManager.combineInitials(tempString1, tempString2));
					break;
				case 2: //Counts the amount of vowels in a list of strings
					tempNum1 = StringManager.getVowelCount(InputManager.getListInput("Input a String", '/'));
					System.out.println("There were " + tempNum1 + " vowels in the strings");
					break;
				case 3: //Prints the length of a string
					tempString1 = InputManager.getStringInput("Input a string");
					System.out.println("The string is " + StringManager.getLength(tempString1) + " characters long");
					break;
				case 4: //Prints a string backwards
					tempString1 = InputManager.getStringInput("Input a string to reverse");
					System.out.println("The reversed string is " + StringManager.reverseString(tempString1));
					break;
				case 5: //Tells whether two strings are the same
					tempString1 = InputManager.getStringInput("Input a string");
					tempString2 = InputManager.getStringInput("Input a string to compare it to");
					if(StringManager.isEqual(tempString1, tempString2))
						System.out.println("The strings are equal");
					else
						System.out.println("The strings are not equal");
					break;
				case 6: //Tells whether two strings have the same length
					tempString1 = InputManager.getStringInput("Input a string");
					tempString2 = InputManager.getStringInput("Input a string to compare it to");
					if(StringManager.isEqualLength(tempString1, tempString2))
						System.out.println("The strings have the same length");
					else
						System.out.println("The strings have a different length");
					break;
				case 7: //Combines two strings while alternating at each letter
					tempString1 = InputManager.getStringInput("Input a string");
					tempString2 = InputManager.getStringInput("Input a string to interlace it with");
					System.out.println("The interlaced string is " + StringManager.interlaceStrings(tempString1, tempString2));
					break;
				case 8: //Replace all vowels in a string with $
					tempString1 = InputManager.getStringInput("Input a string to replace the vowels in");
					System.out.println("The modified string is " + StringManager.replaceVowels(tempString1));
					break;
				case 9: //Convert a string to pig latin
					tempString1 = InputManager.getStringInput("Input a string to convert to pig latin");
					System.out.println("The string in pig latin is " + StringManager.toPigLatin(tempString1));
					break;
				case 10: //Convert a string to lowercase
					tempString1 = InputManager.getStringInput("Input a string to convert to lowercase");
					System.out.println("The new string is " + StringManager.stringToLowercase(tempString1));
					break;
				case 11: //Prints substring of a string from 0 to N
					tempString1 = InputManager.getStringInput("Input a string");
					tempNum1 = InputManager.getNumInput("Input a value for N");
					System.out.println("The first N characters are " + StringManager.getFirstNCharacters(tempString1, tempNum1));
					break;
				case 12: //Prints substring of a string from N to end
					tempString1 = InputManager.getStringInput("Input a string");
					tempNum1 = InputManager.getNumInput("Input a value for N");
					System.out.println("The last N characters are " + StringManager.getLastNCharacters(tempString1, tempNum1));
					break;
				case 13: //Prints substring of a string from X to X + Y
					tempString1 = InputManager.getStringInput("Input a string");
					tempNum1 = InputManager.getNumInput("Input a value for X");
					tempNum2 = InputManager.getNumInput("Input a value for Y");
					System.out.println("The new string is " + StringManager.getYCharactersAtX(tempString1, tempNum1, tempNum2));
					break;
				case 14: //Prints the index of the first occurrence of as in a string
					tempString1 = InputManager.getStringInput("Input a string");
					System.out.println("The first occurrence of as is at index " + StringManager.firstOccurrenceOfAs(tempString1));
					break;
				case 15: //Prints index of last occurrence of as
					tempString1 = InputManager.getStringInput("Input a string");
					System.out.println("The last occurrence of as is at index " + StringManager.lastOccurrenceOfAs(tempString1));
					break;
				case 16: //Tells if a string is prefixed with as
					tempString1 = InputManager.getStringInput("Input a string");
					if(StringManager.startsWithAs(tempString1))
						System.out.println("The string starts with as");
					else
						System.out.println("The string does not start with as");
					break;
				case 17: //Tells if a string is suffixed with as
					tempString1 = InputManager.getStringInput("Input a string");
					if(StringManager.endsWithAs(tempString1))
						System.out.println("The string ends with as");
					else
						System.out.println("The string does not end with as");
					break;
				case 18: //Tells if a string contains as and gives location if it does
					tempString1 = InputManager.getStringInput("Input a string");
					if(StringManager.containsAs(tempString1))
						System.out.println("The string contains as at index " + StringManager.firstOccurrenceOfAs(tempString1));
					else
						System.out.println("The string does not contain as");
					break;
			}
			if(tempNum1 != -1) //Stops program from pausing for input if it's been ended
				InputManager.waitForInput("Press any key to go back to the menu"); //Pauses until keyboard input
		} while (tempNum1 != -1);
		
	}
	
	private static void printMenu() { //Used for reprinting the menu after each program is run
		System.out.println("Input a listed number to select a program");
		System.out.println("Input -1 to end this program");
		System.out.println("1. Turn two initials into one string");
		System.out.println("2. Count the vowels in a set of strings");
		System.out.println("3. Prints the length of a string");
		System.out.println("4. Prints a string backwards");
		System.out.println("5. Tells whether two strings are the same");
		System.out.println("6. Tells whether two strings have the same length");
		System.out.println("7. Interlaces two strings so that they alternate each letter");
		System.out.println("8. Converts all vowels in a string with a $");
		System.out.println("9. Converts a string to pig latin");
		System.out.println("10. Converts a string to lowercase");
		System.out.println("11. Prints the first N characters of a string");
		System.out.println("12. Prints the last N characters of a string");
		System.out.println("13. Prints Y characters of a string starting at X");
		System.out.println("14. Finds the first occurrence of as in a string");
		System.out.println("15. Finds the last occurrence of as in a string");
		System.out.println("16. Tells if a string begins with as");
		System.out.println("17. Tells if a string ends with as");
		System.out.println("18. Tells if a string contains as");
	}
}
