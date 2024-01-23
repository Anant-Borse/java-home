package kunal_assignments;

import java.util.Scanner;

public class mySqrt {
	public static int sqrt(int x) {
	if(x==0 || x==1) {
		return x;
	}
	int result =1;
	while (result <=x/result) {
		result++;
	}
	return result -1;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int result = sqrt(x);
		System.out.println(result);
	}
}
