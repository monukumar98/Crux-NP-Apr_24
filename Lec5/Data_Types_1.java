package Lec5;

import java.util.Scanner;

public class Data_Types_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte b = (byte)(420);
		// byte b = (byte) (300);
		byte b = 5;
		short s = 191;
		int i = 159;
		long l = 109;
		System.out.println(b);
		i = b;
		byte b1 = 12;
		b1 = (byte) (b1 + 4);
		b1++;// b = (byte)(b + 1);
		// b1+=1;// b = (byte)(b + 1);
		System.out.println(b1);
		Scanner sc = new Scanner(System.in);
		b = sc.nextByte();
		i = sc.nextInt();
		l = sc.nextLong();
		s = sc.nextShort();
		long ll =1000000000000000000l;
		System.out.println(l);
	}

}




















