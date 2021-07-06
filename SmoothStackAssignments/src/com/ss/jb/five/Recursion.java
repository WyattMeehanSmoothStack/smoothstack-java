/**
 * 
 */
package com.ss.jb.five;

/**
 * @author Wyatt Meehan
 *
 */
public class Recursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] testArray1 = new int[] { 2, 4, 8 };
		int[] testArray2 = new int[] { 1, 2, 4, 8, 1 };
		int[] testArray3 = new int[] { 2, 4, 4, 8 };

		System.out.println(groupSumClump(0, testArray1, 10));
		System.out.println(groupSumClump(0, testArray2, 14));
		System.out.println(groupSumClump(0, testArray3, 14));
	}

	/**
	 * This method recursively calculates if it is possible for the sum of any
	 * combination of integers in an array to equally a set target. Any consecutive
	 * duplicates must be included or not included to the sum.
	 * 
	 * @param start  - start iterator for recursion
	 * @param arr    - Array we are processing
	 * @param target - target we are attempting to add to
	 * @return - true or false if the problem is possible with provided params
	 */
	public static boolean groupSumClump(int start, int[] arr, int target) {
		// Base condition
		if (start >= arr.length) {
			return target == 0; // Always true if target is 0
		}
		int i = start;
		int sum = 0;

		// Iterate through array and sum up consecutive duplicates
		while (i < arr.length && arr[start] == arr[i]) {
			sum += arr[i];
			i++;
		}

		// Recursive call but exclude consecutive duplicates
		if (groupSumClump(i, arr, target - sum)) {
			return true;
		}

		// Recursive call
		if (groupSumClump(i, arr, target)) {
			return true;
		}
		return false;
	}

}
