package demoArray;

public class multidimensionalarray {
	public static void main(String[] args) {
		
//		int[][]flats = new int[2][3];//2d array
//		flats[0][0]=101; 
//		flats[0][1]=102;
//		flats[0][2]=103;
//		flats[1][0]=201;
//		flats[1][1]=202;
//		flats[1][2]=203;
//		
//		for (int i = 0; i < flats.length; i++) {
//			for (int j = 0; j < flats[i].length; j++) {
//				System.out.print(flats[i][j]);
//				System.out.print(" ");	
//			}
//			System.out.println();
//		}
		
		//kunal kushava
		//2d array with variable no of rows 
		int[][] arr = {
				{1,2,3,4},
				{5,6,7},
				{8,9}
		};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
