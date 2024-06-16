package Lec13;

public class Reverse_Words_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "  a good           example to   ";
		// System.out.println(s);
		s = s.trim();
		String[] arr = s.split(" +");
		String ans="";
		for (int i = arr.length-1; i>=0; i--) {
			ans+=arr[i]+" ";
		}
//		System.out.println(arr.length);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		System.out.println(ans);
	}

}
