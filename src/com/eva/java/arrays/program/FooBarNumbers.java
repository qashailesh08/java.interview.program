package com.eva.java.arrays.program;

public class FooBarNumbers {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println("FooBar");
			} else if (i % 5 == 0) {
				System.out.println("Foo");
			} else if (i % 7 == 0) {
				System.out.println("Baar");
			} else {
				System.out.println(i);
			}
		}
	}

}
