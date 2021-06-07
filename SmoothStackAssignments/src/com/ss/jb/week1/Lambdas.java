/**
 * 
 */
package com.ss.jb.week1;

/**
 * @author meeha
 *
 */
public class Lambdas{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lambdas lamClass = new Lambdas();
		LambdaInterface lamInter;
		boolean result;
		int odd = 5;
		int even = 24;
		int prime = 7;
		int notPrime = 50;
		int pal = 123321;
		int notPal = 12345;
		
		lamInter = lamClass.isOdd();
		lamInter.is(even);
		
		System.out.println();
		

	}
	
	public static LambdaInterface isOdd() {
		return (i)  -> i % 2 == 0 ? false:true;
	}
	
	public static LambdaInterface isPrime() {
		return (i) -> {
			for(int x = 2; i <= i/2; ++i ) {
				if (i % x == 0) {
					return false;
				} 
			} 
			return true;
		};
	}
	
	public static LambdaInterface isPalindrome() {
        return i -> i != Integer.parseInt(new StringBuilder(String.valueOf(i)).reverse().toString()) ? false : true;
    }
		
	}


