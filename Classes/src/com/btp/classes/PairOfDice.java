package com.btp.classes;

import java.util.Random;

public class PairOfDice {

	private Random rand;
	private int[] dice;
	
	public PairOfDice() {
		dice = new int[2]; //Holds two dice
		rand = new Random(); //Creates random number generator
		rollDice();
	}
	
	public void rollDie(int dieNum) {
		if(dieNum > 0 && dieNum <= 2) //Checks if dice exists
			dice[dieNum - 1] = rand.nextInt(6) + 1; //Gens from 0-5, adds 1
		else //If dice doesn't exist print an error
			System.err.println("Can't roll a die that doesn't exist");
	}
	
	public void rollDice() {
		for(int i = 0; i < dice.length; i++) {
			dice[i] = rand.nextInt(6) +  1; //Gens from 0-5, adds 1
		}
	}
	
	public void displayDice() {
		System.out.println("Dice 1's value is " + dice[0]); //Outputs val of dice 1
		System.out.println("Dice 2's value is " + dice[1]); //Ouputs val of dice 2
	}
	
	@Override
	public String toString() {
		return (dice[0] + ", " + dice[1]); //Outputs dice values with comma between
	}
	
	
}
