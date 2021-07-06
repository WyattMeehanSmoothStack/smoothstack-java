/**
 * 
 */
package com.ss.jb.five;

import java.sql.Connection;

import com.ss.jb.four.Day4Assignment1;

/**
 * This class correctly implements a singleton class.
 * 
 * @author Wyatt Meehan
 *
 */
public class Singleton {

	volatile private static Connection conn = null;

	volatile private static Singleton instance = null;

	/**
	 * Private constructor assures instances cannot be created using constructors.
	 */
	private Singleton() {

	}

	/**
	 * This method uses double check locking to create an instance of this singleton
	 * class.
	 * 
	 * @return - Instance of singleton class
	 */
	synchronized public static Singleton getInstance() {

		if (instance == null) { // 1st Check
			synchronized (Day4Assignment1.class) { // Acquire Lock
				if (instance == null) { // 2nd Check
					instance = new Singleton();
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
		Singleton test = getInstance();
		Singleton test2 = getInstance();
		System.out.println(test);
		System.out.println(test2);
		System.out.println("Boolean test to see if created instances are the same: " + test.equals(test2));
	}

	public static Connection getConn() {
		return conn;
	}

	public static void setConn(Connection conn) {
		Singleton.conn = conn;
	}

}
