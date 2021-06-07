package com.ss.jb.five;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * 
 * @author Wyatt Meehan
 */
public class Day5Assignment2 {
	static Random rng = new Random();

	public static void main(String[] args) {
		List<Integer> list = createList();
		System.out.println(evenOrOdd(list));
	}

	public static String evenOrOdd(List<Integer> list) {
		return list.stream().map(num -> num % 2 == 0 ? "e" + num : "o" + num).collect(Collectors.joining(","));
	}

	public static List<Integer> createList() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(rng.nextInt(50) + 1);
		}
		return list;

	}

}
