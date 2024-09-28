package Lec36;

import java.util.HashSet;

public class Longest_Consecutive_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1, 12, 13, 14 };
		System.out.println(Longest_Consecutive(arr));
	}

	public static int Longest_Consecutive(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i]) && !set.contains(arr[i] - 1)) {
				int c = 0;
				int v = arr[i];
				while (set.contains(v)) {
					c++;
					set.remove(v);
					v++;
				}
				ans = Math.max(ans, c);
			}
		}
		return ans;
	}
}
