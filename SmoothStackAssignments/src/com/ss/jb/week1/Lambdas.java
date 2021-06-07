/**
 * 
 */
package com.ss.jb.week1;

/**
 * @author Wyatt Meehan
 *
 */
public class Lambdas {
	public static boolean checker(LambdaInterface lI, int num) {
		return lI.check(num);
	}

	/**
	 * @param args - Command Line Arguments
	 */
	public static void main(String[] args) {
		LambdaInterface lamInter;
		boolean result = false;
		String answer;
		int odd = 5;
		
		lamInter = Lambdas.isOdd();
		result = Lambdas.checker(lamInter, odd);
		answer = (result) ? "Numer is odd" : "Number is even";
		
		System.out.println(answer);

	}

	/**
	 * This method returns whether a number is odd
	 * 
	 * @return boolean - true or false 
	 */
	public static LambdaInterface isOdd() {
		return (i) -> i % 2 == 0 ? false : true;
	}

	/**
	 * This method returns whether a number is prime
	 * 
	 * @return boolean - true or false
	 */
	public static LambdaInterface isPrime() {
		return (i) -> {
			for (int x = 2; i <= i / 2; ++i) {
				if (i % x == 0) {
					return false;
				}
			}
			return true;
		};
	}

	/**
	 * This method returns whether a number is prime
	 * 
	 * @return boolean - true or false
	 */
	public static LambdaInterface isPalindrome() {
		return i -> i != Integer.parseInt(new StringBuilder(String.valueOf(i)).reverse().toString()) ? false : true;
	}

}
