/**
 * 
 */
package com.ss.jb.week1;


import java.sql.Connection;


import com.ss.jb.four.Day4Assignment1;


/**
 * This class correctly implements a singleton class.
 * 
 * @author Wyatt Meehan
 *
 */
public class SampleSingleton {
	
	volatile private static Connection conn = null;
	
	volatile private static SampleSingleton instance = null;
	
	/**
	 * This method uses double check locking to create an instance of this singleton
	 * class.
	 * 
	 * @return - Instance of singleton class
	 */
	synchronized public static SampleSingleton getInstance() {
		if (instance == null) { // 1st Check
			synchronized (Day4Assignment1.class) { // Acquire Lock
				if (instance == null) { // 2nd Check
					instance = new SampleSingleton();
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
		SampleSingleton test = getInstance();
		SampleSingleton test2 = getInstance();
		System.out.println(test);
		System.out.println(test2);
	}


	public static Connection getConn() {
		return conn;
	}


	public static void setConn(Connection conn) {
		SampleSingleton.conn = conn;
	}

}
