package com.eva.java.arrays.program;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		// created a string aar
		List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
		// adding d after b in array
		list.add(1, "d");

		System.out.println(list.toString());

	}

	/*
	 * List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
	 * 
	 * // Insert "d" at index 1 (between "a" and "b") list.add(1, "d");
	 * 
	 * System.out.println(list); // Output: [a, d, b, c]
	 */}
