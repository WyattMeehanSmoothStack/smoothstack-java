package com.ss.jb.three;

import java.io.File;
import java.util.Scanner;

/**
 * This class is for solving Assignment 1 Java Basics 3. It prints all the files
 * and directories found under a given directory path.
 * 
 * @author Wyatt Meehan
 */
public class Day3Assignment1 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		File file = createFile();
		File[] fileList = file.listFiles();
		if (fileList != null) {
			printFileList(fileList);
		}

	}

	/**
	 * This method asks the user for a valid path until the user is able to provide
	 * one.
	 * 
	 * @return A validated file
	 */
	public static File createFile() {
		System.out.println("Please enter the file path with no outer quotation marks.");
		File file;
		while (true) {
			String input = scanner.nextLine();
			file = new File(input);
			if (file.exists()) {
				break;
			} else {
				System.out.println("Cannot find file, please enter a valid path with no outer quotation mark.");
				continue;
			}
		}
		return file;
	}

	/**
	 * This method prints all files in the given directory including those inside
	 * sub-directories. It does this using recursion.
	 * 
	 * @param fileList - List of files found in directory
	 */
	public static void printFileList(File[] fileList) {
		for (File fileDoc : fileList) {
			if (fileDoc.isDirectory()) {
				System.out.println(fileDoc);
				printFileList(fileDoc.listFiles()); // Recursive Call
			} else {
				System.out.println(fileDoc);
			}
		}

	}

}
