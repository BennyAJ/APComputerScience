package com.btp.classes;

public class HugeInteger {
	private int[] integers;
	
	public HugeInteger() {
		integers = new int[40];
		for(int i = 1; i < 40; i++) //Iterates through all but first digit
			integers[i] = 0; //Sets places to 0
		integers[0] = 1; //Sets value of huge integer to 1
	}
	
	public HugeInteger(int[] integers) {
		this.integers = new int[40]; //Initializes array
		setValFromArray(integers); //Sets val using given array
	}
	
	public HugeInteger(HugeInteger hugeInt) {
		integers = new int[40]; //Initializes array
		setValFromArray(hugeInt.integers); //Sets val using array from given HugeInteger
	}
	
	public void setValFromArray(int[] integers) {
		for(int i = 0; i < 40; i++) { //Assuming that we'll receive a proper sized array
			this.integers[i] = integers[i]; //Copies digits from array
		}
	}
	
	public void add(HugeInteger hugeInt) {
		for(int i = 0; i < 40; i++) {
			integers[i] += hugeInt.integers[i]; //Adds the places together
			if(integers[i] >= 10) { //If place is more than one digit
				integers[i] -= 10; //Pulls a 10 out of this place
				integers[i + 1] += 1; //Adds it as a 1 to the next place
			}
		}
	}
	
	private int length(HugeInteger hugeInt) {
		int numLength = 39; //Start at top
		
		while(hugeInt.integers[numLength] == 0) //Run until a nonzero number is found
			numLength--; //Subtract from length until loop stops
		
		return numLength; //Returns location of first nonzero number
	}
	
	public void subtract(HugeInteger hugeInt) {
		HugeInteger firstInt; //Base number
		HugeInteger secondInt; //Number being subtracted
		boolean swapped; //Tracks if the final num needs to multiplied by -1
		
		if(isGreaterThan(hugeInt)) { //If this number is greater than the subtracted number
			firstInt = new HugeInteger(this); //Put this number first
			secondInt = new HugeInteger(hugeInt); //Put the subtracted number second
			swapped = false; //Tells that the order is not flipped
		}
		else { //If this number is less than the subtracted number
			firstInt = new HugeInteger(hugeInt); //Put the second number first
			secondInt = new HugeInteger(this); //Put the first number second
			swapped = true; //Tells that order is flipped, causes num to be multiplied by -1
		}
		
		int stealPlace = 0; //Used as marker for a place that can be borrowed from
		for(int i = 0; i < 40; i++) { //Iterates through all numbers
			if(firstInt.integers[i] < secondInt.integers[i]) { //If result would be negative
				stealPlace = i + 1; //Set the steal place to 1 above the current number
				
				while(firstInt.integers[stealPlace] == 0 && stealPlace < 40)
					stealPlace++; //Iterate until a place is found that can be borrowed from
								  //or the end of the array is reached
				
				if(stealPlace != 0) { //Checks to make sure a number was found
					for(int j = stealPlace; j > i; j--) { //Start at steal place, move down
						firstInt.integers[j] -= 1; //Take 1 from the higher number
						firstInt.integers[j - 1] += 10; //Add 10 to the lower number
					}
					firstInt.integers[i] -= secondInt.integers[i]; //NOW do the subtraction
				}
			}
			
			else { //If result would not be negative
				firstInt.integers[i] -= secondInt.integers[i]; //Subtract them
			}
		}
		
		if(swapped) //If the order was reversed
			firstInt.integers[length(firstInt)] *= -1; //Make the number negative
		
		setValFromArray(firstInt.integers); //Copies the temp num's value into this
	}
	
	public boolean isGreaterThan(HugeInteger hugeInt) {
		if(length(this) > length(hugeInt)) //If this is longer...
			return true; //It is greater
		else if(length(this) < length(hugeInt)) //If this is shorter...
			return false; //It is lesser
		
		//If they have equal length...
		
		for(int i = length(this); i >= 0; i--) //Start at top, iterate to 0
			if(integers[i] > hugeInt.integers[i]) //If a greater number is found
				return true; //It is greater
			else if(integers[i] < hugeInt.integers[i]) //If a lesser number is found
				return false; //It is lesser
		
		//If all of their numbers are equal...
		
		return false; //It is not greater
	}
	
	public boolean isLessThan(HugeInteger hugeInt) {
		if(length(this) < length(hugeInt)) //If this is shorter...
			return true; //It is lesser
		else if(length(this) > length(hugeInt)) //If this is longer...
			return false; //It is greater
		
		for(int i = length(this); i >= 0; i--) //Start at top, iterate to 0
			if(integers[i] < hugeInt.integers[i]) //If a lesser number is found
				return true; //It is lesser
			else if(integers[i] > hugeInt.integers[i]) //If a greater number is found
				return false; //It is greater
		
		//If all of their numbers are equal...
		
		return false; //It is not lesser
	}
	
	public void display() {
		String tempString = ""; //Holds the number in string form
		
		for(int i = length(this); i >= 0; i--) { //Runs from first nonzero num to 0
			tempString += (integers[i] + ""); //Adds int at each location to the string
		}
		
		System.out.println("The number is " + tempString); //Prints the string that was created
	}
	
	@Override
	public String toString() {
		String tempString = ""; //Holds the number in string form
		
		for(int i = length(this); i >= 0; i--) { //Runs from first nonzero num to 0
			tempString += (integers[i] + ""); //Adds int at each location to the string
		}
		
		return tempString; //Returns string that was created
	}
}
