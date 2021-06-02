package com.ss.jb.one;

import java.util.Random;
import java.util.Scanner;

/**
 * This class is for Java Basics Assignment 2
 * @author Wyatt Meehan
 */

public class Assignment2 {
	static final int UPPER_BOUND = 100;
	static final int LOWER_BOUND = 1;
	static Random rng = new Random();
	static String intro = "Hello! Please guess a number between 1-100.";
	static Scanner scanner = new Scanner(System.in);
	static int correctAns = rng.nextInt(100) + 1; // random.nextInt(max - min + 1) + min

	/**
	 * Main Method
	 */
	public static void main(String[] args) {
		printIntro();
		mainGameLoop();
	}

	/**
	 * Method for printing the game introduction
	 */
	public static void printIntro() {
		System.out.println(intro);
	}

	/**
	 * Method for running the main game loop
	 */
	public static void mainGameLoop() {
		for (int i = 0; i < 5; i++) {
			int guess = getGuess();

			if (guess >= correctAns - 10 && guess <= correctAns + 10) {
				System.out.println("Great guess! The correct answer was: " + correctAns);
				System.exit(0);
			} else if (i < 4) {
				System.out.println("Sorry that guess is not within 10 of the correct answer, please guess again!");
			}
		}

		System.out.println("Sorry, the answer was: " + correctAns);
	}
	
	/**
	 * This method is for getting the users guess and making sure its valid
	 * 
	 * @return The users Guess
	 */
	public static int getGuess() {
		int guess;

		// Validation Loop
		while (true) {
			String input = scanner.next();
			// Try to Parse for Type checking
			try {
				guess = Integer.parseInt(input);
				// Checking if guess is in the bounds 1-100
				if (guess >= LOWER_BOUND && guess <= UPPER_BOUND) {
					break;
				} else {
					System.out.println("Please make sure your guess is between 1 and 100 inclusive!");
				}

			} catch (NumberFormatException e) {
				System.out.println("Invalid type, Please enter an integer!");
				continue;
			}
		}
		return guess;
	}

}
