package Lec27;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(7, 2));
		System.out.println(add(2, 8, 7));
		System.out.println(add(2, 8.6, 7));
		System.out.println(add(2, 3, 2, 2, 1, 1, 121, 9, 1, 4, 1, 1, 1, 1, 31, 1, 2, 2, 44, 2));

	}

	public static int add(int a, int b) {
		return (a + b);
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(int a, double b, int c) {
		return (int) (a + b + c);
	}

	public static int add(int y,int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

}
