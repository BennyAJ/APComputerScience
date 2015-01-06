package com.btp.arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////Benny Johnson Array Review//////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////Completed 9/2/2014///////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Main {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>(); //List for the user input numbers
		NumManager numManager = new NumManager(); //Sorts numbers and does calculations
		Scanner inputScan = new Scanner(System.in); //Used to take and analyze input
		boolean gathering = true; //True when data is being gathered from the user
		String inputString; //Holds user input from command line
		int inputNum = 0; //Holds user input that has been converted to an int
		System.out.println("Input an integer to add it to the list or anything else to end the loop");
		do
		{
			System.out.println("Input an Integer:");
			inputString = inputScan.nextLine(); //Gets a string of input from the user
			try { //Try to convert the string to an integer
				inputNum = Integer.parseInt(inputString); //Convert string to int
				numList.add(inputNum); //Add the new int to the list
				//System.out.println(numList.get(numList.size() - 1));
			}
			catch(NumberFormatException error) { //If it can't be converted...
				gathering = false; //End the loop
			}
		} while(gathering); //Runs until something other than an integer is inputted
		
		/*for(int i = 0; i < numList.size(); i++) //Print the list before sorting
			System.out.println(numList.get(i));*/
		
		numList = numManager.sortAscending(numList); //Sorts the list in ascending order
		
		//System.out.println("SORTED");
		
		/*for(int i = 0; i < numList.size(); i++) //Print the list after sorting
			System.out.println(numList.get(i));*/
		
		System.out.println("Mean = " + numManager.findMean(numList)); //Prints mean
		System.out.println("Median = " + numManager.findMedian(numList)); //Prints medians
		System.out.println("Mode(s) = " + numManager.findMode(numList)); //Prints list of mode(s)
		System.out.println("Standard Deviation = " + numManager.findStdDev(numList)); //Prints standard deviation
		
		inputScan.close(); //Closes scanner to prevent memory leaks
	}
}
