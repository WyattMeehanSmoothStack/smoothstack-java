package com.ss.jb.tests;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ss.jb.four.Line;

public class LineTest {

	
	@Test
	public void testPosSlope() {
		Line posLine = new Line(0, 0, 1, 1);
		assertEquals(1.0 , posLine.getSlope(), 0);
	}
	
	@Test
	public void testNegSlope() {
		Line negLine = new Line(0, 0, 1, 1);
		assertEquals(1.0 , negLine.getSlope(), 0);
	}
	
	@Test
	public void testZeroSlope() {
		Line zeroLine = new Line(1, 1, 10, 1);
		assertEquals(0, zeroLine.getSlope(), 0);
	}
	
	@Test
	public void testRealSlope() {
		Line realLine = new Line(-21, 24, 10, -10);
		assertEquals(-1.0967, realLine.getSlope(), 0.0001);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testInfinitySlope() {
		Line realLine = new Line(0, 0, 0, 10);
		assertEquals(-1.0967, realLine.getSlope(), 0.0001);
	}
	
	@Test
	public void testNoYChangeDistance() {
		Line noYLine = new Line(1, 1, 10, 1);
		assertEquals(9, noYLine.getDistance(), 0);
	}
	
	@Test
	public void testNoXChangeDistance() {
		Line noXLine = new Line(1, 1, 1, 10);
		assertEquals(9, noXLine.getDistance(), 0);
	}
	
	@Test
	public void testNoChangeDistance() {
		Line noChangeLine = new Line(0, 0, 0, 0);
		assertEquals(0, noChangeLine.getDistance(), 0);
	}
	
	@Test
	public void testNegChangeDistance() {
		Line negLine = new Line(1, 1, -10, 1);
		assertEquals(11, negLine.getDistance(), 0);
	}
	
	@Test
	public void testReasDistance() {
		Line realLine = new Line(-21, 24, 10, 1);
		assertEquals(38.6005, realLine.getDistance(), 0.0001);
	}
	
	@Test
	public void testParallelTo() {
		Line lineOne = new Line(0, 0, 10, 20);
		Line lineTwo = new Line(0, 0, 20, 40);
		assertEquals(true, lineOne.parallelTo(lineTwo));
	}
	
	@Test
	public void nottestParallelTo() {
		Line lineOne = new Line(0, 0, 10, 20);
		Line lineTwo = new Line(0, 0, -20, 40);
		assertEquals(false, lineOne.parallelTo(lineTwo));
	}
}
