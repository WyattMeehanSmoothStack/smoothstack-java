/**
 * 
 */
package com.ss.jb.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		int[] testArray2 = new int[] { 1, 2, 2, 2, 4, 8, 1 };
		int[] testArray3 = new int[] { 2, 4, 8 };
		groupSumClump(testArray2, 10);
	}

	public static boolean groupSumClump(int[] arr, int target) {
			List<Integer> list = new ArrayList<Integer>();
			int prev = -1;
			int sum = 0;
			
			for(int i = 0; i < arr.length - 1; i++) {
				if(arr[i] == arr[i+1]) {
					sum += arr[i] + arr[i + 1];
				} else {
					
				}
				
				prev = arr[i];
			}
			
			

		return true;
	}

}
