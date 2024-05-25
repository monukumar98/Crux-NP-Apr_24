package Lec7;

public class Arrays_Sawap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 5, 6, 7, 8 };
		System.out.println(arr[0] + " " + arr[1]);
		Swap(arr, 0, 1);
		System.out.println(arr[0] + " " + arr[1]);

	}

	public static void Swap(int[] arr, int i, int j) {
		int temp = arr[i];// 10
		arr[i] = arr[j];// arr[0]=arr[1];
		arr[j] = temp;// arr[1]=10;
	}
}
