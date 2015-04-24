package com.btp.stacksandqueues;

import java.util.Stack;

public class StackManager {
	public static int evaluate(String expression) {
		Stack<Integer> stack = new Stack<Integer>();
		expression = expression.replaceAll(" ", ""); //Eliminates spaces from expression
		int sum = 0;
		for(int i = 0; i < expression.length(); i++) {
			if(expression.charAt(i) == '-') { //If subtracting
				//Converts char to an integer, multiplies by 1, and pushes to stack
				stack.push(-1 * Character.getNumericValue(expression.charAt(i + 1)));
				i++; //Skips over next number so it doesn't get used twice
			}
			else if(expression.charAt(i) == '+') {
				//Converts char to an integer and pushes to stack
				stack.push((int) Character.getNumericValue(expression.charAt(i + 1)));
				i++; //Skips over next number so it doesn't get used twice
			}
			else if(expression.charAt(i) == '/') {
				//Pops number from stack, divides by the next number, and pushes the new value to the stack
				stack.push(stack.pop() / Character.getNumericValue(expression.charAt(i + 1)));
				i++; //Skips over next number so it doesn't get used twice
			}
			else if(expression.charAt(i) == '*') {
				//Pops number from stack, multiplies by the next number, and pushes the new value to the stack
				stack.push(stack.pop() * Character.getNumericValue(expression.charAt(i + 1)));
				i++; //Skips over next number so it doesn't get used twice
			}
			else {
				//Pushes the current number to the stack if it is not an operator
				stack.push(Character.getNumericValue(expression.charAt(i)));
			}
		}
		while(stack.size() > 0)
			sum += stack.pop();
		return sum;
	}
}
