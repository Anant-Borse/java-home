package kunal_assignments;

public class numberguess {
	public static int findFirstOccurence(int[]Arr,int K) {
		int n = Arr.length;
		for (int i = 0; i < n; i++) {
			if (Arr[i]==K) {
				return i;
			} 
			
		}
		return-1; 
	}
	public static void main(String[] args) {
		int[] Arr = {12,34,56,78,90,11,33};
		int K = 78;
		int result = findFirstOccurence(Arr, K);
		if (result != -1) {
			System.out.println("First occurence of"+K+"is at index "+result);
		}else {
			System.out.println("not found in array");
		}

}
}
