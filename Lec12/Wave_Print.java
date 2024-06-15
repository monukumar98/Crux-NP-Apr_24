package Lec12;

public class Wave_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 2, 3, 4, 5, 6 }, { 1, 8, 7, 3, 9 }, { 10, 11, 13, 12, 14 }, { 18, 14, 19, 20, 21 } };
		Print(arr);

	}

	public static void Print(int[][] arr) {
		for (int col = 0; col < arr[0].length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col] + " ");
				}
			} else {
				for (int row = arr.length - 1; row >= 0; row--) {
					System.out.print(arr[row][col] + " ");
				}
			}
		}
	}
}
