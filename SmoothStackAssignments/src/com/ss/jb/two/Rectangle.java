
package com.ss.jb.two;

/**
 * @author Wyatt Meehan
 * This class represents a Rectangle 
 */
public class Rectangle implements Shape {
	private double length;
	private double width;
	private double area;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width; 
	}
	
	/**
	 * This method calculates area
	 */
	public void calculateArea() {
		this.area = length * width;
	}

	/**
	 * This method rounds the area to 2
	 * decimal places and prints out the area
	 */
	public void display() {
		System.out.println("The area of the rectangle is: " + Math.round(area *100.0) / 100.0);
	}

}
