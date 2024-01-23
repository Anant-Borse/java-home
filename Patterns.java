package Patterns;
import java.util.*;

import loops.forloop;

public class Patterns {
	public static void main(String[] args) {

		//solid rectangle
//		int n = 4;
//		int m = 5;
//		//outer loop
//		for (int i = 1; i <=n; i++) {
//			//inner loop
//			for (int j = 1; j <=m; j++) {
//				System.out.print("*");
//				
//			}
//			System.out.println("*");
//			
//		}
		
		//Hollow rectangle
//		int n = 4;
//		int m = 5;
//		//outer loop
//		for (int i = 1; i <=n; i++) {
//			//inner loop
//			for (int j = 1; j <=m; j++) {
//				//cell -> (i,j) min or max only
//				if (i==1|| j==1|| i==n||j==m) {
//					System.out.print("*");	
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//			
//		}
//		
		//HAlf pyramid
//		int n = 4;
//		//outer loop
//		for (int i = 1; i <=n; i++) {
//			//inner loop
//			for (int j = 1; j <=i; j++) {
//				System.out.print("*");
//				
//			}
//			System.out.println();
//			
//		}
		//inverted half pyramid
//		int n = 4;
//		for (int i = n; i >=1; i--) {
//			for (int j = 1; j <=i; j++) {
//				System.out.print("*");
//				
//			}
//			System.out.println();
//		}
		//inverted half pyramid 180 deg rotated 
//		int n = 4;
//		for (int i = 1; i<=n; i++) {
//			for (int j = 1; j <=n-i; j++) {
//				System.out.print(" ");
//				
//			}
//			for (int j = 1; j <=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		//half pyramid with numbers
//		int n = 5;
//		for (int i = 1; i <=n; i++) {
//			for (int j = 1; j <=i; j++) {
//				System.out.print(j);
//				
//			}
//			System.out.println();
//			
//		} 
//		inverted half pyramid with numbers
		
//		int n = 5;
//		for (int i = n; i >=1; i--) {
//			for (int j = 1; j <=i; j++) {
//				System.out.print(j+" ");
//				
//				
//			}
//			System.out.println();
//		}
//		
		//floyds triangle
//		int n = 5;
//		int num = 1;
//		for (int i = 1; i <=n; i++) {
//			for (int j = 1; j <=i; j++) {
//				System.out.print(num+" ");
//				num++;
//				
//			}
//			System.out.println();
//			
//		}
		//0-1 triangle
//		int n = 5;
//		for (int i = 1; i <=n; i++) {
//			for (int j = 1; j <=i; j++) {
//				int sum = i+j;
//				if (sum%2==0) {
//					System.out.print("1");
//					
//				}
//				else {
//					System.out.print("0");
//				}
//			
//			}
//			System.out.println();
//			
//		}
		//homework
		//solid rhombus
//		int n = 5;
//		for (int i = 1; i <=n; i++) {
//			for (int j = 1; j <=n-i; j++) {
//				System.out.print(" ");
//				
//			}
//			for (int j = 1; j <=n; j++) {
//				System.out.print("*"+" ");
//				
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
