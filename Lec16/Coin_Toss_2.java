package Lec16;

public class Coin_Toss_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		Print(n, "");

	}

	public static void Print(int n, String ans) {
		// TODO Auto-generated method stub
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			Print(n - 1, ans + "H");
		}
		Print(n - 1, ans + "T");

	}

}
