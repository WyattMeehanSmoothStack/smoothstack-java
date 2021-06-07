package com.ss.jb.tests.day5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import com.ss.jb.five.Day5Assignment1;



public class Day5Assignment1Tests {
	
	String[] testArray = new String[]{"apple", "ban", "esports", "so", "sort"};
	
	@Test
	public void testCreateArray() {
		String[] comp = Day5Assignment1.createArray();
		assertEquals(comp.length, 8);
	}
	
	@Test
	public void testShortToLong() {
		String result = Day5Assignment1.shortToLong(testArray);
		assertEquals(result, "[so, ban, sort, apple, esports]");
	}
	
	@Test
	public void testLongToShort() {
		String result = Day5Assignment1.longToShort(testArray);
		assertEquals(result, "[esports, apple, sort, ban, so]");
	}
	
	@Test
	public void alphabetical() {
		String result = Day5Assignment1.alphabetical(testArray);
		assertEquals(result, "[apple, ban, esports, so, sort]");
	}
	
	@Test
	public void eFirst() {
		String result = Day5Assignment1.eFirst(testArray);
		assertEquals(result, "[apple, esports, ban, so, sort]");
	}
	
	
	@Test
	public void eFirstAlt() {
		String result = Day5Assignment1.eFirstAlt(testArray);
		assertEquals(result, "[apple, esports, ban, so, sort]");
	}
	
}
