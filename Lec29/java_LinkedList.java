package Lec29;

import java.util.*;

public class java_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(1, -9);
		System.out.println(ll);
		for (int val : ll) {
			System.out.print(val + " ");
		}
		System.out.println();
		System.out.println(ll.get(1));
		System.out.println(ll.remove());//remove first
//		System.out.println(ll.removeFirst());
//		System.out.println(ll.remove(0));
		System.out.println();
		//Queue  addlast and removefirst 
		//LinkedList<Integer> ll1 = new LinkedList<>();
		Queue<Integer> ll1 = new LinkedList<>();
		ll1.add(10);// add last
		ll1.add(20);
		ll1.add(40);
		ll1.add(30);
		ll1.add(50);
		System.out.println(ll1.remove());//remove first// poll()

	}

}
