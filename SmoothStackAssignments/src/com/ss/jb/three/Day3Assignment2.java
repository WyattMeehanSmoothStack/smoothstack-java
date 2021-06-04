/**
 * 
 */
package com.ss.jb.three;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * This class is for solving Assignment 2 Java Basics part 3. It appends text to
 * an existing text file.
 * 
 * @author Wyatt Meehan
 */
public class Day3Assignment2 {
	static Scanner scanner = new Scanner(System.in);

	/**
	 * This main method creates a loop allowing the user to append to a file
	 * multiple times.
	 * 
	 * @param args - command line arguments
	 */
	public static void main(String[] args) {
		File file1 = findFile();
		while (true) {
			String input1 = getInput();
			append(file1, input1);
		}
	}

	/**
	 * This method prompts the user for a file path and makes sure it exists and is
	 * a text file.
	 * 
	 * @return - A validated text file the user wants to append to.
	 */
	public static File findFile() {
		System.out.println("Please enter the path of the file you would like to append to!");
		File file;
		while (true) {
			String input = scanner.nextLine();
			String isTxt = "";
			file = new File(input);
			// Way to avoid outOfBounds
			if (file.getName().length() > 4) {
				isTxt = file.getName().substring(file.getName().length() - 3);
			}
			if (file.exists() && isTxt.equals("txt")) {
				System.out.println("File found, ready to append.");
				break;
			} else {
				System.out.println("Cannot find file, please enter a valid path to a text file!");
				continue;
			}
		}
		return file;
	}

	/**
	 * This method prompts the user for the text they would like to append and gives
	 * them the option to exit the program.
	 * 
	 * @return - The user input as a String
	 */
	public static String getInput() {
		System.out.println("Please enter the text you would like to append or type exit to stop.");
		String input = scanner.nextLine();
		if (input.equalsIgnoreCase("exit")) {
			System.out.println("Program ended, have a great day!");
			System.exit(0);
		}
		return input;
	}

	/**
	 * This method writes the user input to the file.
	 * 
	 * @param file  - The file the user wishes to append to.
	 * @param input - The user input the user wants appended.
	 */
	public static void append(File file, String input) {
		try {
			FileWriter fileWrite = new FileWriter(file, true);
			BufferedWriter buf = new BufferedWriter(fileWrite);
			buf.write(input);
			buf.close();
			fileWrite.close();
			System.out.println("Append Successfull!");
		} catch (IOException e) {
			System.out.println("Unable to append!");
			e.printStackTrace();
		}
	}

}
