package Patterns;
import java.util.*;


public class advance_patterns {
	public static void main(String[] args) {
		
		//butterfly pattern
//		int n = 5;
//		//upper half
//		for (int i = 1; i <=n; i++) {
//			//1st part
//			for (int j = 1; j <=i; j++) {
//				System.out.print("*");
//				
//			}
//			//spaces
//			int spaces = 2 * (n-i);
//			for (int j = 1; j <=spaces; j++) {
//				System.out.print(" ");
//			}
//			//2nd half
//			for (int j = 1; j <= i; j++) {
//				System.out.println("*");
//				
//			}
//			System.out.println();
//		}
//		
//		//lower half
//		for (int i = n; i <=1; i--) {
//			//1st part
//			for (int j = 1; j <=i; j++) {
//				System.out.print("*");
//				
//			}
//			//spaces
//			int spaces = 2 * (n-i);
//			for (int j = 1; j <=spaces; j++) {
//				System.out.print(" ");
//			}
//			//2nd half
//			for (int j = 1; j <= i; j++) {
//				System.out.println("*");
//				
//			}
//			System.out.println();
//		}
//		
		//solid rhombus
//		int n = 5;
//		for (int i = 1; i <=n; i++) {
//			for (int j = 1; j <=n-i; j++) {
//				System.out.print(" ");
//				
//			}
//			for (int j = 1; j <=n; j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
		
		//number pyramid
//		int n = 5;
//		for (int i = 1; i <=n; i++) {
//			for (int j = 1; j <=n-i; j++) {
//				System.out.print(" ");
//				
//			}
//			for (int j = 1; j <=i; j++) {
//				System.out.print(i+" ");
//				
//			}
//			System.out.println();
//		}
		
		//palidromic pyramid
//		int n = 5;
//		//1st half
//		for (int i = 1; i<=n; i++) {
//			//spaces
//			for (int j = 1; j <=n-i; j++) {
//				System.out.print(" ");
//				
//			}
//			for (int j = i; j >=1; j--) {
//				System.out.print(j);
//				
//			}
//			//2nd half
//			for (int j = 2; j <=i; j++) {
//				System.out.print(j);
//				
//				
//			}
//			System.out.println();
//			
//		}
		
		//diamond pattern
		int n = 4;
		//upper half
		for (int i = 1; i<=n; i++) {
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}
			int stars = 2*i-1;
			for (int j = 1; j <=stars; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
			
		//lower half
		for (int i = n; i>=1; i--) {
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}
			int stars = 2*i-1;
			for (int j = 1; j <=stars; j++) {
				System.out.print("*");
					
			}
			System.out.println();
			
			
		} 
		
			
		}
		
	}

