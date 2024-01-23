package kunal_assignments;

import java.util.Scanner;

public class Ass_2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;

		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println(c);
	}

}
