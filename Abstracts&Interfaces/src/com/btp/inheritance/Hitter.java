package com.btp.inheritance;

public abstract class Hitter implements Player {
	private String firstName; //First name
	private String lastName; //Last name
	private int number; //Player number
	private int atBats; //Amount of at bats
	private int hits; //Amount of hits
	private int runs; //Amount of runs
	private int RBIs; //Amount of RBI's
	
	public Hitter() {
		setFirstName("John"); //Sets a default first name
		setLastName("Doe"); //Sets a default last name
		setNumber(7); //Sets default player number
		setAtBats(0); //Sets at bats to 0
		setHits(0); //Sets hits to 0
		setRuns(0); //Sets runs to 0
		setRBIs(0); //Sets RBI's to 0
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getName() {
		return (firstName + " " + lastName); //Returns whole name as string
	}

	public int getNumber() {
		return number;
	}
	
	public int getAtBats() {
		return atBats;
	}
	
	public int getHits() {
		return hits;
	}
	
	public int getRuns() {
		return runs;
	}
	public int getRBIs() {
		return RBIs;
	}
	public float getBattingAverage() {
		if(atBats > 0) //Checks for division by 0
			return (((float)hits)/((float)atBats)); //Calculates batting average
		return 0;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setAtBats(int atBats) {
		this.atBats = atBats;
	}
	
	public void setHits(int hits) {
		this.hits = hits;
	}
	
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	public void setRBIs(int RBIs) {
		this.RBIs = RBIs;
	}
	
	public void setPlayerInfo() { //Gets all hitter info
		firstName = InputManager.getStringInput("Input the player's first name");
		lastName = InputManager.getStringInput("Input his last name");
		number = InputManager.getNumInput("Input his number");
		atBats = InputManager.getNumInput("Input his amount of at bats");
		hits = InputManager.getNumInput("Input his amount of hits");
		runs = InputManager.getNumInput("Input his amount of runs");
		RBIs = InputManager.getNumInput("Input his amount of RBI's");
	}
	
	public void displayPlayerInfo() { //Prints all hitter info
		System.out.println("The player's name is " + firstName + " " + lastName);
		System.out.println("He is number " + number);
		System.out.println("He has gotten " + hits + " hits out of " + atBats + " at bats");
		System.out.println("This gives him a batting average of " + getBattingAverage());
		System.out.println("He has scored " + runs + " runs");
		System.out.println("He has gotten " + RBIs + " RBI's");
	}
}
