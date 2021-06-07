package com.ss.jb.test.week1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.ss.jb.week1.SampleSingleton;


public class SampleSingletonTest {
	
	@Test
	public void testGetInstance() {
		SampleSingleton sing1 = SampleSingleton.getInstance();
		SampleSingleton sing2 = SampleSingleton.getInstance();
		assertEquals(sing1, sing2);
	}

}
