package kunal_assignments;

import java.util.Scanner;

public class Ass_3_discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter orginal price:");
		double mrp = in.nextInt();
		System.out.println("Enter discount");
		int sp = in.nextInt();
		
		//calculate discount
		double discount = mrp*(sp/100.0);
		
		double finalp = mrp - discount;
		
		System.out.println(finalp);
	}

}
