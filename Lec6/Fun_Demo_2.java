package Lec6;

public class Fun_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int a = 9;
		int b = 7;
//		int ans=Addition(a, b);
//		System.out.println(ans);
		System.out.println(Addition(a, b));
		System.out.println("Bye");
	}

	public static int Addition(int a, int b) {

		int c = a + b;

		return c - sub(c, a);

	}

	public static int sub(int a, int b) {

		int c = a - b;

		return c;

	}

}
