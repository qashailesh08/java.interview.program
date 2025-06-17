package com.evs.interview.priparetion.codes;

public class AddStringNumber {

	public static void main(String[] args) {
		String num = "242";
		int rem = 0;
		for (int i = 0; i < num.length(); i++) {
			rem += Character.getNumericValue(num.charAt(i));
		}
		System.out.println("Sum: " + rem);
	}
}
