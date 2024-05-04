package Lec1;

public class Inc_Dec_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8;
//		System.out.println(a++);// a= a+1;
//		System.out.println(a);

//		int x = a++ + 7 - a-- + a-- + 11;//25
		// int x = a-- + 8 + -a-- + a++ - a++;//8

//		System.out.println(++a);// a= a+1;
//		System.out.println(a);
		int x = a++ - ++a + 7 + --a + a-- + --a;
		System.out.println(x);

	}

}
