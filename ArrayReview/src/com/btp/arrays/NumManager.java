package com.btp.arrays;
import java.util.ArrayList;
import java.util.List;


public class NumManager {
	public List<Integer> sortAscending(List<Integer> list) {
		int minVal = 2147483647; //Set to highest possible int so it will recognize any int below it
		int minIndex = 0; //Used to hold index of the current minimum value
		
		for(int i = 0; i < list.size() - 1; i++) { //Start point
			for(int j = i; j < list.size(); j++) { //Current point
				if(list.get(j) < minVal) { //If current number is smaller than current min...
					minVal = list.get(j); //Set min to current number
					minIndex = j; //Save the index
					//System.out.println("min_val = " + min_val);
				}
			}
			list.set(minIndex, list.get(i)); //Puts the next lowest index's number into the min index
			list.set(i, minVal); //Move the min val to the space we just cleared
			minVal = 2147483647; //Resets to highest possible int so it can detect the next smallest
			
			//System.out.println("i = " + i);
		}
		return list; //Return the now sorted list
	}
	
	public float findMean(List<Integer> list) {
		float mean = 0;
		for(int i = 0; i < list.size(); i++) //Adds up all numbers in the list
			mean += list.get(i);
		mean /= list.size(); //Divides the added number by the list size to get the mean
		return mean;
	}
	
	public float findMedian(List<Integer> list) {
		float median = 0;
		if(list.size() % 2 == 0) //If the list has an even amount of elements
			median = (float) (list.get(list.size()/2 - 1) + list.get(list.size()/2))/2; //Avg of center nums
		else //If the list has an odd amount of elements
			median = list.get(list.size()/2); //Median is the center element
		
		return median;
	}
	
	public List<Integer> findMode(List<Integer> list) {
		int currentVal = 0; //Holds the current value to be counted
		int numCounter = 0; //Counts the amount of each number
		int currentIndex = 0; //Holds the current index that is being checked
		int highestCount = 0; //Holds the highest recorded value of numCounter
		List<Integer> modeList = new ArrayList<Integer>(); //Holds all modes
		
		do{
			currentVal = list.get(currentIndex); //Start by setting number to compare to
			numCounter = 0; //Reset counter
			do {
				numCounter++; //Count until reaching a diff number or end of the list
				currentIndex++;
			} while(currentIndex < list.size() && list.get(currentIndex) == currentVal);
			
			if(numCounter > highestCount) { //If new count is higher than the past count
				modeList.clear(); //Resets list of modes
				highestCount = numCounter; //Set a new highest count
				modeList.add(currentVal); //Add this mode to the list
			}
			else if(numCounter == highestCount) { //If new count is same as past count
				modeList.add(currentVal); //Adds num with equal amount to the mode list
			}
			
		} while(currentIndex < list.size()); //Count numbers until the list ends
		return modeList; //Returns filled list of modes
	}
	
	public float findStdDev(List<Integer> list) {
		float mean = findMean(list); //Gets the mean of the list for later use
		float stdDev = 0;
		for(int i = 0; i < list.size(); i++) { //Iterates through list
			stdDev += (list.get(i) - mean) * (list.get(i) - mean);
			//1. Subtracts the current number from the mean
			//2. Squares it(multiplied by itself)
			//3. Adds this value to the Standard Deviation
		}
		stdDev /= list.size(); //Takes the mean of all of the values from the for loop to get variance
		stdDev = (float)Math.sqrt(stdDev); //Takes the square root of the variance
		return stdDev;
	}
}
