package Lec39;

import java.util.*;;

public class Graph_Bipartite {

	class Solution {
		public boolean isBipartite(int[][] graph) {
			HashMap<Integer, Integer> visited = new HashMap<>();
			Queue<BipartitePair> q = new LinkedList<>();
			for (int i = 0; i < graph.length; i++) {// vtx
				if (visited.containsKey(i)) {
					continue;
				}
				// BFS
				q.add(new BipartitePair(i, 0));
				while (!q.isEmpty()) {
					// 1. remove
					BipartitePair rp = q.poll();

					// 2. Ignore if already visited
					if (visited.containsKey(rp.vtx)) {
						if (visited.get(rp.vtx) != rp.dis) {

							return false;
						}
						continue;
					}

					// 3. marked visited
					visited.put(rp.vtx, rp.dis);

					// 4. self work

					// add unvisited nbrs
					for (int nbrs : graph[rp.vtx]) {
						if (!visited.containsKey(nbrs)) {
							q.add(new BipartitePair(nbrs, rp.dis + 1));
						}
					}
				}
			}
			return true;

		}
	}

	class BipartitePair {
		int vtx;
		int dis;

		public BipartitePair(int vtx, int dis) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.dis = dis;
		}
	}

}
