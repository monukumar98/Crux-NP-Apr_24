package Lec25;

import java.util.Stack;

public class Construct_Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IIIDIDDD";
		System.out.println(Number(s));
	}

	public static String Number(String pattern) {
		int[] ans = new int[pattern.length() + 1];
		int c = 1;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i <= pattern.length(); i++) {
			if (i == pattern.length() || pattern.charAt(i) == 'I') {
				ans[i] = c++;
				// c++;
				while (!st.isEmpty()) {
					ans[st.pop()] = c++;
				}
			} else {
				st.push(i);
			}
		}
		String s = "";
		for (int i = 0; i < ans.length; i++) {
			s = s + ans[i];
		}
		return s;
	}
}
