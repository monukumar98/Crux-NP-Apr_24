package Lec44;

public class SubSequnce_Using_BitMasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		PrintSubSequnce(str);

	}

	public static void PrintSubSequnce(String str) {
		int n = str.length();
		for (int i = 0; i < (1 << n); i++) {
			Patter(str, i);
		}

	}

	public static void Patter(String str, int n) {
		// TODO Auto-generated method stub
		int pos = 0;
		while (n > 0) {
			if ((n & 1) == 1) {
				System.out.print(str.charAt(pos));
			}
			pos++;
			n >>= 1;
		}
		System.out.println();
	}

}
