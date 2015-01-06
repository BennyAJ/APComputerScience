package com.btp.inheritance;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////Benny Johnson Abstracts and Interfaces////////////////////////////////////////////////
/////////////////////////////////////////Pt.1 Completed 11/14/2014////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Inheritance {

	public static void main(String[] args) {
		PositionPlayer position = new PositionPlayer(); //Declares position player
		position.setPlayerInfo(); //Gets his info from user
		position.displayPlayerInfo(); //Displays his info
		System.out.println(); //New line
		
		Pitcher pitcher = new Pitcher(); //Declares pitcher
		pitcher.setPlayerInfo(); //Gets his info from user
		pitcher.setPosition("1st"); //Tests if pitcher's position can be altered
		//It can't be...
		pitcher.displayPlayerInfo(); //Displays his info
		System.out.println(); //New line
		
		DesignatedHitter dh = new DesignatedHitter(); //Declares DH
		dh.setPlayerInfo(); //Sets his info
		dh.displayPlayerInfo(); //Displays his info
	}

}
