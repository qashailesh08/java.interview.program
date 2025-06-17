
package com.evs.interview.priparetion.codes;

public class RevQuestionMarkStr {

	public static void main(String[] args) {
		String name="Shailesh Kumar ?";
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
	}
}
