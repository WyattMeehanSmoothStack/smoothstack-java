package com.ss.jb.tests.day5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.ss.jb.five.Day5Assignment2;

public class Day5Assignment2Tests {
	
	@Test
	public void testCreateList() {
		List<Integer> test = Day5Assignment2.createList();
		assertEquals(10, test.size());
	}
	
	@Test
	public void evenOrOdd() {
		List<Integer> test = new ArrayList<Integer>();
		test.add(5);
		test.add(3);
		test.add(10);
		test.add(25);
		String correct = "o5,o3,e10,o25";
		assertEquals(correct, Day5Assignment2.evenOrOdd(test));
	}
}
