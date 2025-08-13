package com.evs.interview.priparetion.codes;

public class ReverseInteger {
	public static void main(String[] args) {
		int num = 12321;
		int store = num;
		int rem = 0;
		while (num != 0) {
			rem = rem * 10 + num % 10;
			num /= 10;
		}
		System.out.println(rem);
		if (store == rem) {
			System.out.println(store + " is a palindron number");
		} else {
			System.out.println(store + " is not a palindrom number");
		}
	}
}
