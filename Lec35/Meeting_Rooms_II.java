package Lec35;

import java.util.*;

public class Meeting_Rooms_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = { { 0, 30 }, { 5, 10 }, { 15, 20 }, { 6, 9 } };
		System.out.println(minRooms(intervals));
	}

	public static int minRooms(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
		pq.add(intervals[0]);
		int count = 1;
		for (int i = 1; i < intervals.length; i++) {
			if (pq.peek()[1] > intervals[i][0]) {
				pq.add(intervals[i]);
				count = Math.max(count, pq.size());
			} else {
				pq.poll();
				pq.add(intervals[i]);
			}
		}
		return count;
	}
}
