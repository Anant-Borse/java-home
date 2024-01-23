package demo.java;

public class Hello {
	
	public void name() {
		System.out.println("hello");
	}
	public static void name1() {
		System.out.println("tejas");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println(1);
		Hello hello=new Hello();
		System.out.println(2);
		name1();
		hello.name();
		System.out.println("type casting");
		
		float a=10.2f;
		int x=(int)a;
		System.out.println(x);
		
		
	}
}
