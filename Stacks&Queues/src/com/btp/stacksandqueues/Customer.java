package com.btp.stacksandqueues;

public class Customer {
	int beginTime;
	public Customer() {
		
	}
	
	public void arrive(int time) {
		beginTime = time;
	}
	
	public int getTotalTime(int endTime) {
		return (endTime - beginTime);
	}
}
