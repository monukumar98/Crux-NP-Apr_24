package Lec44;

public class Magic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int mul = 5;
		int sum = 0;
		while (n > 0) {
			if ((n & 1) == 1) {
				sum += mul;
			}
			n >>= 1;
			mul *= 5;
		}
		System.out.println(sum);
	}

}
