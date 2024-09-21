package Lec34;

public class Array_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 10, 2, 4, 5, 6 };
		Display(arr);
		String[] arr1 = { "Raj", "Rajesh", "Ankit", "Ankita" };
		Display(arr1);
	}

	public static <T> void Display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// return arr[0];
	}
}
