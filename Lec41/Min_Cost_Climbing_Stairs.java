package Lec41;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 15, 20 };
		int zero = Min_Cost(arr, 0);
		int one = Min_Cost(arr, 1);
		System.out.println(Math.min(zero, one));
	}

	public static int Min_Cost(int[] arr, int i) {
		if(i>=arr.length) {
			return 0;
		}
		int a=Min_Cost(arr, i+1);
		int b=Min_Cost(arr, i+2);
		
		return arr[i]+Math.min(a, b);

	}
}
