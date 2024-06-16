package Lec13;

public class String_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		String s = s1 + s2;
		s1 = s1 + s2;
		String str = s1 + s3;
		String strr = s1 + "Okay";
		String str1 = "Hello" + "Bye";
		s=s.concat(s2);
	}

}
