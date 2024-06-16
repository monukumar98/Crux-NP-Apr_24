package Lec13;

public class Compare_TO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 = "komal";
//		String s2 = "kunal";
		String s1 = "raj";
		String s2 = "rajesh";
		// System.out.println(s1.compareTo(s2));
		System.out.println(Comapre(s1, s2));

	}

	public static int Comapre(String s1, String s2) {
		int len = Math.min(s1.length(), s2.length());
		for (int i = 0; i < len; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);
			}
		}
		return s1.length()-s2.length();

	}

}
