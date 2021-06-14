/**
 * 
 */
package com.ss.utopia.main;

import java.util.Scanner;

import com.ss.utopia.domain.Airplane;

/**
 * @author Wyatt Meehan
 *
 */
public class CrudHelper {
	 static Scanner scanner = new Scanner(System.in);

	public static String getString(String question, int maxLength) {
		String answer;
		while (true) {
			System.out.println(question);
			answer = scanner.nextLine();
			if (answer.length() < maxLength) {
				return answer;
			} else {
				System.out.println("Response too long, please anser in ." + maxLength + "characters or less.");
			}
		}
	}
	
	public static String getExString(String question, int length) {
		String answer;
		while (true) {
			System.out.println(question);
			answer = scanner.nextLine();
			if (answer.length() == length) {
				return answer;
			} else {
				System.out.println("Response does not match field, please resond with a String of length " + length);
			}
		}
	}
	
	public static Integer getExInteger(String question, int length) {
		Integer answer;
		while (true) {
			System.out.println(question);
			answer = scanner.nextInt();
			if (String.valueOf(answer).length() == length) {
				return answer;
			} else {
				System.out.println("Response does not match field, please resond with an Integer of length " + length);
			}
		}
	}
	
	public static Airplane getAirplane(String question) {
		Airplane airplane = new Airplane();
			System.out.println(question);
			airplane.setId(scanner.nextInt());
		return airplane;
	}


}
