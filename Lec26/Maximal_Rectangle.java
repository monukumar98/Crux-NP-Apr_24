package Lec26;

import java.util.Stack;

public class Maximal_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix = { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
				{ '1', '0', '0', '1', '0' } };
	System.out.println(Rectangle(matrix));
	}

	public static int Rectangle(char[][] matrix) {
		int[] arr = new int[matrix[0].length];
		int area=0;
		for (int i = matrix.length - 1; i >= 0; i--) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == '1') {
					arr[j]++;
				} else {
					arr[j] = 0;
				}
			}
			area=Math.max(largestArea(arr), area);
			
		}
		return area;

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
