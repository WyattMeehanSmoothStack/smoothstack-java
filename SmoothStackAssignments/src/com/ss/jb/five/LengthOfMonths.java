/**
 * 
 */
package com.ss.jb.five;

import java.time.DateTimeException;
import java.time.Month;
import java.time.YearMonth;
import java.util.Scanner;

/**
 * @author Wyatt Meehan
 *
 */
public class LengthOfMonths {
	static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args - command line arguments
	 */
	public static void main(String[] args) {
		int year = getYear();
		printMounths(year);
	}

	/**
	 * This method prints the length in days of each month in the provided year.
	 * 
	 * @param year - The year we want to print the months of
	 */
	public static void printMounths(int year) {
		for (Month month : Month.values()) {
			YearMonth ym = YearMonth.of(year, month);
			System.out.printf("%s: %d days%n", month, ym.lengthOfMonth());
		}
	}

	/**
	 * This method gets a validated Year from the user
	 * 
	 * @return
	 */
	public static int getYear() {
		System.out.println("Please enter a year!");
		int year;
		while (true) {
			String str = scanner.nextLine();
			try {
				year = Integer.parseInt(str);
			} catch (NumberFormatException e) {
				System.out.println("Please enter year using numbers.");
				continue;
			}

			try {
				break;
			} catch (DateTimeException exc) {
				System.out.println("Not a valid year, please enter a new year using numbers.");

			}
		}
		return year;
	}

}
