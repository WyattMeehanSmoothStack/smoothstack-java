/**
 * 
 */
package com.ss.jb.five;

import java.time.Month;
import java.util.Scanner;
/**
 * @author Wyatt Meehan
 *
 */
public class ListMondays {
	static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static String getMounth() {
		System.out.println("Please enter a month in text!");
		Month month;
		while (true) {
			month = scanner.nextLine().toUpperCase();
			try {
				month = Month.valueOf(month);
			} catch() {
				
			}
			
		}
		return null;
		
	}

}
