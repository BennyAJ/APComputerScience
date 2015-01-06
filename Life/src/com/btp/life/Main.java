package com.btp.life;

////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////Benny Johnson Life Worksheet 9/5/2014/////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
public class Main {
	public static void main(String[] args) {
		final int boardSize = 9; //Value for width and length of the board
		
		//Initializes default board
		char[][] lifeBoard = new char[boardSize][boardSize]; //Uses boardSize to initialize array
		for(int y = 0; y < lifeBoard.length; y++)
			for(int x = 0; x < lifeBoard[0].length; x++)
				lifeBoard[y][x] = ' '; //Sets whole board as blank spaces
		
		//Adds live cells in test configuration
		for(int y = (boardSize/2) - 1; y <= (boardSize/2) + 1; y++) {
			lifeBoard[y][boardSize/2 - 1] = '*';
			lifeBoard[y][boardSize/2 + 1] = '*';
		}
		lifeBoard[boardSize/2 + 1][boardSize/2] = '*';
		
		for(int i = 0; i < 6; i++) { //Iterates through 6 generations, can change i to any amount
			
			System.out.println("---------"); //Prints dividers
			System.out.println("----" + i + "----");
			System.out.println("---------");
			
			for(int j = 0; j < lifeBoard.length; j++)
				System.out.println(lifeBoard[j]); //Prints the board
			
			LifeManager.lifeTick(lifeBoard, boardSize); //Causes a tick in the game
		}
	}
		

}
