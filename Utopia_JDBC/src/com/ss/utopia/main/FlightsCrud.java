/**
 * 
 */
package com.ss.utopia.main;

import java.util.Scanner;

/**
 * @author Wyatt Meehan
 *
 */
public class FlightsCrud {
	Scanner scanner;
	
	/**
	 * @param scanner2
	 */
	public FlightsCrud(Scanner scanner) {
		this.scanner = scanner;
	}

	/**
	 * 
	 */
	public void menu() {
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
				
				repeat = false;
				break;
			case "3":
				
				repeat = false;
				break;
			default:
				System.out.println("Invalid input, please enter the number of your selection!");
				continue;
			}
		}
		
	}

}
