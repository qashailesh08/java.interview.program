package interviewerAsked;

public class SecondLarge {

	public static void main(String[] args) {
		findUsingForEachLoop();
		usingloop();
	}

	public static void findUsingForEachLoop() {
		int[] num = { 1, 2, 20, 5, 4, 21, 9, 6, 10, 22 };
		int first = 0;
		int second = 0;
		for (int n : num) {
			if (n > first) {
				second = first;
				first = n;
			} else if (n > second && n != first) {
				second = n;
			}
		}
		System.out.println("Second Largest number in array is- " + second);
	}

	public static void usingloop() {
		int[] num =  { 1, 2, 20, 5, 4, 21, 9, 6, 10, 22 };

		int first = num[0];
		int second = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > first) {
				second=first;
				first=num[i];
			} else if (num[i] < second && num[i] != first) {
				second = num[i];
			}

		}
		System.out.print("Second Largest number in array is- "+second);
	}

}
