package Lec43;

import java.util.Arrays;

public class Minimum_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int[][] dp = new int[arr.length][arr[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Path_Sum(arr, 0, 0, dp));
	}

	public static int Path_Sum(int[][] arr, int cr, int cc, int[][] dp) {
		if (cr == arr.length - 1 && cc == arr[0].length - 1) {
			return arr[cr][cc];
		}
		if (cr >= arr.length || cc >= arr[0].length) {
			return Integer.MAX_VALUE;
		}
		if (dp[cr][cc] != -1) {
			return dp[cr][cc];
		}
		int h = Path_Sum(arr, cr, cc + 1, dp);
		int v = Path_Sum(arr, cr + 1, cc, dp);
		return dp[cr][cc] = Math.min(h, v) + arr[cr][cc];

	}
}
