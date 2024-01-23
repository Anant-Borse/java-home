package demoifelse;

import java.util.Scanner;

public class kunalconditionalloops {

	public static void main(String[] args) {
//		int salary = 25000;
//		if (salary > 10000) {
//			salary = salary+2000;
//			
//		}else {
//			salary = salary+1000;
//			
//		}
//		System.out.println(salary);
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		//find thee larget of numbers
		
		int max = a;
		if (b>a) {
			max = b;
			
		}
		if (c>b) {
			max = c;
		}
		System.out.println(max);
		}
}
