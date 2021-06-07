/**
 * 
 */
package com.ss.jb.five;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class filters a list of Strings to only contain strings that 
 * start with lower case "a" and have 3 letters. It uses Lambda functions and Streams. 
 * 
 * @author Wyatt Meehan
 */
public class Day5Assignment3 {

	/**
	 * This main creates a list and then filters and prints that list.
	 * 
	 * @param args - command line arguments
	 */
	public static void main(String[] args) {
		List<String> list = createList();
		System.out.println(filter(list));

	}

	/**
	 * This method returns a filtered list of words containing only those which
	 * start with "a" and have 3 letters.
	 * 
	 * @param list - List of words
	 * @return - a filtered list of words
	 */
	public static List<String> filter(List<String> list) {
		return list.stream().map(s -> s.replace(" ", "")) // removes whitespace
							.filter((str) -> str.charAt(0) == 'a' && str.length() == 3)
							.collect(Collectors.toList());
	}

	/**
	 * This method returns a list of strings
	 * 
	 * @return - A list of Strings
	 */
	public static List<String> createList() {
		List<String> list = new ArrayList<String>();
		list.add("abs");
		list.add("ball");
		list.add("hi");
		list.add("ai ");
		list.add("ask");
		list.add("art");
		list.add("fat");
		list.add("Art");
		list.add("Artist");
		return list;
	}
	


}
