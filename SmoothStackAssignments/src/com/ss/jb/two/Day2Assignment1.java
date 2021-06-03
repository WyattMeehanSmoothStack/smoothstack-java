package com.ss.jb.two;

/**
 * @author Wyatt Meehan 
 * This class is for Java Basics Day 2 Assignment 1.
 * Its function is to add command line arguments together.
 */
public class Day2Assignment1 {

	/**
	 * This main method prints a short message and 
	 * calls the sum method.
	 * @param args - command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("The sum of all command line arguments is " + sum(args));
	}

	/**
	 * This method adds any integer command line arguments together. It 
	 * will exclude any Strings and print them to the console.
	 * @param comArgs - command line arguments
	 * @return the sum of command line arguments
	 */
	public static int sum(String[] comArgs) {
		int sum = 0;
		for (String arg : comArgs) {
			try {
				sum += Double.parseDouble(arg); 
			} catch (NumberFormatException e) {
				System.out.println("Command line argument \"" + arg + "\" is not an number and was ignored.");
			}
		}
		return sum;
	}

}
