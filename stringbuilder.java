package strings;

public class stringbuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Tony");
		System.out.println(sb);
		
		//how to see which char is at index
		//System.out.println(sb.charAt(0));
		
		//change the value at index
//		sb.setCharAt(0, 'S');
//		sb.setCharAt(3, 'i');
//		
//		System.out.println(sb);
		
		//insert a new value without making changes to string
		sb.insert(0, 's');
		System.out.println(sb);
		
		sb.delete(0, 1);
		System.out.println(sb);
	}

}
