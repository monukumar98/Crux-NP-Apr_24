package Lec44;

import java.util.Scanner;

public class Tavas_and_SaDDas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(Index(s));

	}

	public static int Index(String s) {
		int n = s.length();
		int pos = 0;
		int count = (1 << n) - 2;// n-1th saara Lucky number ka count
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '7') {
				count = count + (1 << pos);// count + 2^pos
			}
			pos++;
		}
		return count + 1;
	}
}
