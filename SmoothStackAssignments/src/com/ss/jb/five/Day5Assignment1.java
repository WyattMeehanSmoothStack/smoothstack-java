/**
 * 
 */
package com.ss.jb.five;

import java.util.Arrays;
import java.util.Comparator;

/**
 * This class is for sorting arrays using Java 8 features
 * 
 * @author Wyatt Meehan
 */
public class Day5Assignment1 {

	/**
	 * 
	 * @param args - command line arguments
	 */
	public static void main(String[] args) {
		String[] arr = createArray();
		shortToLong(arr);
		longToShort(arr);
		alphabetical(arr);
		eFirst(arr);
		eFirstAlt(arr);
	}
	
	public static String[] createArray() {
		String[] array = {"hello", "abd", "hi", "my name is Wyatt", "z", "doc", "SmoothStack", "eTest"};
		return array;
	}
	
	public static String shortToLong(String[] arr) {
		Arrays.sort(arr, (s1, s2) -> (s1.length() - s2.length()));
		System.out.println("Short to long:");
		System.out.println(Arrays.toString(arr) + "\n");
		return Arrays.toString(arr);
	}
	
	public static String longToShort(String[] arr) {
		Arrays.sort(arr, (s1, s2) -> (s2.length() - s1.length()));
		System.out.println("Long to short:");
		System.out.println(Arrays.toString(arr) + "\n");
		return Arrays.toString(arr);
	}
	
	public static String alphabetical(String[] arr) {
		Arrays.sort(arr, (s1, s2) -> (s1.toUpperCase().charAt(0) - s2.toUpperCase().charAt(0)));
		System.out.println("Alphebetical (first letter):");
		System.out.println(Arrays.toString(arr) + "\n");
		return Arrays.toString(arr);
	}
	
	public static String eFirst(String[] arr) {
		Arrays.sort(arr, (s1, s2) -> (s1.contains("e") && !s2.contains("e")) ? -1 : 1);
		System.out.println("Contains \"e\" first: ");
		System.out.println(Arrays.toString(arr) + "\n");
		return Arrays.toString(arr);
	}
	
	public static String eFirstAlt(String[] arr) {
		Arrays.sort(arr, Comparator.comparingInt(x -> (x.contains("e") ? 0 : 1)));
		System.out.println("Contains \"e\" first (alternate) : ");
		System.out.println(Arrays.toString(arr) + "\n");
		return Arrays.toString(arr);
	}

	
}
