/**
 * 
 */
package com.ss.utopia.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ss.utopia.domain.Airport;
import com.ss.utopia.domain.Flight;
import com.ss.utopia.service.AdminService;

/**
 * @author Wyatt Meehan
 *
 */
public class FlightsCrud extends CrudHelper{
	static Scanner scanner;
	AdminService as = new AdminService();

	/**
	 * @param scanner2
	 */
	public FlightsCrud(Scanner scanner) {
		FlightsCrud.scanner = scanner;
	}

	/**
	 * 
	 */
	public void menu() {
		boolean repeat = true;
		while (repeat) {
			System.out.println("Chose opperation to perform on Flights table.");
			System.out.println("1) Add Flight");
			System.out.println("2) Update Flight");
			System.out.println("3) Delete Flight");
			System.out.println("4) Read Flights");
			String input = scanner.nextLine();
			switch (input) {
			case "1":
				Flight fli1 = new Flight();
				fli1.setId(getExInteger("Please enter a flight id of length 3", 3));
				fli1.setAirplane(getAirplane("Please enter the airplane number"));
			//	fli1.setDepartureTime(input);
				fli1.setReservedSeats(null);
				fli1.setRoute(null);
				fli1.setSeatPrice(null);
				repeat = false;
				break;
			case "2":

				repeat = false;
				break;
			case "3":

				repeat = false;
				break;
			case "4":
				List<Flight> list2 = new ArrayList<Flight>();
				list2 = as.listFlights();
				for (Flight f : list2) {
					System.out.printf("%-10s %-15s\n", "Flight id: " + f.getId(), "Airplane id:" + f.getAirplane());
				}
				repeat = false;
				break;
			default:
				System.out.println("Invalid input, please enter the number of your selection!");
				continue;
			}
		}

	}
	
}
