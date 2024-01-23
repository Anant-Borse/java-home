package kunal_assignments;

import java.util.Scanner;

public class Ass_3_24 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
		int sum = 0;
		while (true) {
			int n = in.nextInt();
			if (n==0) {
				break;
			}
			sum = sum +n;
		}
		System.out.println("sum:"+sum);
	}

}
//to run a infinite loop always use while loop and use true