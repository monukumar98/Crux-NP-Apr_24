package Lec32;

public class Maximum_Sum_BST {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public int maxSumBST(TreeNode root) {
			return isValid(root).ans;
		}

		public BstPair isValid(TreeNode root) {
			if (root == null) {
				return new BstPair();
			}
			BstPair lbp = isValid(root.left);
			BstPair rbp = isValid(root.right);
			BstPair sbp = new BstPair();
			sbp.max = Math.max(root.val, Math.max(lbp.max, rbp.max));
			sbp.min = Math.min(root.val, Math.min(lbp.min, rbp.min));
			sbp.sum = lbp.sum + rbp.sum + root.val;
			sbp.isbst = lbp.isbst && rbp.isbst && lbp.max < root.val && rbp.min > root.val;
			if (sbp.isbst) {
				sbp.ans = Math.max(sbp.sum, Math.max(lbp.ans, rbp.ans));
			} else {
				sbp.ans = Math.max(lbp.ans, rbp.ans);
			}
			return sbp;

		}

		class BstPair {
			long min = Long.MAX_VALUE;
			long max = Long.MIN_VALUE;
			boolean isbst = true;
			int sum = 0;
			int ans = 0;
		}
	}

}
