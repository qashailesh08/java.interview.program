package com.evs.advanced.programas;

public class FindFibonacci {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 4;
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum = num1 + num2;
			System.out.print(sum+" ");
			num1 = num2;
			num2 = sum;
		}

	}

}
