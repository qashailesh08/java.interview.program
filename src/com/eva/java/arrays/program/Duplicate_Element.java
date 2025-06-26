package com.eva.java.arrays.program;


public class Duplicate_Element {
	public static void main(String[] args) {
		int[] num = { 2, 4, 2, 5, 3, 2, 6, 4 };
//		remove(num);
		fetch(num);
	}

	public static int[] remove(int num[]) {
		for (int i = 0; i < num.length; i++) {
			boolean flag = false;
			for (int j = 0; j < i; j++) {
				if (num[j] == num[i]) {
					flag = true;
					break;
				}

			}
			if (!flag) {
				System.out.print(num[i] + " ");
			}
		}
		return num;
	}

	public static int[] fetch(int num[]) {
		for (int i = 0; i < num.length; i++) {
			boolean flage=false;
			for (int j = 1; j < i; j++) {
				if (num[j] == num[i]) {
					flage=true;
					break;
				}
			}
			if (flage) {
				System.out.println("Found Duplicate Element= "+num[i]);
			} else {
				System.out.println("Not Found Duplicate Element= "+num[i]);
			}
		}

		return num;

	}
}
