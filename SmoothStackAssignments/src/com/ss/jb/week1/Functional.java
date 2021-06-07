/**
 * 
 */
package com.ss.jb.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class is for solving week 1 functional problems 2 - 4.
 * 
 * @author Wyatt Meehan
 */
public class Functional {

	/**
	 * @param args - command line arguments
	 */
	public static void main(String[] args) {
		System.out.println(rightDigit(posList()));
		System.out.println(doubling(posList()));
		System.out.println(noX(stringList()));
		
	}
	
	/**
	 * This method is for getting the rightmost digit from a list on integers and adding them to a new list.
	 * 
	 * @param list - incoming list
	 * @return - list of rightmost digits 
	 */
	public static List<Integer> rightDigit(List<Integer> list) {
		return list.stream().map(n -> (n % 10))
							.collect(Collectors.toList());
	}
	
	/**
	 * This method is for doubling all the integers in a list.
	 * 
	 * @param list - incoming list
	 * @return - list of doubled integers
	 */
	public static List<Integer> doubling(List<Integer> list) {
		return list.stream().map(n -> (n * 2))
							.collect(Collectors.toList());
	}
	
	/**
	 * This method is for removing all x's from a list of strings.
	 * 
	 * @param list - incoming list
	 * @return
	 */
	public static List<String> noX(List<String> list) {
		return list.stream().map(s -> s.replace("x", ""))
							.collect(Collectors.toList());
	}
	
	/**
	 * This method creates some test cases for the methods above.
	 * 
	 * @return - list of test cases
	 */
	public static List<Integer> posList() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(22);
		list.add(93);
		list.add(1002);
		list.add(0);
		return list;
	}
	
	/**
	 * This method creates some test cases for the methods above.
	 * 
	 * @return - list of test cases
	 */
	public static List<String> stringList() {
		List<String> list = new ArrayList<String>();
		list.add("abdxxx");
		list.add("xxxxx");
		list.add("hi");
		list.add("SmoothStack");
		list.add("Wyatt x Wyatt x");
		return list;
	}

}
