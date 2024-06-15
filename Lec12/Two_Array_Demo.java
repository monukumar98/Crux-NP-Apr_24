package Lec12;

public class Two_Array_Demo {
	public static void main(String[] args) {

		int[][] arr = new int[4][3];
		System.out.println(arr);
		System.out.println(arr[2]);
		System.out.println(arr[2][1]);
		int[][] other = arr;
		System.out.println(other.length);// row
		System.out.println(other[0].length);// col

	}

}
