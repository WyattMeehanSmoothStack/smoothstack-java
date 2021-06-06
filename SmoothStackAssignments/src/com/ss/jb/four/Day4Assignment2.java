/**
 * 
 */
package com.ss.jb.four;

/**
 * This class is for solving Assignment 2 in Java Basics 4. It creates a
 * deadlock between two threads.
 * 
 * @author Wyatt Meehan
 */
public class Day4Assignment2 {
	public Day4Assignment2() {

	}

	public static Day4Assignment2 object1 = new Day4Assignment2();
	public static Day4Assignment2 object2 = new Day4Assignment2();

	/**
	 * This short program creates two threads and creates a deadlock between them.
	 * 
	 * @param args - command line arguments
	 */
	public static void main(String[] args) {
		ThreadClass1 thread1 = new ThreadClass1();
		ThreadClass2 thread2 = new ThreadClass2();

		thread1.start();
		thread2.start();
	}

	/**
	 * This nested class is for creating thread 1.
	 * 
	 * @author Wyatt Meehan
	 */
	public static class ThreadClass1 extends Thread {
		public void run() {
			try {
				synchronized (object1) {
					System.out.println("thread1 acquired lock for object 1");
					Thread.sleep(200);
					System.out.println("thread1 locked here waiting on object 2");
					synchronized (object2) {
						System.out.println("This should not print");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * This nested class is for creating thread 2
	 * 
	 * @author Wyatt Meehan
	 */
	public static class ThreadClass2 extends Thread {
		public void run() {
			try {
				synchronized (object2) {
					System.out.println("thread2 acquired lock for object 2");
					Thread.sleep(200);
					System.out.println("thread2 locked here waiting on object 1");
					synchronized (object1) {
						System.out.println("This should not print");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
