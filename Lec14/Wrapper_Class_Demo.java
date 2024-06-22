package Lec14;

public class Wrapper_Class_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Integer a1 = 8;
		System.out.println(a);
		System.out.println(a1);
//		Long l = 19l;
//		Byte b = 19;
//		Character ch = 'a';
		int b = 17;
		Integer b1 = 12;
		b1 = b;// auto-boxing
		System.out.println(b1);
		a = a1;// UnBoxing
		System.out.println(a);

		Integer c1 = 19;
		Integer c2 = 19;
		Integer c3 = 195;
		Integer c4 = 195;
		System.out.println(c1 == c2);
		System.out.println(c3 == c4);
		Float f = 9.8f;

	}

}
