/**
 * 
 */
package com.ss.utopia.main;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ss.utopia.domain.Flight;
import com.ss.utopia.service.AdminService;

/**
 * @author Wyatt Meehan
 *
 */
public class FlightsCrud extends CrudHelper {
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
	//			fli1.setAirplane(getAirplane("Please enter the airplane number"));
				System.out.println("Please choose a date for departure by typing the number befor the date!");

				Date date1 = Date.valueOf("2021-08-01");
				Date date2 = Date.valueOf("2021-09-01");
				Date date3 = Date.valueOf("2021-10-01");

				System.out.println("1) " + date1.toString());
				System.out.println("2) " + date2.toString());
				System.out.println("3) " + date3.toString());
				String input2 = scanner.nextLine();
				switch (input2) {
				case "1":
					fli1.setDepartureTime(date1);
					break;
				case "2":
					fli1.setDepartureTime(date1);
					break;
				case "3":
					fli1.setDepartureTime(date3);
				}
				fli1.setReservedSeats(getInteger("Please enter the number of reserved seats", 1000));
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
