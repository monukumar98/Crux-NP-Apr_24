package Lec44;

public class Count_Set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		System.out.println(CountSetBit(n));
		System.out.println(CountSetBitFAST(n));

	}

	public static int CountSetBitFAST(int n) {
		int c = 0;
		while (n > 0) {
			n = n & (n - 1);
			c++;
		}
		return c;
	}

	public static int CountSetBit(int n) {
		int c = 0;
		while (n > 0) {
			if ((n & 1) == 1) {
				c++;
			}
			n >>= 1;// n = n >> 1;
		}
		return c;
	}

}
