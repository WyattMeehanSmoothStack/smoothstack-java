/**
 * 
 */
package com.ss.jb.tests.day4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import com.ss.jb.four.Day4Assignment1;

/**
 * @author meeha
 *
 */
public class Day4Assignment1Tests {
	
	@Test
	public void testGetInstance() {
		Day4Assignment1 test = Day4Assignment1.getInstance();
		Day4Assignment1 test2 = Day4Assignment1.getInstance();
		assertEquals(test, test2);
	}
	
}
