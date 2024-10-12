package Lec40;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("hello");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.append(10);
		sb.append(true);
		sb.append(2.3);
		sb.append("ee");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append('i');
		System.out.println(sb.capacity());
		String s = sb.toString();// builder to string
		StringBuilder sb1 = new StringBuilder(s);// string to builder
		System.out.println(sb.charAt(3));
		System.out.println(sb.substring(1, 4));
		String_demo();
	//	StringBuilder_demo();
	}

	public static void String_demo() {
		String s = "";
		for (int i = 0; i < 1000000; i++) {

			s += i;
		}
		System.out.println("String_demo");
	}

	public static void StringBuilder_demo() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1000000; i++) {

			sb.append(i);
		}
		System.out.println("StringBuilder_demo");
	}

}
