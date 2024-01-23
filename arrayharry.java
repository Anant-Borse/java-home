package demoArray;

import java.util.Scanner;

public class arrayharry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int size = sc.nextInt();
//		int marks[]= new int [size];
		
		int marks[]= {99,98,97,33};
		
		for (int i = marks.length-1 ; i <=0; i--) {
			System.out.println(marks[i]);
		}
	}
}
