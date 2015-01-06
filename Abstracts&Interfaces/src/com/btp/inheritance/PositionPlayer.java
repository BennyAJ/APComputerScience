package com.btp.inheritance;

public class PositionPlayer extends Fielder {
	public PositionPlayer() {
		//Implicitly calls the constructor from Fielder first
		setPosition("1st Base"); //Sets a default position
	}
	
	public void setPlayerInfo() {
		super.setPlayerInfo(); //Runs setPlayerInfo from Hitter
		setPosition(InputManager.getStringInput("Input his position"));
		//Uses function to set position since it's private and can't be accessed directly
	}
}
