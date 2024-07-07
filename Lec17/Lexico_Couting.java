package Lec17;

import java.util.ArrayList;
import java.util.List;

public class Lexico_Couting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		List<Integer> ll = new ArrayList<>();
		Print(0, n,ll);
		System.out.println(ll);

	}

	public static void Print(int curr, int end,List<Integer> ll) {
		if (curr > end) {
			return;
		}
		//System.out.println(curr);
		if(curr!=0) {
		ll.add(curr);
		}
		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			Print(curr * 10 + i, end,ll);
		}

	}
}
