/**
 * 
 */
package com.ss.utopia.main;


import java.sql.Date;
import java.util.Scanner;

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
				pass1.setId(getExInteger("Please enter a 3 digit number for your passengers ID!", 3));
				Booking book = new Booking();
				book.setId(getExInteger("Please enter a unique 3 digit number for your passengers booking!", 3));
				pass1.setBooking(book);
				pass1.setGivenName(getString("Please enter a first name for your passenger!", 255));
				pass1.setFamilyName(getString("Please enter a family name for your passenger!", 255));
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
				
				repeat = false;
				break;

			case "2":

				repeat = false;
				break;

			case "3":

				repeat = false;
				break;

			case "4":

				repeat = false;
				break;
			default:
				System.out.println("Invalid input, please enter the number of your selection!");
				continue;
			}
		}

	}

}
