package Lec44;

public class Set_UnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		int i = 3;
		IthBitSet(n, i);

	}

	public static void IthBitSet(int n, int i) {
		int mask = (1 << i);
		if ((n & mask) == 0) {
			System.out.println("bit 0 hai");
		} else {
			System.out.println("bit 1 hai");
		}

	}
}
