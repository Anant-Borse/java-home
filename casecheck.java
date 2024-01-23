package demoifelse;

import java.util.Scanner;

public class casecheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().trim().charAt(0);
		
		if (ch >= 'a' && ch<='z') {
			System.out.println("Lowercase");
		}else {
			System.out.println("Uppercase");
		}
//		String word = "hello";
//		System.out.println(word.charAt(1));
	}

}
