package com.btp.recursion;

public class BinaryConverter {
	public static int binaryToInteger(int binary, int power) {
			if(binary > 0) //Add value of next binary digit and divide by 10 until none are left
				return  ((int)((binary % 10) * Math.pow(2,power) + binaryToInteger(binary/10, power + 1)));
			else //Return 0 to end recursion when the binary number is empty
				return 0;
	}
	
	public static String integerToBinary(int number) {
		if(number > 0) {
			if(number % 2 == 0)
				return integerToBinary(number/2) + "0";
			else
				return integerToBinary(number/2) + "1";
		}
		else {
			return "";
		}
		
		
	}
}
