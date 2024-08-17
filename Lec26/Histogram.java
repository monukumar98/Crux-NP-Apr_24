package Lec26;

import java.util.Stack;

public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 5, 6, 2, 3 };
		System.out.println(largestArea(arr));
	}
	public static int largestArea(int[] heights) {
		Stack<Integer> st = new Stack<>();
		int area = 0;
		for (int i = 0; i < heights.length; i++) {
			while (!st.isEmpty() && heights[i] < heights[st.peek()]) {
				int r = i;
				int h = heights[st.pop()];
				if (!st.isEmpty()) {
					int l = st.peek();
					area = Math.max(area, h * (r - l - 1));
				} else {
					area = Math.max(area, h * r);
				}
			}
			st.push(i);
		}
		int r = heights.length;
		while (!st.isEmpty()) {
			int h = heights[st.pop()];
			if (!st.isEmpty()) {
				int l = st.peek();
				area = Math.max(area, h * (r - l - 1));
			} else {
				area = Math.max(area, h * r);
			}
		}
		return area;

	}
}









