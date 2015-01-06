package classes;

public class Rational {
	private int numerator;
	private int denominator;
	
	public Rational() { //Default fraction is 0/1
		this.numerator = 0;
		this.denominator = 1;
	}
	
	public Rational(int numerator, int denominator) { //User inputs parts
		this.numerator = numerator; //Sets numerator to input
		this.denominator = denominator; //Sets denominator to input
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator; //Sets numerator to input
	}
	
	public void setDenominator(int denominator) {
		this.denominator = denominator; //Sets denominator to input
	}
	
	private void simplify() {
		int tempNum = 0;
		int gcf = numerator; //Final gcf value
		int remainder = denominator; //Used to calculate gcf
		
		while(remainder != 0) { //Runs until it's divide with no remainder
			tempNum = remainder; //Saves previous remainder
			remainder = gcf % remainder; //Gets new remainder
			gcf = Math.abs(tempNum); //Sets gcf to previous remainder, always pos
		}
		
		numerator /= gcf; //Simplifies by dividing by the gcf
		denominator /= gcf; //Simplifies by dividing by the gcf
	}
	
	private void resolveNegatives() {
		//Temp num is -1 if both are negative, is +1 in all other cases
		int tempNum = -1 * (denominator * numerator)/Math.abs(denominator * numerator);
		numerator *= tempNum; //Switches signs on numerator if needed
		denominator *= tempNum; //Switches signs on denominator if needed
		
		if(denominator < 0) { //If denominator is negative after sign fix
			numerator *= -1; //Make the numerator negative
			denominator *= -1; //Make the denominator positive
		}
		
	}
	
	public void add(Rational inputRational) {
		int tempNum = denominator; //Saves denominator of first rational
		numerator *= inputRational.denominator;   //Getting common denominators by
		denominator *= inputRational.denominator; //Multiplying by opposite denominator
		
		inputRational.numerator *= tempNum;   //Uses saved denominator 
		inputRational.denominator *= tempNum; //to get other common denominators
		
		numerator += inputRational.numerator; //Add numerators	
		
		resolveNegatives(); //Fixes negatives on bottom or double negatives
		simplify(); //Puts fraction in simplest terms
		inputRational.simplify(); //Fixes the original input rational
		
	}
	
	public void subtract(Rational inputRational) {
		int tempNum = denominator; //Saves denominator of first rational
		numerator *= inputRational.denominator;   //Getting common denominators by
		denominator *= inputRational.denominator; //Multiplying by opposite denominator
		
		inputRational.numerator *= tempNum;   //Uses saved denominator 
		inputRational.denominator *= tempNum; //to get other common denominators
		
		numerator -= inputRational.numerator; //Subtracts numerators	
		
		resolveNegatives(); //Fixes negatives on bottom or double negatives
		simplify(); //Puts fraction in simplest terms
		inputRational.simplify(); //Fixes the original input rational
	}
	
	public void multiply(Rational inputRational) {
		numerator *= inputRational.numerator; //Multiply numerators
		denominator *= inputRational.denominator; //Multiply denominators
		
		resolveNegatives(); //Fixes negatives on bottom or double negatives
		simplify(); //Puts fraction in simplest terms
	}
	
	public void divide(Rational inputRational) {
		if(inputRational.numerator != 0) { //If not dividing by 0
			numerator *= inputRational.denominator; //Multiplying by reciprocal
			denominator *= inputRational.numerator; //Multiplying by reciprocal
			
			resolveNegatives(); //Fixes negatives on bottom or double negatives
			simplify(); //Puts fraction in simplest terms
		}
		else //If dividing by 0
			System.err.println("Cannot divide by zero"); //Print an error
		

	}
	
	@Override
	public String toString() {
		return(this.numerator + "/" + this.denominator); //Outputs as n/d
	}
	
}
