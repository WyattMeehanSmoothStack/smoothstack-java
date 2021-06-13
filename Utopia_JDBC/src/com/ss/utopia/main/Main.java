/**
 * 
 */
package com.ss.utopia.main;

import java.util.Scanner;

/**
 * @author Wyatt Meehan1
 *
 */
public class Main {
	static Scanner scanner = new Scanner(System.in);
	static boolean repeat = true;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		mainMenu();

	}

	public static void mainMenu() {
		System.out.println("Welcome to the Utopia Management System. Which category of a user are you?");
		while (repeat) {
			System.out.println("1) Employee/Agent");
			System.out.println("2) Administrator");
			System.out.println("3) Traveler");
			String input = scanner.nextLine();
			switch (input) {
			case "1":
				System.out.println("Employee/Agent comming soon! Please select another option.");
				continue;
			case "2":
				System.out.println("Administrator selected...");
				adminMenu();
				repeat = false;
				break;
			case "3":
				System.out.println("Traveler selected...");
				travelerMenu();
				repeat = false;
				break;
			default:
				System.out.println("Invalid input, please enter the number of your selection!");
				continue;
			}
		}

	}

	/**
	 * 
	 */
	public static void travelerMenu() {

	}

	/**
	 * 
	 */
	public static void adminMenu() {
		

	}
}
