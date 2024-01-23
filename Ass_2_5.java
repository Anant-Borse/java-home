package kunal_assignments;

import java.util.Scanner;

public class Ass_2_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		if (num1>num2) {
			System.out.println("Number 1 is Greater");
		}
		else if (num2>num1) {
			System.out.println("Number 2 is Greater");
		}else {
			System.out.println("Number 1 is Equal to Number 2");
		}
	}

}
