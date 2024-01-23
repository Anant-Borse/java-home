package kunal_assignments;

import java.util.Scanner;

public class Ass_3_factorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
	
		long factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		System.out.println(factorial);
	}

}
