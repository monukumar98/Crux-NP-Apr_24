package Lec33;

import java.util.*;

public class Create_Using_Level_order {
	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

	public Create_Using_Level_order() {
		// TODO Auto-generated constructor stub
		Create_Tree();
	}

	Scanner sc = new Scanner(System.in);

	private void Create_Tree() {
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		root = nn;
		Queue<Node> q = new LinkedList<>();
		q.add(nn);
		while (!q.isEmpty()) {
			Node n = q.poll();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				Node node = new Node();
				node.val = c1;
				n.left = node;
				q.add(node);
			}
			if (c2 != -1) {
				Node node = new Node();
				node.val = c2;
				n.right = node;
				q.add(node);
			}
		}
	}
}
