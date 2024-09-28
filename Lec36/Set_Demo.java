package Lec36;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		// add
		set.add(2);
		set.add(12);
		set.add(-2);
		set.add(21);
		set.add(3);
		set.add(13);
		set.add(41);
		set.add(2);
		System.out.println(set);
//		//get --> contains
//		System.out.println(set.contains(5));
//		System.out.println(set.contains(2));
//		//remove
//		System.out.println(set.remove(7));
//		System.out.println(set.remove(3));
//		System.out.println(set);
		TreeSet<Integer> set1 = new TreeSet<>();
		// add
		set1.add(2);
		set1.add(12);
		set1.add(-2);
		set1.add(21);
		set1.add(3);
		set1.add(13);
		set1.add(41);
		set1.add(2);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		// add
		set2.add(2);
		set2.add(12);
		set2.add(-2);
		set2.add(21);
		set2.add(3);
		set2.add(13);
		set2.add(41);
		set2.add(2);
		System.out.println(set2);
		for (int v : set) {
			System.out.print(v + " ");
		}
		System.out.println();
		for (int v : set1) {
			System.out.print(v + " ");
		}
		System.out.println();
		for (int v : set2) {
			System.out.print(v + " ");
		}
	}

}
