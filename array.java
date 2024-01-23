package demoArray;

public class array {
	public static void main(String[] args) {
		int[] marks = new int [3];
//		int marks[]= {97,55,88};
		
		marks[0]= 97;//phy
		marks[1]= 55;//chem
		marks[2]= 88;//maths
		
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
		
		for (int i = 0; i <=2; i++) {
			System.out.println(marks[i]);
		}
	}
	

}
