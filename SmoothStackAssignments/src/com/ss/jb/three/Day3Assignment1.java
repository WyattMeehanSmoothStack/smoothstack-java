package com.ss.jb.three;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * This class is for solving Assignment 1 Java Basics 3.
 * It prints all the files and directories found under a given directory path. 
 * @author Wyatt Meehan
 */
public class Day3Assignment1 {
	
	
	public static void main(String[] args) {
		
		File file = createFile();
		String[] fileList = file.list();
		printFileList(fileList);
		
	}
	
	public static File createFile() {
		File file;
		try {
			 file = new File("C:\\Test");
		} catch (FileNotFoundException e) {
			
		}
		return file;
	}
	
	/**
	 * This method returns a list of files found under the passed list
	 * @param fileList - List of files found under directory
	 */
	public static void printFileList(String[] fileList) {
		for(String fileDoc : fileList) {
			System.out.println(fileDoc);
		}
	}
	
	
}
