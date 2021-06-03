/**
 * 
 */
package com.ss.jb.two;

/**
 * @author Wyatt Meehan
 * This class represents a Triangle
 */
public class Triangle implements Shape {
	private double base;
	private double height;
	private double area;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	/**
	 * This method calculates area
	 */
	public void calculateArea() {
		this.area = (base * height)/2;
	}

	/**
	 * This method rounds the area to 2
	 * decimal places and prints out the area
	 */
	public void display() {
		System.out.println("The area of the triangle is: " + Math.round(area *100.0) / 100.0);
	}

}
