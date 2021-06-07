package com.ss.jb.test.week1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


import com.ss.jb.week1.Lambdas;
import com.ss.jb.week1.LambdaInterface;

public class LambdasTest {

	@Test
	public void testIsOdd() {
		LambdaInterface action;
		
		action = Lambdas.isOdd();
		boolean result1 = Lambdas.checker(action, 7);
		boolean result2 = Lambdas.checker(action, 10);
		boolean result3 = Lambdas.checker(action, -7);
		
		assertEquals(true, result1);
		assertEquals(false, result2);
		assertEquals(true, result3);
	}
	
	@Test
	public void testIsPrime() {
		LambdaInterface action;
		
		action = Lambdas.isPrime();
		boolean result1 = Lambdas.checker(action, 7);
		boolean result2 = Lambdas.checker(action, 29);
		boolean result3 = Lambdas.checker(action, 8);
		
		assertEquals(true, result1);
		assertEquals(true, result2);
		assertEquals(false, result3);
	}
	
	@Test
	public void testIsPalindrome() {
		LambdaInterface action;
		
		action = Lambdas.isPalindrome();
		boolean result1 = Lambdas.checker(action, 7117);
		boolean result2 = Lambdas.checker(action, 10);
		boolean result3 = Lambdas.checker(action, 1234554321);
		
		assertEquals(true, result1);
		assertEquals(false, result2);
		assertEquals(true, result3);
	}
}
