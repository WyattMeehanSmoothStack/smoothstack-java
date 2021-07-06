/**
 * 
 */
package com.ss.utopia.main;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ss.utopia.domain.Airport;
import com.ss.utopia.domain.Booking;
import com.ss.utopia.domain.Passenger;
import com.ss.utopia.service.AdminService;

/**
 * @author Wyatt Meehan
 *
 */
public class TAPCrud extends CrudHelper {
	Scanner scanner;
	AdminService as = new AdminService();

	public TAPCrud(Scanner scanner) {
		this.scanner = scanner;
	}

	/**
	 * 
	 */
	public void menu() {
		boolean repeat = true;
		while (repeat) {
			System.out.println("Chose opperation to perform on Passenger table.");
			System.out.println("1) Add");
			System.out.println("2) Update");
			System.out.println("3) Delete");
			System.out.println("4) Read");
			String input = scanner.nextLine();
			switch (input) {
			case "1":
				Passenger pass1 = new Passenger();
				Booking book = new Booking();
				book.setId(getExInteger("Please enter a unique 3 digit number for your passengers booking!", 3));
				
				pass1.setBooking(book);
				String givenName = getString("Please enter a first name for your passenger!", 255);
				scanner.nextLine();
				pass1.setGivenName(givenName);
				String falmilyName = (getString("Please enter a family name for your passenger!", 255));
				pass1.setFamilyName(falmilyName);
				Date dob = new Date(0);
				//Validation loop
				boolean repeat1 = true;
				while (repeat1) {
					String date = getExString("Please enter a date of birth for your passenger in this format: XXXX-XX-XX  :"
							+ "The order is Year-Month-Day", 10);
					try {
						dob = Date.valueOf(date);
						repeat1 = false;
					} catch(Exception e) {
						System.out.println("Please make sure you enter a valid date, try again!");
						continue;
					}
				}
				pass1.setDob(dob);
				pass1.setGender(getString("Please enter a gender for your passenger!", 45));
				pass1.setAddress(getString("Please enter a address for your passenger!", 45));
				as.addPassenger(pass1);
				repeat = false;
				break;

			case "2":
				repeat = false;
				break;

			case "3":
				Passenger pass3 = new Passenger();
				pass3.setId(getExInteger("Please enter the 3 digit passenger code that you would like to delete", 3));
				as.deletePassenger(pass3);
				repeat = false;
				break;

			case "4":
				List<Passenger> passengerList = new ArrayList<Passenger>();
				passengerList = as.listPassengers();
				System.out.println("Passenger List: ");
				for (Passenger pass : passengerList) {
					System.out.printf("%-15s %-15s\n","Code: " + pass.getId(), "Family Name: " + pass.getFamilyName());
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
