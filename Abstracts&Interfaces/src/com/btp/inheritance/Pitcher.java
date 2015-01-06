package com.btp.inheritance;

public class Pitcher extends Fielder {
	private int wins; //Wins
	private int losses; //Losses
	private int inningsPitched; //Innings where he has pitched
	private int pitches; //Pitches he has thrown
	private int balls; //Balls that he has thrown
	private int strikes; //Strikes that he has thrown
	private int walks; //Amount of batters that he has walked
	private int strikeouts; //Amount of batters that he has struck out
	
	public Pitcher() {
		//Implicitly inherits constructor from Fielder
		setWins(0);
		setLosses(0);
		setInningsPitched(0);
		setPitches(0);
		setBalls(0);
		setStrikes(0);
		setWalks(0);
		setStrikeouts(0);
		super.setPosition("Pitcher");
		//Uses superclass version of setPosition to set position initially
	}
	
	public void setPosition(String position) {
		//Overrides this method and does nothing
		//Keeps position from being overwritten
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getInningsPitched() {
		return inningsPitched;
	}

	public void setInningsPitched(int inningsPitched) {
		this.inningsPitched = inningsPitched;
	}

	public int getPitches() {
		return pitches;
	}

	public void setPitches(int pitches) {
		this.pitches = pitches;
	}

	public int getBalls() {
		return balls;
	}

	public void setBalls(int balls) {
		this.balls = balls;
	}

	public int getStrikes() {
		return strikes;
	}

	public void setStrikes(int strikes) {
		this.strikes = strikes;
	}

	public int getWalks() {
		return walks;
	}

	public void setWalks(int walks) {
		this.walks = walks;
	}

	public int getStrikeouts() {
		return strikeouts;
	}

	public void setStrikeouts(int strikeouts) {
		this.strikeouts = strikeouts;
	}
	
	public void setPlayerInfo() {
		super.setPlayerInfo();
		wins = InputManager.getNumInput("Input his amount of wins");
		losses = InputManager.getNumInput("Input his amount of losses");
		inningsPitched = InputManager.getNumInput("Input his amount of innings pitched");
		pitches = InputManager.getNumInput("Input his amount of pitches");
		balls = InputManager.getNumInput("Input his amount of balls pitched");
		strikes = InputManager.getNumInput("Input his amount of strikes pitched");
		walks = InputManager.getNumInput("Input his amount of walks pitched");
		strikeouts = InputManager.getNumInput("Input his amount of strikeouts pitched");
		//Does not include position since a pitcher is always a pitcher
	}
	
	public void displayPlayerInfo() {
		super.displayPlayerInfo(); //Runs inherited display function
		System.out.println("As a pitcher... ");
		System.out.println("He has won " + wins + " games");
		System.out.println("He has lost " + losses + " games");
		System.out.println("He has pitched in " + inningsPitched + " innings");
		System.out.println("He has pitched " + pitches + " pitches");
		System.out.println(balls + " of those pitches were balls");
		System.out.println(strikes + " of those pitches were strikes");
		System.out.println("He has walked " + walks + " batters");
		System.out.println("He has struck out " + strikeouts + " batters");
	}
	
}
