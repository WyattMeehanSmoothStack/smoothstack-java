package com.ss.jb.three;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Wyatt Meehan This class is for solving Assignment 3 in Java Basics
 *         Part 3. It counts the instances of a single character command line
 *         argument in a provided text file. NOTE: This is build to ONLY work if
 *         a single character is provided in command line.
 */
public class Day3Assignment3 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		validateArgs(args);
		File file = findFile();
		System.out.println(count(readFile(file), args[0]) + " instances of command line argument " + args[0]
				+ " were found in file " + file.getName());
		scanner.close();
	}

	/**
	 * This method makes sure that a single character was passed as a command line
	 * argument. If a single character was not passed the program exits.
	 * 
	 * @param args - command line arguments
	 */
	public static void validateArgs(String[] args) {
		if (args.length != 1 || args[0].length() != 1) {
			System.out.println(
					"Invalid command line arguments, please make sure command line arguments is a single character!");
			System.exit(0);
		}
	}

	/**
	 * This method prompts the user for a path to an existing text file. When a
	 * valid path is found the file is returned. This method will loop until the
	 * user provides a valid path.
	 * 
	 * @return - A validated txt file
	 */
	public static File findFile() {
		System.out.println("Please enter the path of the .txt file you would like to read from.");
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
				System.out.println("File found, importing text...\n");
				break;
			} else {
				System.out.println("Cannot find file, please enter a valid path to a text file!");
				continue;
			}
		}
		return file;
	}

	/**
	 * This method reads the text from the file and stores it in a single String.
	 * 
	 * @param file - the file the user provided
	 * @return - a String of all the text in the file
	 * @throws IOException - exceptions caused by the FileReader
	 */
	public static String readFile(File file) throws IOException {
		BufferedReader buf = new BufferedReader(new FileReader(file));
		try {
			StringBuilder sBuild = new StringBuilder();
			String next = buf.readLine();
			while (next != null) {
				sBuild.append(next);
				next = buf.readLine();
			}
			return sBuild.toString();
		} finally {
			buf.close();
		}
	}

	/**
	 * This method counts the instances of the command line arguments in the
	 * extracted String
	 * 
	 * @param text - the string containing all the extracted text
	 * @param find - the command line argument
	 * @return - the final count
	 */
	public static int count(String text, String find) {
		int count = 0;
		char arg = find.charAt(0);
		for (int i = 0; i < text.length(); i++) {
			char next = text.charAt(i);
			if (Character.compare(next, arg) == 0) {
				count++;
			}
		}
		return count;
	}

}
