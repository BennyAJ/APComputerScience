package classes;

public class ComplexNum {
	private int realNum;
	private int imaginaryNum;
	
	public ComplexNum() {
		realNum = 1; //Sets real part to 1
		imaginaryNum = 1; //Sets imaginary part to 1
	}
	
	public ComplexNum(int realNum, int imaginaryNum) {
		this.realNum = realNum; //Sets real part to input
		this.imaginaryNum = imaginaryNum; //Sets imaginary part to input
	}
	
	public void setRealNum(int realNum) {
		this.realNum = realNum; //Sets real part
	}
	
	public void setImaginaryNum(int imaginaryNum) {
		this.imaginaryNum = imaginaryNum; //Sets imaginary part
	}
	
	public void add(ComplexNum complex) {
		realNum += complex.realNum; //Add real part
		imaginaryNum += complex.imaginaryNum; //Add imaginary part
	}
	
	public void subtract(ComplexNum complex) {
		realNum -= complex.realNum; //Subtract real part
		imaginaryNum -= complex.imaginaryNum; //Subtract imaginary part
	}
	
	public void display() {
		System.out.println("The complex number is " + realNum + " + " + imaginaryNum + "i"); //Prints complex
	}
	
	@Override
	public String toString() {
		return (realNum + " + " + imaginaryNum + "i"); //Returns complex num as a string 
	}
	
	
}
