package Lec7;

public class Arrays_Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
//		int arr [] = new int[5]; // C type
		System.out.println(arr);
//		System.out.println(arr[0]);
//		arr[0]=-9;
//		System.out.println(arr[0]);
		// set
		arr[0] = -9;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 5;
		arr[4] = 7;
		// print
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		// lenght
		System.out.println(arr.length);
		int [] other =arr;

	}

}






