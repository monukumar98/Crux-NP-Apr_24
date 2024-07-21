package Lec18;

public class Key_Paid {
	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "23";
		KeyPaid(ques, "");

	}

	public static void KeyPaid(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);// '2'
		String press = key[ch - '0'];// abc
		for (int i = 0; i < press.length(); i++) {
			KeyPaid(ques.substring(1), ans + press.charAt(i));
		}
	}

}
