package Lec25;

import java.util.Stack;

public class Valid_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean Valid(String s) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				st.push(ch);
			} else {
				if (st.isEmpty()) {
					return false;
				} else {
					if (ch == ')') {
						if (st.peek() != '(') {
							return false;
						}
						st.pop();

					} else if (ch == '}') {
						if (st.peek() != '{') {
							return false;
						}
						st.pop();

					} else {
						if (st.peek() != '[') {
							return false;
						}
						st.pop();

					}
				}
			}
		}
		return st.size() == 0;
	}
}
