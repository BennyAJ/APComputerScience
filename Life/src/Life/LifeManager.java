package Life;

public class LifeManager {
	public static void lifeTick(char[][] board, int boardSize) {
		char[][] boardCopy = new char[boardSize][boardSize]; //Stores the array before any changed are made
		for(int i = 0; i < board.length; i++)
			System.arraycopy(board[i], 0, boardCopy[i], 0, board[i].length); //Copys all rows of board into the copy
			//Copy doesn't change until the tick is over meaning all changes occur based on the original generation
		
		for(int y = 0; y < boardSize; y++) //Loops through the whole board
			for(int x = 0; x < boardSize; x++)
				updateCell(board, boardCopy, y, x, boardSize); //Makes necessary checks on each cell
	}
	
	private static void updateCell(char[][] board, char[][] boardCopy, int y, int x, int boardSize) {
		int occ = 0; //Counts how many cells around the organism are occupied

		for(int i = y - 1; i <= y + 1; i++) //Iterates through 3x3 square centered on y, x
			for(int j = x - 1; j <= x + 1; j++)
				if(i >= 0 && j >= 0 && i < boardSize && j < boardSize) //Excludes any cells outside of array bounds
					if(i != y || j != x) //Doesn't check y,x since that's the center
						if(boardCopy[i][j] == '*')
							occ++; //Counts the amount of occupied cells around the checked
		
		//System.out.println("occ = " + occ + " for " + x + "," + y); //For debugging
		
		if(boardCopy[y][x] == '*') {//If the cell was alive at start of tick
			if(occ < 2 || occ > 3) {//If it had less than 2 or more than 3 neighbors
				board[y][x] = ' '; //Kill off the cell
				//System.out.println("Killed cell at " + x + "," + y); //For debugging
			}
		}
		
		else { //If cell was dead at start of tick
			if(occ == 3) {//If it had exactly 3 neighbors
				board[y][x] = '*'; //New cell is born in that location
				//System.out.println("Cell born at " + x + "," + y); //For debugging
			}
		}
					
	}
}
