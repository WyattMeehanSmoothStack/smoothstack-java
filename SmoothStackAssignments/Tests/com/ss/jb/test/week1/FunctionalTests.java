package com.ss.jb.test.week1;

import org.junit.Test;

import com.ss.jb.five.Functional;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class FunctionalTests {
	@Test
	public void testRightDigit() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(109);
		list.add(190342);
		list.add(3);
		List<Integer> correct = new ArrayList<Integer>();
		correct.add(9);
		correct.add(2);
		correct.add(3);
		List<Integer> test = Functional.rightDigit(list);
		assertEquals(test, correct);
	}
	
	@Test
	public void testDoubling() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(109);
		list.add(190);
		list.add(-33);
		List<Integer> correct = new ArrayList<Integer>();
		correct.add(218);
		correct.add(380);
		correct.add(-66);
		List<Integer> test = Functional.doubling(list);
		assertEquals(test, correct);
	}
	
	@Test
	public void testnoX() {
		List<String> list = new ArrayList<String>();
		list.add("109");
		list.add("x190x");
		list.add("xhxexlxlox");
		List<String> correct = new ArrayList<String>();
		correct.add("109");
		correct.add("190");
		correct.add("hello");
		List<String> test = Functional.noX(list);
		assertEquals(test, correct);
	}
	
	

}
