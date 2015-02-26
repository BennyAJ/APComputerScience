package com.btp.arraylist;

import java.util.ArrayList;

public class Rolodex {
	private ArrayList<Person> rolodex = new ArrayList<Person>();
	private int currentIndex; //Tracks user's position in the rolodex
	
	public Rolodex() {
		currentIndex = 0;
	}
	
	public void addManualEntry() {
		int counter = 0; //Used for iterating through ArrayList for alphabetical sorting
		Person tempPerson = new Person(); //Initializes default person
		
		//Get input for all fields of the person
		tempPerson.setFirstName(InputManager.getStringInput("Input the person's first name"));
		tempPerson.setLastName(InputManager.getStringInput("Input the person's last name"));
		tempPerson.setAddress(InputManager.getStringInput("Input the person's address"));
		tempPerson.setPhoneNumber(InputManager.getStringInput("Input the person's phone number"));
		
		//Runs while current name in the rolodex is earlier in the alphabet
		while(counter < rolodex.size() && tempPerson.getFullName().compareToIgnoreCase(rolodex.get(counter).getFullName()) > 0) {
			counter++;
		}
		//Once it finds someone with the same name or a name later in the alphabet...
		rolodex.add(counter, tempPerson); //Add the new person to the ArrayList
	}
	
	public void addFileEntry(String firstName, String lastName, String address, String phoneNum) {
		int counter = 0; //Used for iterating through ArrayList for alphabetical sorting
		Person tempPerson = new Person(); //Initializes default person
		
		//Get input for all fields of the person
		tempPerson.setFirstName(firstName);
		tempPerson.setLastName(lastName);
		tempPerson.setAddress(address);
		tempPerson.setPhoneNumber(phoneNum);
		
		//Runs while current name in the rolodex is earlier in the alphabet
		while(counter < rolodex.size() && tempPerson.getFullName().compareToIgnoreCase(rolodex.get(counter).getFullName()) > 0) {
			counter++;
		}
		//Once it finds someone with the same name or a name later in the alphabet...
		rolodex.add(counter, tempPerson); //Add the new person to the ArrayList
	}
	
	public void moveForwards() {
		if(currentIndex < rolodex.size() - 1) //If there is room to advance
			currentIndex++; //Move forward by one entry
		else
			currentIndex = 0; //Otherwise go to the first entry
	}
	
	public void moveBackwards() {
		if(currentIndex > 0) //If there is room to back up
			currentIndex--; //Move backward by one entry
		else
			currentIndex = (rolodex.size() - 1); //Otherwise go to the last entry
	}
	
	public void toIndex(int index) {
		if(index < rolodex.size())
			currentIndex = index;
	}
	
	public ArrayList<Integer> search(String firstName, String lastName, String phoneNumber) {
		//Searches by any or all of the 3 conditions, ignores any that are blank
		
		int index = 0;
		ArrayList<Integer> matchedIndexes = new ArrayList<Integer>(); //Holds matching indexes
		
		for(int i = 0; i < rolodex.size(); i++)
			matchedIndexes.add(i); //Includes all possible indexes by default
		
		if(!firstName.isEmpty()) {//Only uses first name if it was given
			while(index < matchedIndexes.size()) {
				if(firstName.compareToIgnoreCase(rolodex.get(matchedIndexes.get(index)).getFirstName()) != 0)
					matchedIndexes.remove(index); //Removes any results which don't match first name
				else
					index++;
			}
		}
		index = 0;
		if(!lastName.isEmpty()) { //Only uses last name if it was given
			while(index < matchedIndexes.size()) {
				if(lastName.compareToIgnoreCase(rolodex.get(matchedIndexes.get(index)).getLastName()) != 0)
					matchedIndexes.remove(index); //Removes any results which don't match last name
				else
					index++;
			}
		}
		index = 0;
		if(!phoneNumber.isEmpty()) { //Only uses phone number if it was given
			while(index < matchedIndexes.size()) {
				if(phoneNumber.compareToIgnoreCase(rolodex.get(matchedIndexes.get(index)).getPhoneNumber()) != 0)
					matchedIndexes.remove(index); //Removes any results which don't match phone number
				else
					index++;
			}
		}
		
		//Should be left with only the indexes which match all given search results
		return matchedIndexes; //Returns the ArrayList of matching results
	}
	
	public void displayPerson() { //Prints info about the person at current index
		System.out.println("At index " + currentIndex + ":");
		System.out.print("Name - " + rolodex.get(currentIndex).getFirstName() + " ");
		System.out.println(rolodex.get(currentIndex).getLastName());
		System.out.println("Address - " + rolodex.get(currentIndex).getAddress());
		System.out.println("Phone Number - " + rolodex.get(currentIndex).getPhoneNumber());
	}
}
