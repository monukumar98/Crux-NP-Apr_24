package Lec17;

public class Permutation_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abca";
		print(ques, "");
	}

	public static void print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			if (IsPresent(ques, ch, i + 1) == false) {
				String s1 = ques.substring(0, i);
				String s2 = ques.substring(i + 1);
				print(s1 + s2, ans + ch);
			}
		}

	}

	public static boolean IsPresent(String s, char ch, int i) {
		for (int j = i; j < s.length(); j++) {
			if (s.charAt(j) == ch) {
				return true;
			}
		}
		return false;

	}

}
