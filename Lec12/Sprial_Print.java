package Lec12;

public class Sprial_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 4, 7, 11 }, { 2, 5, 8, 12 }, { 3, 6, 9, 16 } };
		Print(arr);
	}

	public static void Print(int[][] arr) {
		int minc = 0, minr = 0;
		int maxc = arr[0].length - 1, maxr = arr.length - 1;
		int te = arr.length * arr[0].length;
		int c = 0;
		while (c < te) {
			for (int i = minc; i <= maxc && c < te; i++) {
				System.out.print(arr[minr][i] + " ");
				c++;
			}
			minr++;
			for (int i = minr; i <= maxr && c < te; i++) {
				System.out.print(arr[i][maxc] + " ");
				c++;
			}
			maxc--;
			for (int i = maxc; i >= minc && c < te; i--) {
				System.out.print(arr[maxr][i] + " ");
				c++;
			}
			maxr--;
			for (int i = maxr; i >= minr && c < te; i--) {
				System.out.print(arr[i][minc] + " ");
				c++;
			}
			minc++;
		}
	}

}
