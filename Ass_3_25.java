package kunal_assignments;

import java.util.Scanner;

public class Ass_3_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int largest = Integer.MIN_VALUE;
		
		while (true) {
			int n = in.nextInt();
			if (n==0) {
				break;
			}
			if (n>largest) {
				largest=n;
			}
			
		}
		System.out.println("largest of all:"+largest);
	}

}
