package com.eva.java.arrays.program;

public class RotareArrayByLeftNTime {

	public static void main(String[] args) {
		int num[] = { 1, 2, 5, 3, 8 };
		int n = 3;
		for (int i = 0; i < n; i++) {
			int first = num[0], j;
			for (j = 0; j < num.length-1; j++) {
				num[j] = num[j + 1];
			}
			num[j] = first;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
