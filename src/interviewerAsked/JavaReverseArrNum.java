package interviewerAsked;

public class JavaReverseArrNum {
	public static void main(String[] args) {
		int[] num = {2, 3, 5, 6, 8, 9};
		for(int i=2;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		for(int i=0;i<2;i++) {
			System.out.print(num[i]+" ");
		}
		
	}
	/*
	 * int[] num = {2, 3, 5, 6, 8, 9}; output - [5, 6, 8, 9, 2, 3]
	 */
}
