package com.evs.advanced.programas;

public class SwappNumber {

	public static void main(String[] args) {
//  Way =01 Using third variable 
		int a = 10;
		int b = 20;
		System.out.println("Before Swapping\n:a=" + a + " b=" + b);
//		int c = a;
//		a = b;
//		b = c;
//		System.out.println("After swapping\n:a=" + a + " b= " + b);

//		Way02 without third variable
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("After swapping\n:a=" + a + " b= " + b);
		
//		Way03 Using Bitwise XOR Operator
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("After swapping\n:a=" + a + " b= " + b);
	}

}
