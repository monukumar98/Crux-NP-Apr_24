package Lec16;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		// Print(n, 0, "");
		System.out.println("\n" + Count(n, 0, ""));

	}

	public static int Count(int n, int curr, String ans) {
		if (curr == n) {
			System.out.print(ans + " ");
			return 1;
		}
		if (curr > n) {
			return 0;
		}
		int count = 0;
		for (int dice = 1; dice <= 3; dice++) {
			count += Count(n, curr + dice, ans + dice);
		}
		return count;
	}

	public static void Print(int n, int curr, String ans) {
		if (curr == n) {
			System.out.println(ans);
			return;
		}
		if (curr > n) {
			return;
		}
		for (int dice = 1; dice <= 3; dice++) {
			Print(n, curr + dice, ans + dice);
		}
//		Print(n, curr + 1, ans + 1);
//		Print(n, curr + 2, ans + 2);
//		Print(n, curr + 3, ans + 3);

	}
}
