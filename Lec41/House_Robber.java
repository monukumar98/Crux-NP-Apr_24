package Lec41;

import java.util.Arrays;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, 9, 3, 1 };
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
//		for (int i = 0; i < dp.length; i++) {
//			dp[i]=-1;
//		}
//		System.out.println(Robber2(arr, 0, dp));
		System.out.println(Robber1(arr, arr.length - 1, dp));
	}

	public static int RobberBU(int[] arr) {
		if (arr.length == 1) {
			return arr[0];
		}
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		for (int i = 2; i < dp.length; i++) {
			int rob = arr[i] + dp[i - 2];
			int Dont_rob = dp[i - 1];
			dp[i] = Math.max(rob, Dont_rob);
		}
		return dp[dp.length - 1];
	}

	public static int Robber1(int[] arr, int i, int[] dp) {// recursion backward to table aage se fill hoga
		if (i < 0) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + Robber1(arr, i - 2, dp);
		int Dont_rob = Robber1(arr, i - 1, dp);
		return dp[i] = Math.max(rob, Dont_rob);

	}

	public static int Robber2(int[] arr, int i, int[] dp) {// recursion 0th index mtlb aage se chal raha to table
															// backward fill hoga
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + Robber2(arr, i + 2, dp);
		int Dont_rob = Robber2(arr, i + 1, dp);
		return dp[i] = Math.max(rob, Dont_rob);

	}

}
