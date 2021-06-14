/**
 * 
 */
package com.ss.utopia.main;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author Wyatt Meehan
 *
 */
public class Main {
	static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		mainMenu();
	}

	public static void mainMenu() throws SQLException {
		System.out.println("Welcome to the Utopia Management System. Which category of a user are you?");
		boolean repeat = true;
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
				System.out.println("Administrator selected...\n");
				Admin admin = new Admin(scanner);
				admin.menu();
				repeat = false;
				break;
			case "3":
				System.out.println("Traveler selected...");
				Traveler trav = new Traveler(scanner);
				trav.menu();
				repeat = false;
				break;
			default:
				System.out.println("Invalid input, please enter the number of your selection!");
				continue;
			}
		}

	}

	

}
