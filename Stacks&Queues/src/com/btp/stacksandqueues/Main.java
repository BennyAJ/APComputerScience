package com.btp.stacksandqueues;

import java.util.LinkedList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		LinkedList<Customer> line = new LinkedList<Customer>(); //Queue
		int totalTime = 0;
		int arrivalTime = rand.nextInt(4) + 1;
		int serviceTime = rand.nextInt(4) + 1;
		int maxCustomers = 0;
		int maxWait = 0;
		
		while(totalTime < 720) {
			if(arrivalTime > 0) { //If a customer has not arrived yet
				arrivalTime--; //Count down until they arrive
			}
			else { //If a customer has arrived
				Customer temp = new Customer();
				temp.arrive(totalTime); //Save their arrival time
				line.add(temp);
				if(line.size() > maxCustomers)
					maxCustomers = line.size();
				arrivalTime = rand.nextInt(4) + 1; //Resets the arrival timer
			}
			if(serviceTime > 0) { //If a customer is being serviced
				serviceTime--; //Count down until they're done
			}
			else if(line.size() > 0) { //If timer is done and a customer exists
				if(line.getFirst().getTotalTime(totalTime) > maxWait)
					maxWait = line.getFirst().getTotalTime(totalTime);
				line.remove();
				serviceTime = rand.nextInt(4) + 1; //Resets service timer
			}
			totalTime++; //Count up for 720 seconds
		}
		
		System.out.println("Max Customers = " + maxCustomers);
		System.out.println("Max Wait Time = " + maxWait);
		
		/*System.out.println("6 + 2 / 2 + 9 / 3 - 4 * 4"); //Test for stack arithmetic
		System.out.println("RESULT = " + StackManager.evaluate("6 + 2 / 2 + 9 / 3 - 4 * 4"));*/
	}

}
