package methods;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////Benny Johnson Methods WS///////////////////////////////////////////////////////////
////////////////////////////////////////Completed 10/3/2014//////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Main {

	public static void main(String[] args) {
		int tempNum = 0;
		int tempNum2 = 0;
		float tempFloat = 0;
		String tempString = "";
		int[] diceArray = new int[6];
		
		do {
			printMenu();
			tempNum = InputManager.getNumInput("Input Here: ");
			switch(tempNum) {
				case 1:
					tempNum = InputManager.getNumInput("Input a number of dice rolls");
					MethodManager.rollDice(diceArray, tempNum);
					MethodManager.displayDiceRolls(diceArray);
					break;
				case 2:
					tempNum = InputManager.getNumInput("Input the base number");
					tempNum2 = InputManager.getNumInput("Input the exponent");
					System.out.println("The value of the power is " + MethodManager.getPower(tempNum, tempNum2));
					break;
				case 3:
					tempNum = InputManager.getNumInput("Input the length of a side of a right triangle");
					tempNum2 = InputManager.getNumInput("Input the length of the other side");
					System.out.println("The length of the hypotenuse is " + MethodManager.getHypotenuse(tempNum, tempNum2));
					break;
				case 4:
					tempNum = InputManager.getNumInput("Input a number");
					if(MethodManager.isEven(tempNum))
						System.out.println("The number is even");
					else
						System.out.println("The number is odd");
					break;
				case 5:
					tempNum = InputManager.getNumInput("Input the length of a side of a right triangle");
					tempNum2 = InputManager.getNumInput("Input the length of the hypotenuse");
					System.out.println("The length of the third side is " + MethodManager.getSide(tempNum, tempNum2));
					break;
				case 6:
					tempFloat = InputManager.getFloatInput("Input a number");
					tempNum = InputManager.getNumInput("Input the amount of places to round to");
					System.out.println("The rounded number is " + MethodManager.roundDecimal(tempFloat, tempNum));
					break;
				case 7:
					tempFloat = InputManager.getFloatInput("Input a temperature in Celsius");
					System.out.println("The temperature in Fahrenheit is " + MethodManager.celsiusToFahrenheit(tempFloat));
					break;
				case 8:
					tempFloat = InputManager.getFloatInput("Input a temperature in Fahrenheit");
					System.out.println("The temperature in Celsius is " + MethodManager.fahrenheitToCelsius(tempFloat));
					break;
				case 9:
					tempNum = InputManager.getNumInput("Input a number");
					if(MethodManager.isPrime(tempNum))
						System.out.println("The number is prime");
					else
						System.out.println("The number is not prime");
					break;
				case 10:
					tempNum = InputManager.getNumInput("Input a number");
					tempNum2 = InputManager.getNumInput("Input another number");
					if(MethodManager.isMultiple(tempNum, tempNum2))
						System.out.println("The second number is a multiple of the first");
					else
						System.out.println("The second number is not a multiple of the first");
					break;
				case 11:
					tempString = InputManager.getStringInput("Input a string");
					System.out.println("The reversed string is " + MethodManager.reverseString(tempString));
					break;
				case 12:
					tempNum = InputManager.getNumInput("Input a number");
					if(MethodManager.isArmstrongNum(tempNum))
						System.out.println("The number is an armstrong number");
					else
						System.out.println("The number is not an armstrong number");
					break;
				case 13:
					break;
			}
			InputManager.waitForInput("Press any key to return to the menu");
		} while(tempNum != 13);
	}
	
	private static void printMenu() {
		System.out.println("Input a number to choose a program");
		System.out.println("1. Roll an amount of dice and get the results");
		System.out.println("2. Finds the power of a number");
		System.out.println("3. Finds the hypotenuse of a triangle given two sides");
		System.out.println("4. Tells whether a number is even or odd");
		System.out.println("5. Finds a side of a triangle given a hypotenuse and a side");
		System.out.println("6. Rounds a number to a certain amount of decimal places");
		System.out.println("7. Converts from Celsius to Fahrenheit");
		System.out.println("8. Converts from Fahrenheit to Celsius");
		System.out.println("9. Tells if a number is prime");
		System.out.println("10. Tells if a number is a multiple of another");
		System.out.println("11. Prints a given string backwards");
		System.out.println("12. Checks if a number is an armstrong number");
		System.out.println("13. End Program");
	}
}
