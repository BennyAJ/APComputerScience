package com.btp.classes;

public class Point {
	private int x; //x coordinate
	private int y; //y coordinate
	
	public Point() {
		x = 0; //Sets x to 0
		y = 0; //sets y to 0
	}
	
	public Point(int x, int y) {
		this.x = x; //Sets x to given x
		this.y = y; //Sets y to given y
	}
	
	public void setX(int x) {
		this.x = x; //Sets x to given x
	}
	
	public void setY(int y) {
		this.y = y; //Sets y to given y
	}
	
	public void display() {
		System.out.println(x + "," + y); //Prints ordered pair
	}
	
	@Override
	public String toString() {
		return (x + "," + y); //Returns ordered pair
	}
}
