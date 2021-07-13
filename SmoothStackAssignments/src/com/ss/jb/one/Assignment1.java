package com.ss.jb.one;

/**
 * This class is for Java Basics Assignment 1. It uses loops to print various
 * patterns.
 * 
 * @author Wyatt Meehan
 */

public class Assignment1 {

	public static void main(String[] args) {
		printPattern1();
		printPattern2();
		printPattern3();
		printPattern4();
	}

	private static void printPattern4() {
		String pat4 = "***********";
		System.out.println("\n4)");
		System.out.println(pat4);
		while (!pat4.equals("     *")) {
			int first = pat4.indexOf("*");
			System.out.println(pat4 = " " + pat4.substring(0, first) + pat4.substring(first + 1, pat4.length() - 1));
		}

	}

	private static void printPattern3() {
		String pat3 = "     *     ";
		System.out.println("\n3)");
		System.out.println(pat3);
		while (!pat3.equals("***********")) {
			int first = pat3.indexOf("*");
			System.out.println(pat3 = pat3.substring(0, first - 1) + "**" + pat3.substring(first, pat3.length() - 1));
		}
	}

	private static void printPattern2() {
		String pat2 = "***********";
		System.out.println("\n2)");
		while (!pat2.equals("*")) {
			System.out.println(pat2 = pat2.substring(0, pat2.length() - 1));
		}

	}

	public static void printPattern1() {
		String pat1 = "";
		System.out.println("1)");
		for (int i = 0; i < 10; i++) {
			System.out.println(pat1 += "*");
		}
	}

}
