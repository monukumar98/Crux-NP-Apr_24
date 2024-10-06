package Lec39;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;


public class DIjkstra_Algorithm {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public DIjkstra_Algorithm(int v) {
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

	class DijkstraPair {
		int vtx;
		String acqpath;
		int cost;

		public DijkstraPair(int vtx, String acqpath, int cost) {
			// TODO Auto-generated constructor stub
			this.acqpath = acqpath;
			this.vtx = vtx;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return vtx + " " + acqpath + " @ " + cost;
		}
	}

	public void Dijkstra() {
		HashSet<Integer> visited = new HashSet<>();
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {

			@Override
			public int compare(DijkstraPair o1, DijkstraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}

		});
		pq.add(new DijkstraPair(1, "1", 0));
		while (!pq.isEmpty()) {
			// 1. remove
			DijkstraPair rp = pq.poll();

			// 2. Ignore if already visited
			if (visited.contains(rp.vtx)) {
				continue;
			}

			// 3. marked visited
			visited.add(rp.vtx);

			// 4. self work
			System.out.println(rp);

			// 5. add unvisited nbrs
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new DijkstraPair(nbrs, rp.acqpath + rp.vtx, rp.cost + cost));
				}
			}

		}

	}
	public static void main(String[] args) {
		DIjkstra_Algorithm pa = new DIjkstra_Algorithm(7);
		pa.AddEdge(1, 2, 2);
		pa.AddEdge(2, 3, 3);
		pa.AddEdge(1, 4, 10);
		pa.AddEdge(4, 5, 8);
		pa.AddEdge(3, 4, 1);
		pa.AddEdge(5, 6, 5);
		pa.AddEdge(5, 7, 6);
		pa.AddEdge(6, 7, 4);
		pa.Dijkstra();

	}

	}

