package com.btp.arraylist;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		String input = "";
		boolean looping = true;
		Rolodex rolodex = new Rolodex(); //Create rolodex
		PersonXMLReader xml = new PersonXMLReader();
		ArrayList<Integer> searchIndexes;
		String firstName, lastName, phoneNum;
		while(!input.toLowerCase().equals("manual") && !input.toLowerCase().equals("file"))
			input = InputManager.getStringInput("manual or file entry?");
		if(input.toLowerCase().equals("manual")) {
			do {
				rolodex.addManualEntry();
				input = InputManager.getStringInput("Input repeat to add another entry, input anything else to finish");
			} while(input == "repeat");
		}
		else if(input.toLowerCase().equals("file")) {
			xml.populateRolodex(rolodex, "database.xml");
		}
		
		while(looping) {
			rolodex.displayPerson();
			System.out.println("Input a number to go to that index within the rolodex");
			System.out.println("Type search to search for a specific entry");
			System.out.println("Type end to exit the rolodex");
			input = InputManager.getStringInput("Input a + or - to move forward or back in the rolodex");
			if(input.equals("+")) {
				rolodex.moveForwards();
			}
			else if(input.equals("-")) {
				rolodex.moveBackwards();
			}
			else if(input.equals("search")) {
				firstName = InputManager.getStringInput("Input a first name to search for, or input nothing to ignore first name");
				lastName = InputManager.getStringInput("Input a last name to search for, or input nothing to ignore last name");
				phoneNum = InputManager.getStringInput("Input a phone number to search for, or input nothing to ignore phone number");
				searchIndexes = rolodex.search(firstName, lastName, phoneNum);
				if(searchIndexes.size() != 0) {
					System.out.println("Matching Entries At: ");
					for(int i = 0; i < searchIndexes.size(); i++)
						System.out.println(searchIndexes.get(i));
				}
				else {
					System.out.println("No Matching Entries");
				}
				firstName = lastName = phoneNum = null;
			}
			else if(input.equals("end")) {
				looping = false; //End loop
			}
			else {
				try {
					rolodex.toIndex(Integer.parseInt(input)); //Convert string to int
				}
				catch(Exception e) {
					//If string can't be parsed into an int then nothing happens
				}
			}
		}
	}

}
