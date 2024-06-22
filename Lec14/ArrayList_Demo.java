package Lec14;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll.size());
		System.out.println(ll);
		// add
		ll.add(10);
		ll.add(20);
		System.out.println(ll);
		ll.add(1, 90);// index 0 to size
		ll.add(5);
		ll.add(51);
		ll.add(15);
		System.out.println(ll);
		// get
		System.out.println(ll.get(2));// index 0 to size-1
		// remove
		System.out.println(ll.remove(1));
		System.out.println(ll);
		ll.set(2, -5);
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		for (int i = ll.size()-1; i>=0; i--) {
			System.out.print(ll.get(i) + " ");
		}

	}

}
