package demoArray;

import java.util.Scanner;

public class twodarrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int rows =sc.nextInt();
//		int col = sc.nextInt();
//		int [][] matrix = new int [rows][col];
//		
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
////				System.out.print(matrix[i][j]);
//				matrix [i][j]= sc.nextInt();
//			}
//			
//		}
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				System.out.print(matrix[i][j]+" ");
//			}
//		System.out.println();
//	}
		//search for given number and print indices 
		int rows =sc.nextInt();
		int col = sc.nextInt();
		int [][] matrix = new int [rows][col];
		//input
		//rows
		for (int i = 0; i < matrix.length; i++) {
			//col
			for (int j = 0; j < matrix[i].length; j++) {

				matrix [i][j]= sc.nextInt();
			}

			
			}
		int x= sc.nextInt();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				//for x
				if (matrix[i][j]==x) {
					System.out.println("x is found at:("+ i + ","+ j + ")");
				}
			}
			
		}
		//output
	}
}
