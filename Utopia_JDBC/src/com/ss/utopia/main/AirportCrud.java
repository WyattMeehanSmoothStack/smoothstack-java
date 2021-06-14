/**
 * 
 */
package com.ss.utopia.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.ss.utopia.domain.Airport;
import com.ss.utopia.service.AdminService;

/**
 * @author Wyatt Meehan
 *
 */
public class AirportCrud extends CrudHelper {
	static Scanner scanner;
	AdminService as = new AdminService();

	public AirportCrud(Scanner scanner) {
		AirportCrud.scanner = scanner;
	}

	/**
	 * @throws SQLException
	 * 
	 */
	public void menu() throws SQLException {
		boolean repeat = true;
		while (repeat) {
			System.out.println("Chose opperation to perform on Airports table.");
			System.out.println("1) Add");
			System.out.println("2) Update");
			System.out.println("3) Delete");
			System.out.println("4) Read");
			String input = scanner.nextLine();
			switch (input) {
			case "1":
				Airport air1 = new Airport();
				air1.setAirportID(getExString("Please enter 3 letter airport code", 3).toUpperCase());
				air1.setCity(getString("Please enter city", 45));
				air1.setRoutes(null);
				as.addAirport(air1);
				repeat = false;
				break;
			case "2":
				List<Airport> list = new ArrayList<Airport>();
				list = as.listAirports();
				System.out.println("Here are the available airports.");
				for (Airport a : list) {
					System.out.println(a.getAirportID());
				}
				String code;
				String newCode = null;
				String newCity = null;
				while (true) {
					code = (getExString("Please enter 3 letter airport code you want to update", 3).toUpperCase());
					for (Airport a : list) {
						if (code.equals(a.getAirportID())) {
							newCode = (getExString("Please enter the new 3 letter airport code", 3).toUpperCase());
							newCity = (getString("Please enter the city name", 45));
							break;
						} else {
							continue;
						}
					} break;
				} 
				Airport air2 = new Airport();
				air2.setAirportID(newCode);
				air2.setCity(newCity);
				as.updateAirport(air2, code);
				repeat = false;
				break;
			case "3":
				Airport air3 = new Airport();
				air3.setAirportID(
						getExString("Please enter 3 letter airport code you want to delete.", 3).toUpperCase());
				as.deleteAirport(air3);
				repeat = false;
				break;
			case "4":
				List<Airport> list2 = new ArrayList<Airport>();
				list2 = as.listAirports();
				System.out.println("Here are the available airports.");
				for (Airport a : list2) {
					System.out.printf("%-15s %-15s\n","Code: " + a.getAirportID(), "City: " + a.getCity());
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
