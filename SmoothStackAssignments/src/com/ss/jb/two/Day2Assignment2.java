package com.ss.jb.two;

import java.util.Random;

/**
 * Note to evaluators: I know how to make these processes less expensive. For
 * instance I could have found the max and generated the 2D array in the same
 * loops. It was a tradeoff I made for readability that I'm not sure about and
 * would appreciate some feedback. Thanks! - Wyatt
 * 
 * @author Wyatt Meehan This class is for solving Day 2 Assignment 2 in Java
 *         Basics. It finds first max value in a randomly generated 2D array.
 */
public class Day2Assignment2 {
	static Random rng = new Random();
	static int maxValue = 500;
	static int minValue = 1;
	static int arrRows = 5;
	static int arrColumns = 5;

	public static void main(String[] args) {
		int[][] twoArr = createArray();
		findMax(twoArr);
	}

	/**
	 * This method finds the first instance of the minimum value. It prints this
	 * value along with the its location in indices.
	 * 
	 * @param twoArray - Randomly generated 2D array
	 */
	public static void findMax(int[][] twoArray) {
		int max = Integer.MIN_VALUE;
		int maxI = 0;
		int maxJ = 0;
		for (int i = 0; i < arrRows; i++) {
			for (int j = 0; j < arrColumns; j++) {
				if (twoArray[i][j] > max) {
					max = twoArray[i][j];
					maxI = i;
					maxJ = j;
				}
			}
		}
		System.out.println("The first instance of the" + " max value " + max + " is found at indices [" + maxI + "] ["
				+ maxJ + "]");
	}

	/**
	 * This method creates and prints a randomly generated 5x5 2D array. The range
	 * of random values is from 1 to 500 inclusive.
	 * 
	 * @return - A randomly generated 2D array
	 */
	public static int[][] createArray() {
		int[][] twoArray = new int[arrRows][arrColumns]; // Creates a 5 by 5 2d Array
		for (int i = 0; i < arrRows; i++) {
			for (int j = 0; j < arrColumns; j++) {
				twoArray[i][j] = rng.nextInt(maxValue - minValue - 1) + minValue;
				System.out.printf("%-7s", twoArray[i][j]); // Print 2D array
			}
			System.out.println(""); // next row
		}
		return twoArray;

	}
}
