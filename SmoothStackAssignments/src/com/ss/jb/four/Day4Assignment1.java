/**
 * 
 */
package com.ss.jb.four;

/**
 * This class is for solving Assignment 1 in Java Basics 4. It implements a
 * singleton class using double checked locking.
 * 
 * @author Wyatt Meehan
 */
public class Day4Assignment1 {

	volatile public static Day4Assignment1 instance = null;

	/**
	 * Private constructor blocks attempts to create instances using a constructor
	 */
	private Day4Assignment1() {

	}

	/**
	 * This method uses double check locking to create an instance of this singleton
	 * class.
	 * 
	 * @return - Instance of singleton class
	 */
	synchronized public static Day4Assignment1 getInstance() {
		if (instance == null) { // 1st Check
			synchronized (Day4Assignment1.class) { // Acquire Lock
				if (instance == null) { // 2nd Check
					instance = new Day4Assignment1();
				}
			}
		}
		return instance;
	}

	/**
	 * This main method is a simple test to create a singleton object.
	 * 
	 * @param args - command line arguments
	 */
	public static void main(String[] args) {
		Day4Assignment1 test = getInstance();
		Day4Assignment1 test2 = getInstance();
		System.out.println(test);
		System.out.println(test2);
	}

}
