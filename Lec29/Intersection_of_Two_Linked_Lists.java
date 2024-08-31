package Lec29;

public class Intersection_of_Two_Linked_Lists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			ListNode raj = headA;
			ListNode vgf = headB;
			while (raj != vgf) {
				if (raj == null) {
					raj = headB;
				} else {
					raj = raj.next;
				}
				if (vgf == null) {
					vgf = headA;
				} else {
					vgf = vgf.next;
				}

			}
			return raj;

		}
	}
}
