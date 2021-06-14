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
public class Admin {
	static Scanner scanner;

	/**
	 * @param scanner2
	 */
	public Admin(Scanner scanner) {
		Admin.scanner = scanner;
	}

	/**
	 * @throws SQLException 
	 * 
	 */
	public void menu() throws SQLException {
		boolean repeat = true;
		while (repeat) {
			System.out.println("Please select the category you would like to alter.");
			System.out.println("1) Flights");
			System.out.println("2) Seats");
			System.out.println("3) Tickets and Passengers");
			System.out.println("4) Airports");
			System.out.println("5) Travelers");
			System.out.println("6) Employees");
			System.out.println("7) Over-ride Trip Cancellation for a Ticket");
			String input = scanner.nextLine();

			switch (input) {
			case "1":
				FlightsCrud flightsCrud = new FlightsCrud(scanner);
				flightsCrud.menu();
				repeat = false;
				break;
			case "2":
				SeatsCrud seats = new SeatsCrud(scanner);
				seats.menu();
				repeat = false;
				break;
			case "3":
				TAPCrud tp = new TAPCrud(scanner);
				tp.menu();
				repeat = false;
				break;
			case "4":
				AirportCrud ac = new AirportCrud(scanner);
				ac.menu();
				repeat = false;
				break;
			case "5":
				TravelersCrud tc = new TravelersCrud(scanner);
				tc.menu();
				repeat = false;
				break;
			case "6":
				EmployeesCrud ec = new EmployeesCrud(scanner);
				ec.menu();
				repeat = false;
				break;
			case "7":
				OverideTC over = new OverideTC(scanner);
				over.menu();
				repeat = false;
				break;
			default:
				System.out.println("Invalid input, please enter the number of your selection!");
				continue;
			}
		}
	}

}
