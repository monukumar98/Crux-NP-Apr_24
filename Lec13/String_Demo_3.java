package Lec13;

public class String_Demo_3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello" + 10 + 20 + "Bye");
		System.out.println("Hello" + (10 + 20) + "Bye");
		System.out.println(10 + 20 + "Hello" + "Bye");
		String s = "Codingblocks";
		System.out.println(s.length());
		int[] ar = new int[5];
		System.out.println(ar.length);
		System.out.println(s.charAt(4));
		System.out.println(s.substring(3));
		System.out.println(s.substring(2,9));

	}

}
