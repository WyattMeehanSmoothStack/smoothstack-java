/**
 * 
 */
package com.ss.jb.two;

/**
 * @author Wyatt Meehan
 * This class represents a Circle
 */
public class Circle implements Shape {
	private double radius;
	private double area;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/**
	 * This method calculates area
	 */
	public void calculateArea() {
		this.area = Math.PI * Math.pow(radius, 2) ;
	}

	/**
	 * This method rounds the area to 2
	 * decimal places and prints out the area
	 */
	public void display() {
		System.out.println("The area of the circle is: " + Math.round(area *100.0) / 100.0);
	}

}
