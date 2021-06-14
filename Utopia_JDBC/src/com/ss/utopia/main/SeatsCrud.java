/**
 * 
 */
package com.ss.utopia.main;

import java.util.Scanner;

import com.ss.utopia.service.AdminService;

/**
 * @author Wyatt Meehan
 *
 */
public class SeatsCrud {
	static Scanner scanner;
	AdminService as = new AdminService();
	
	public SeatsCrud(Scanner scanner) {
		SeatsCrud.scanner = scanner;
	}


	public void menu() {
		System.out.println(as.listFlights());
		
		
	}

}
