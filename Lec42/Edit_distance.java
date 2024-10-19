package Lec42;

public class Edit_distance {
	public static void main(String[] args) {
		String s = "FOOD";
		String t = "MONEY";
		System.out.println(Min_operation(s, t, 0, 0));

	}

	public static int Min_operation(String s, String t, int i, int j) {
		if (i == s.length()) {
			return t.length() - j;
		}
		if (j == t.length()) {
			return s.length() - i;
		}
		int ans = 0;
		if (s.charAt(i) == t.charAt(j)) {
			ans = Min_operation(s, t, i + 1, j + 1);
		} else {
			int D = Min_operation(s, t, i + 1, j);
			int I = Min_operation(s, t, i, j + 1);
			int R = Min_operation(s, t, i + 1, j + 1);
			ans = 1 + Math.min(I, Math.min(D, R));
		}
		return ans;

	}

}
