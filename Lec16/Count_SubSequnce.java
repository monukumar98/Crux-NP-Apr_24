package Lec16;

public class Count_SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		System.out.println("\n"+Count(ques, ""));
//		System.out.println(c);

	}

	public static int Count(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans+" ");
			return 1;
		}
		char ch = ques.charAt(0);// 'a'
		int c1 = Count(ques.substring(1), ans);// no
		int c2 = Count(ques.substring(1), ans + ch);// yes
		return c1+c2;

	}

	// static int c = 0;
//
//	public static void Print(String ques, String ans) {
//		if (ques.length() == 0) {
//			System.out.println(ans);
//			c++;
//			return;
//		}
//		char ch = ques.charAt(0);// 'a'
//		Print(ques.substring(1), ans);// no
//		Print(ques.substring(1), ans + ch);// yes
//
//	}

}
