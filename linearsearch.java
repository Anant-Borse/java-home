package linearsearch;
import java.util.Arrays;

public class linearsearch {
	public static void main(String[] args) {
		int [][]arr= {
				{22,34,56,78},
				{12,90,88,67},
				{10,14,62}
		};
		int target =88;
		int[]ans= search(arr,target);
		System.out.println(Arrays.toString(ans));
		System.out.println(max(arr));
	}
	static int []search(int[][]arr,int target){
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col <arr[row].length; col++) {
				if (arr[row][col]==target) {
					return new int[] {row,col};
			}
		}
		
	}
	
		
	return new int[] {-1,-1};
}
	static int max (int[][]arr) {
		int max = Integer.MIN_VALUE;
		for (int[] is : arr) {
			for (int element : is) {
				if(element > max) {
					max = element;
				}
			}
		}
		return max;
	}
	
}

