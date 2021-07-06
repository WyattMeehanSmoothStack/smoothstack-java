package com.ss.jb.test.week1;

import org.junit.Test;

import com.ss.jb.five.Recursion;

import static org.junit.Assert.assertEquals;



public class RecursionTest {
	
	@Test
	public void testIsOdd() {
		int[] testArray1 = new int[] { 2, 4, 8 };
		int[] testArray2 = new int[] { 1, 2, 4, 8, 1 };
		int[] testArray3 = new int[] { 2, 4, 4, 8 };
		int[] testArray4 = new int[] {2, 3, 5};
		assertEquals(true, Recursion.groupSumClump(0, testArray1, 10));
		assertEquals(true, Recursion.groupSumClump(0, testArray2, 14));
		assertEquals(false, Recursion.groupSumClump(0, testArray3, 14));
		assertEquals(true, Recursion.groupSumClump(0, testArray4, 0));
		assertEquals(false, Recursion.groupSumClump(0, testArray4, 6));
	}
	

}
