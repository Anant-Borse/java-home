package demoArray;

import java.util.Scanner;

public class userInputArray {
//	 public static void main(String[] args) {
//		 Scanner sc = new Scanner(System.in);
//		 int size = sc.nextInt();
//		
//		 int number[] = new int[size];
//		 //input
//		 for (int i = 0; i < size; i++) {
//			number[i]=sc.nextInt();
//		}
//		 //output
//		 for (int i = 0; i <size; i++) {
//			 System.out.println(number[i]);
//			
//		}
//	}
		//find the input x at the index
	  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int number[] = new int[size];
		
		//input
		for (int i = 0; i <size; i++) {
			number[i]=sc.nextInt();
			
		}
		int x = sc.nextInt();
		//output
		for (int i = 0; i <number.length; i++) {
			if (number[i]==x) {
				System.out.println("x is found at"+i);
				
			}
			
		}
	}	

}
