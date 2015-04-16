package com.btp.recursion;

public class FinanceManager {
	public static float getCompoundInterest(float rate, float investment, int years) {
		if(years > 0) //Add interest to investment, decrement year each time
			return getCompoundInterest(rate, (investment + investment*rate), years - 1);
		else
			return investment; //Return final account balance
	}
}
