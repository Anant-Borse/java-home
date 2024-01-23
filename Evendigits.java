package linearsearch;
public class Evendigits {
	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896};
		System.out.println(findNumbers(nums));
		System.out.println(digits(90000));
	}
	static int findNumbers(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (even(num)) {
				count++;
			}
		}
		return count;
	}
	//function to check whether  number contains even digits or not
	static boolean even(int num) {
		int numberOfDigits = digits(num);
		int count = 0;
		if (numberOfDigits%2==0) {
			return true;
		}
		return false;
		
		
	}
	//count the digits
	static int digits(int num) {
		int count =0;
		while (num>0) {
			count++;
			num /=10;
		}
		return count;

	}
}
