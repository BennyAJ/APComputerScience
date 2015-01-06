package classes;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////Benny Johnson Class WS///////////////////////////////////////////////////
/////////////////////////////////////////Completed 10/28///////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Main {

	public static void main(String[] args) {
		int tempNum = 0; //Holds various input
		int tempNum2 = 0; //Holds various input
		int programChooser = 0; //Takes input for picking a program
		
		do {
			printMenu(); //Prints menu
			programChooser = InputManager.getNumInput(""); //Gets input for selection
			
			switch(programChooser) {
				case 1:
				{
					tempNum = InputManager.getNumInput("Input the numerator of the first fraction");
					tempNum2 = InputManager.getNumInput("Input the denominator of the first fraction");
					Rational fraction = new Rational(tempNum, tempNum2); //Use constructor with given values
					Rational fraction2 = new Rational(); //Uses default constructor
					tempNum = InputManager.getNumInput("Input the numerator of the second fraction");
					tempNum2 = InputManager.getNumInput("Input the denominator of the second fraction");
					fraction2.setNumerator(tempNum); //Sets numerator manually
					fraction2.setDenominator(tempNum2); //Sets denominator manually
					
					System.out.print(fraction.toString() + " + " + fraction2.toString() + " = ");
					fraction.add(fraction2); //Adds the fractions
					System.out.println(fraction.toString());
					System.out.print(fraction.toString() + " - " + fraction2.toString() + " = ");
					fraction.subtract(fraction2); //Undoes the addition by subtracting
					System.out.println(fraction.toString());
					System.out.print(fraction.toString() + " * " + fraction2.toString() + " = ");
					fraction.multiply(fraction2); //Multiplies the fractions
					System.out.println(fraction.toString());
					System.out.print(fraction.toString() + " / " + fraction2.toString() + " = ");
					fraction.divide(fraction2); //Undoes the multiplication by dividing
					System.out.println(fraction.toString()); //Should end with the starting fraction
					break;
				}
				case 2:
				{
					PairOfDice dice = new PairOfDice(); //Default constructor randomly rolls them
					dice.displayDice(); //Displays dice with whatever the constructor rolled
					tempNum = InputManager.getNumInput("Which dice would you like to roll? (1 or 2)"); 
					dice.rollDie(tempNum); //Rolls one die
					dice.displayDice(); //Displays the dice after the roll
					System.out.println("Rolling both dice...");
					dice.rollDice(); //Rolls both dice
					dice.displayDice(); //Displays the dice
				}
					break;
				case 3:
				{
					tempNum = InputManager.getNumInput("Input the value for the real part of a complex number");
					tempNum2 = InputManager.getNumInput("Input the value for the imaginary part of a complex number");
					ComplexNum num = new ComplexNum(tempNum, tempNum2); //Constructor takes real and imaginary part
					ComplexNum num2 = new ComplexNum(); //Default constructor
					tempNum = InputManager.getNumInput("Input the value for the real part of another complex number");
					tempNum2 = InputManager.getNumInput("Input the value for the imaginary part of another complex number");
					num2.setRealNum(tempNum); //Sets real part
					num2.setImaginaryNum(tempNum2); //Sets imaginary part
					
					System.out.println(num.toString() + " + " + num2.toString());
					num.add(num2); //Adds num2 to num
					num.display(); //Displays the newly created num
					System.out.println(num.toString() + " - " + num2.toString());
					num.subtract(num2); //Subtracts num2 from num
					num.display(); //Displays newly created num, should be the same as it started
				}
					break;
				case 4:
				{
					int[] tempArray = new int[40];
					int counter = 0;
					System.out.println("Input one digit at a time starting at the ones place to add it to the number, input more than one digit to end the number");
					do {
						tempNum = InputManager.getNumInput("Input digit #" + (counter + 1) + " here: "); //Gets input for digit
						if(tempNum > -10 && tempNum < 10) //If it's a single digit integer
							tempArray[counter] = tempNum; //Add it to the array
						counter++; //Increment the counter
					} while(tempNum > -10 && tempNum < 10); //Runs until a non single digit integer is reached
					
					HugeInteger hugeInt = new HugeInteger(tempArray); //Declares a huge int with user input
					HugeInteger hugeInt2 = new HugeInteger();
					
					for(int i = 0; i < 10; i++) {
						tempNum = (int)(Math.random() * 10); //Randomly generates digits between 0 and 9
						tempArray[i] = tempNum; //Add digits to array
					}
					
					hugeInt2.setValFromArray(tempArray); //Set value from this array
					
					hugeInt.display(); //Display the huge integers
					hugeInt2.display();
					
					if(hugeInt.isGreaterThan(hugeInt2)) //If first is greater
						System.out.println("The first number is larger"); //Display that
					else if(hugeInt.isLessThan(hugeInt2)) //If first is lesser
						System.out.println("The second number is larger"); //display that
					
					System.out.print(hugeInt.toString() + " + " + hugeInt2.toString() + " = ");
					hugeInt.add(hugeInt2); //Add second int to first
					System.out.println(hugeInt.toString());
					
					System.out.print(hugeInt.toString() + " - " + hugeInt2.toString() + " = ");
					hugeInt.subtract(hugeInt2); //Subtract second int from first
					System.out.println(hugeInt.toString());
					
					//If it works then hugeInt will end with the same value that it began with
				}
				break;
				case 5:
				{
					Point point = new Point();
					
					tempNum = InputManager.getNumInput("Input an X value for the point");
					point.setX(tempNum); //Sets x val of point
					tempNum = InputManager.getNumInput("Input an Y value for the point");
					point.setY(tempNum); //Sets y val of point
					
					System.out.print("The point's ordered pair is ");
					point.display(); //Print ordered pair
				}
					break;
				case 6:
					break;
			}
			if(programChooser != 6)
				InputManager.waitForInput("Press any key to return to the menu"); //Pauses for input before resetting
			
		} while(programChooser != 6); //Runs until the user inputs 6 to end the program
	}
	
	private static void printMenu() { //Prints the menu to the screen
		System.out.println("Input a number to choose a program");
		System.out.println("1. Rational Number Test");
		System.out.println("2. Dice Test");
		System.out.println("3. Complex Number Test");
		System.out.println("4. Huge Integer Test");
		System.out.println("5. Point Test");
		System.out.println("6. End Program");
	}
}
