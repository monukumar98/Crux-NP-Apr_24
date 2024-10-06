package Lec39;

import java.util.*;

public class Prim_Algorithm {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Prim_Algorithm(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	class PrimPair {
		int vtx;
		int acqvtx;
		int cost;

		public PrimPair(int vtx, int acqvtx, int cost) {
			// TODO Auto-generated constructor stub
			this.acqvtx = acqvtx;
			this.vtx = vtx;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return vtx + " " + acqvtx + " @ " + cost;
		}
	}

	public int Prims() {
		HashSet<Integer> visited = new HashSet<>();
		PriorityQueue<PrimPair> pq = new PriorityQueue<>(new Comparator<PrimPair>() {

			@Override
			public int compare(PrimPair o1, PrimPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}

		});
		int sum = 0;
		pq.add(new PrimPair(1, 1, 0));
		while (!pq.isEmpty()) {
			// 1. remove
			PrimPair rp = pq.poll();

			// 2. Ignore if already visited
			if (visited.contains(rp.vtx)) {
				continue;
			}

			// 3. marked visited
			visited.add(rp.vtx);

			// 4. self work
			System.out.println(rp);
			sum += rp.cost;

			// 5. add unvisited nbrs
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new PrimPair(nbrs, rp.vtx, cost));
				}
			}

		}
		return sum;
	}

	public static void main(String[] args) {
		Prim_Algorithm pa = new Prim_Algorithm(7);
		pa.AddEdge(1, 2, 2);
		pa.AddEdge(2, 3, 3);
		pa.AddEdge(1, 4, 10);
		pa.AddEdge(4, 5, 8);
		pa.AddEdge(3, 4, 1);
		pa.AddEdge(5, 6, 5);
		pa.AddEdge(5, 7, 6);
		pa.AddEdge(6, 7, 4);
		System.out.println(pa.Prims());
	}

}
