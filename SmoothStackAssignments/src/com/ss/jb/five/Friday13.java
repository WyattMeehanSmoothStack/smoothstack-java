package com.ss.jb.five;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.ChronoField;
import java.util.Scanner;

/**
 * 
 */

/**
 * This class is for solving Friday the 13th problem in DATe-TIME-API It checks
 * if a provided date was/is on Friday the 13th.
 * 
 * @author Wyatt Meehan
 */
public class Friday13 {
	static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args - command line arguments
	 */
	public static void main(String[] args) {
		isFridayThir(getDate());
	}

	/**
	 * This method checks if the date was on Friday the 13th using ChronoField
	 * 
	 * @param date - the date getting checked
	 */
	public static void isFridayThir(LocalDate date) {
		boolean result = (date.get(ChronoField.DAY_OF_WEEK) == 5) && (date.get(ChronoField.DAY_OF_MONTH) == 13);
		if (result == true) {
			System.out.println(date.toString() + " is/was on Friday the 13th!!!");
		} else {
			System.out.println(date.toString() + " is/was not on Friday the 13th.");
		}
	}

	/**
	 * This method gets a validated LocalDate from the user
	 * 
	 * @return - A date
	 */
	public static LocalDate getDate() {
		LocalDate date;
		Month month;
		int year;
		while (true) {
			System.out.println("Please enter a year!");
			String strYear = (scanner.nextLine());
			try {
				year = Integer.parseInt(strYear);
			} catch (NumberFormatException e) {
				System.out.println("Unable to get date, please try again.");
				continue;
			}
			System.out.println("Please enter a month spelled out in letters!");
			try {
				month = Month.valueOf((scanner.nextLine().toUpperCase()));
			} catch (IllegalArgumentException e) {
				System.out.println("Unable to get date, please try again.");
				continue;
			}
			System.out.println("Please enter a valid day of the month!");
			int day = scanner.nextInt();

			try {
				date = Year.of(year).atMonth(month).atDay(day);
				break;
			} catch (IllegalArgumentException e) {
				System.out.println("Unable to get date, please try again.");
			}
		}
		return date;
	}

}
