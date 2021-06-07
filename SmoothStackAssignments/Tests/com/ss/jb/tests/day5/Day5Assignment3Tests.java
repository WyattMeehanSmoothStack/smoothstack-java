package com.ss.jb.tests.day5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.ss.jb.five.Day5Assignment3;


public class Day5Assignment3Tests {
	
	@Test
	public void testCreateList() {
		List<String> comp = Day5Assignment3.createList();
		assertEquals(comp.size(), 9);
	}
	
	@Test
	public void filter() {
		List<String> test = new ArrayList<String>();
		test.add("abs");
		test.add("ant");
		test.add("bas");
		test.add("ball");
		test.add("clapp");
		test.add("zap");
		test = Day5Assignment3.filter(test);
		List<String> answer = new ArrayList<String>();
		answer.add("abs");
		answer.add("ant");
		assertEquals(test, answer);
	}
	
	

}
