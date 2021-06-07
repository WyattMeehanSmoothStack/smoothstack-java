/**
 * 
 */
package com.ss.jb.five;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

/**
 * This class is for solving the list Mondays problem. It lists all the Mondays
 * in a given month.
 * 
 * @author Wyatt Meehan
 */
public class ListMondays {
	static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printMondays(getMonth());
	}

	/**
	 * This method gets all the Mondays from the provided month and prints them.
	 * 
	 * @param month - provided month
	 */
	public static void printMondays(Month month) {
		LocalDate monday = Year.now().atMonth(month).atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)); // Get first Monday of month
		Month temp = monday.getMonth();
		while (temp == month) {
			System.out.println(monday);
			monday = monday.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			temp = monday.getMonth();
		}
	}

	/**
	 * This method gets a valid month from the user.
	 * 
	 * @return - a valid month
	 */
	public static Month getMonth() {
		System.out.println("Please enter a month in text!");
		Month month;
		while (true) {
			try {
				month = Month.valueOf((scanner.nextLine().toUpperCase()));
				break;
			} catch (IllegalArgumentException e) {
				System.out.println("Unable to get month, please check your spelling and try again!");
			}
		}
		return month;

	}

}
