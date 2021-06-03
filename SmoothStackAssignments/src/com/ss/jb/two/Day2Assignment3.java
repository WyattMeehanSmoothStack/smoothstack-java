package com.ss.jb.two;

import java.util.Scanner;

/**
 * @author Wyatt Meehan
 * This class is for solving Assignment 3 from Day to 
 * demonstrating how to use interfaces. 
 */
public class Day2Assignment3 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		//Create objects
		Triangle tri = new Triangle(getInput("triangle base"), getInput("triangle hieght"));
		Circle cir = new Circle(getInput("circle radius"));
		Rectangle rec = new Rectangle(getInput("rectangle length"),getInput("rectangle width"));
		
		//Calculate the areas 
		tri.calculateArea();
		cir.calculateArea();
		rec.calculateArea();
		
		//Display the areas
		tri.display();
		cir.display();
		rec.display();
	}
	
	/**
	 * This method gets input from the user
	 * @param attribute - The attribute we want to get from the user
	 * @return - A positive, validated double taken from the user
	 */
	public static double getInput(String attribute) {
		double validDouble = 0;
		System.out.println("Please enter the " + attribute + ".");
		
		while(true) {
			String userInput = scanner.nextLine();
			try {
				validDouble = Double.parseDouble(userInput);
				if(validDouble > 0) {
					break;
				} else {
					System.out.println("Please make sure your number is positive and greater than 0! Enter the " + attribute + ".");
				}
			} catch(NumberFormatException e) {
				System.out.println("Invalid input, please enter a number! Enter the " + attribute + ".");
				continue;
			}
		}
		return validDouble;
	}
	
		
}
