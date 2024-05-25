package Lec7;

public class Arrays_Sawap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 5, 6, 7, 8 };
		// int[] ar = new int []{ 10, 20, 5, 6, 7, 8 };
		System.out.println(arr[0] + " " + arr[1]);
		Swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);

	}

	public static void Swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}
