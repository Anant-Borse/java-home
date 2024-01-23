package demoifelse;

import java.util.*;




public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(),sum,div,rem;
		int b = sc.nextInt(),sub,mul;
		int button = sc.nextInt();
		
		sum = a+b;
		sub = a-b;
		mul = a*b;
		div = a/b;
		rem = a%b;
		switch (button) {
		case 1: System.out.println("Addition Is " +sum);
		break;
		case 2: System.out.println("Subtraction is " +sub);
		break;
		case 3: System.out.println("Multiplication is "+mul);
		break;
		case 4: System.out.println("Division is "+div);
		break;
		case 5: System.out.println("Remainder is "+rem);
		break;
		default:System.out.println("invalid");
			
		}
		sc.close();
	}

}
