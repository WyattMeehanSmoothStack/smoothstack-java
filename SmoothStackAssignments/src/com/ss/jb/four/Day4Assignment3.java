/**
 * 
 */
package com.ss.jb.four;

import java.util.LinkedList;
import java.util.Random;

/**
 * This class is for solving Assignment 3 in Java basics 4. 
 * It solves the Producer/Consumer problem. 
 * 
 * @author Wyatt Meehan
 */
public class Day4Assignment3 {
	static LinkedList<Integer> data = new LinkedList<>();
	static int capacity = 10;
	static Random rng = new Random();
	static int max = 10;
	static int min = 1;

	/**
	 * This main method creates one thread to run the producer on and one thread to
	 * run the consumer on.
	 * 
	 * @param args - command line arguments
	 * @throws InterruptedException - possible exception caused by interrupted
	 *                              thread
	 */
	public static void main(String[] args) throws InterruptedException {
		ProdCons prodCon = new ProdCons();

		//Producer thread
		Thread prod = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					prodCon.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		//Consumer Thread
		Thread cons = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					prodCon.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		prod.start();
		cons.start();
	}

	/**
	 * This class contains the produce and consumer methods. Both infinitely looping
	 * methods are synchronized using this class in order to avoid IllegalMonitorStateException.
	 */
	public static class ProdCons {

		/**
		 * This method produces random data and adds it to the list. It also waits if the list
		 * is at capacity and notifys the consumer when data is added. 
		 * 
		 * @throws InterruptedException - 
		 */
		public void produce() throws InterruptedException {
			while (true) {
				int datum = rng.nextInt(max - min + 1) + min; // Create random data point to add
				synchronized (this) {
					while (data.size() == capacity) {
						wait();
					}

					data.add(datum); // Add the data to the list
					System.out.println("Producer added " + datum + " to data.");
					System.out.println("Current data: " + data.toString());
					notify(); // Notify the Consumer that data was added
					Thread.sleep(1200); // Delay
				}
			}
		}

		/**
		 * This method consumes data from the list. It will wait if the list is empty.
		 * It notifies the producer when data is consumed. 
		 * 
		 * @throws InterruptedException
		 */
		public void consume() throws InterruptedException {
			while (true) {
				synchronized (this) {
					while (data.size() == 0) {
						wait();
					}

					int target = data.removeFirst();
					System.out.println("Consumer removed " + target + " from data.");
					System.out.println("Current data: " + data.toString());
					notify();
					Thread.sleep(1200);

				}
			}
		}
	}

}
