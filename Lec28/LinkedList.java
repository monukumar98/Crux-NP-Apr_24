package Lec28;

public class LinkedList {
	class Node {
		int val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void addfirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}

	}

	// O(1)
	public void addlast(int item) {
		if (size == 0) {
			addfirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	// O(N)
	public void addatindex(int item, int k) {
		if (k == 0) {
			addfirst(item);
		} else if (k == size) {
			addlast(item);
		} else {
			Node prev = GetNode(k - 1);
			Node nn = new Node();
			nn.val = item;
			nn.next = prev.next;
			prev.next = nn;
			size++;
		}
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}

	// O(N)
	private Node GetNode(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	// O(1)
	public int getFirst() {
		return head.val;
	}

	// O(1)
	public int getlast() {
		return tail.val;
	}

	// O(N)
	public int getatindex(int k) {
		return GetNode(k).val;
	}

	public int removeFirst() {
		int val = head.val;
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			Node temp = head;
			head = head.next;
			temp.next = null;
			size--;
		}
		return val;
	}

	public int removelast() {
		if (size == 1) {
			return removeFirst();
		} else {
			Node prev = GetNode(size - 2);
			int v = tail.val;
			tail = prev;
			tail.next = null;
			size--;
			return v;
		}
	}

	public int removeatindex(int k) {
		if (k == 0) {
			return removeFirst();
		} else if (k == size - 1) {
			return removelast();
		} else {
			Node prev = GetNode(k - 1);
			Node curr = GetNode(k);
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;

		}
	}

}
