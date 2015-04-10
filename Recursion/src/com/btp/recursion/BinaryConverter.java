package com.btp.recursion;

public class BinaryConverter {
	public static int binaryToInteger(int binary, int power) {
			if(binary > 0)
				return  ((int)((binary % 10) * Math.pow(2,power) + binaryToInteger(binary/10, power + 1)));
			else
				return 0;
	}
}
