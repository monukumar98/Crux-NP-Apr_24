package Lec43;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int[][] dp = new int[arr.length][arr[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -1000000);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < arr[0].length; i++) {
			ans = Math.min(ans, Path_Sum(arr, 0, i, dp));
		}
		System.out.println(ans);
	}

	public static int Path_Sum(int[][] arr, int cr, int cc, int[][] dp) {
		if (cc < 0 || cc >= arr[0].length) {
			return Integer.MAX_VALUE;
		}
		if (cr == arr.length - 1) {
			return arr[cr][cc];
		}
		if (dp[cr][cc] != -1000000) {
			return dp[cr][cc];
		}
		int ld = Path_Sum(arr, cr + 1, cc - 1, dp);
		int d = Path_Sum(arr, cr + 1, cc, dp);
		int rd = Path_Sum(arr, cr + 1, cc + 1, dp);
		return dp[cr][cc] = Math.min(d, Math.min(ld, rd)) + arr[cr][cc];

	}
}
