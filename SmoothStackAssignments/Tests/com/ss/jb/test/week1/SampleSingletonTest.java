package com.ss.jb.test.week1;

import org.junit.Test;

import com.ss.jb.five.Singleton;

import static org.junit.Assert.assertEquals;


public class SampleSingletonTest {
	
	@Test
	public void testGetInstance() {
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		assertEquals(sing1, sing2);
	}

}
