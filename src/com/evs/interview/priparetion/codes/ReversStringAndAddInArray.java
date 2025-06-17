package com.evs.interview.priparetion.codes;

public class ReversStringAndAddInArray {

	public static void main(String[] args) {
		ReversStringAndAddInArray revObj = new ReversStringAndAddInArray();
		revObj.reverStrArr();
	}

	public void reverStrArr() {
		String original = "Hello Words";
		String reversed = new StringBuilder(original).reverse().toString();
		char[] charRev = reversed.toCharArray();
		System.out.print("Reversed :-\n" + reversed);
		System.out.print("\nCharacter revesed\n");
		for (char ch : charRev) {
			System.out.print(ch);
		}

	}
}
