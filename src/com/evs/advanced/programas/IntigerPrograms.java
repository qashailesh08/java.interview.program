package com.evs.advanced.programas;

public class IntigerPrograms {

	public static void main(String[] args) {
		digites();
//		reversInt();
	}

	public static void digites() {
		int num = 846323545;
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println(count);
	}

	public static void reversInt() {
		int num = 1231;
		int rem1 = num;
		int rem = 0;
		while (num != 0) {
			rem = rem * 10 + num % 10;
			num /= 10;
		}
		System.out.println(rem);

		// check this given number is palindrom
		if (rem1 == rem) {
			System.out.println(rem1 + " is a palindrom number");
		} else {
			System.out.println(rem1 + " is not a palindrom number");
		}
	}

}
