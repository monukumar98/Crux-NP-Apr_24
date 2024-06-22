package Lec14;

import java.util.ArrayList;

public class For_Each_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		// add
		ll.add(10);
		ll.add(20);
		ll.add(5);
		ll.add(51);
		ll.add(15);
		System.out.println(ll);
		int[] arr = { 10, 20, 30, 40, 50 };

		for (int v : ll) {
			System.out.print(v + " ");
		}
		System.out.println();
		for (int v : arr) {
			System.out.print(v + " ");
			v=-90;
		}

	}

}
