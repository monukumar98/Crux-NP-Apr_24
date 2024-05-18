package Lec5;

import java.util.Scanner;

public class Data_Types_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		char ch = 'a';
		System.out.println(ch);
		ch++;// ch = (char)(ch+1)
		System.out.println(ch);
		ch = (char) (ch + 1);
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);

	}

}
