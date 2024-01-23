package linearsearch;

public class Maxwealth {
	public static void main(String[] args) {
		long N = 98;
		if (isPowerOfTwo(N)) {
			System.out.println("YES");
		}else {
			System.out.println("no");
		}
	
			
		}
	static boolean isPowerOfTwo(long N) {
		if (N<=0) {
			return false;
		}
		for (long i = N; i >1; i/=2) {
			if (i%2 !=0) {
				return false;
			}
			
		}
		return true;
	}
	}
	

