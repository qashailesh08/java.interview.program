package com.eva.java.arrays.program;

public class BiggestAndSmallestNumArray {

	public static void main(String[] args) {
		int[] numbers = { 34, 12, 9, 1,67, 3, 89, 45, 23 };

		int min = numbers[0];
		int max = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}

			if (numbers[i] > max) {
				max = numbers[i];
			}
		}

		System.out.println("Smallest Number: " + min);
		System.out.println("Biggest Number: " + max);

	}

}
