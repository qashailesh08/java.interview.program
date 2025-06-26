package com.eva.java.arrays.program;

import java.util.HashMap;
import java.util.Map;

public class FrequencyChecker {
	/*
	 * getOrDefault()= Retrieve a value for a given key, or return a default value
	 * if the key is not present in the map.
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 1, 2, 1, 1, 4, 5, 2 };
		Map<Integer, Integer> freMap = new HashMap<Integer, Integer>();
		for (int num : arr) {
			freMap.put(num, freMap.getOrDefault(num, 0) + 1);
		}
		// now pring the element which appears more than 3 time
		System.out.println("Element appears more than 3 time");
		for (Map.Entry<Integer, Integer> entry : freMap.entrySet()) {
			if (entry.getValue() > 3) {
				System.out.println(entry.getKey());
			}
		}
	}

}
