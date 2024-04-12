package com.aks.binary.tree;

public class LeetCodeAdd {

	public static TreeNode bstFromPreorder(int[] preorder) {
		TreeNode results = new TreeNode(preorder[0]);

		for (int i = 1; i < preorder.length; i++) {
			int val = preorder[i];
			TreeNode newNode = new TreeNode(val);
			TreeNode temp = results;
			while (true) {
				if (val > temp.val) {
					if (temp.right == null) {
						temp.right = newNode;
						break;
					}
					temp = temp.right;

				} else if (val < temp.val) {
					if (temp.left == null) {
						temp.left = newNode;
						break;
					}

					temp = temp.left;

				}
			}

		}
		return results;

	}

	public static void main(String[] args) {
		int[] arr = { 8, 5, 1, 7, 10, 12 };
		bstFromPreorder(arr);
	}
}

class TreeNode {
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
