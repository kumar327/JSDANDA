package com.aks.binary.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class BinarySearchTreeDemo_1 {

	class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

	Node root;

	public BinarySearchTreeDemo_1() {
		this.root = null;

	}

	public void add(int val) {
		Node newN = new Node(val);
		if (root == null) {
			this.root = newN;
			return;
		}

		Node temp = this.root;

		while (true) {

			if (val < temp.val) {
				if (temp.left == null) {
					temp.left = newN;
					return;
				}
				temp = temp.left;
			} else if (val > temp.val) {
				if (temp.right == null) {
					temp.right = newN;
					return;
				}
				temp = temp.right;
			} else {
				return;
			}
		}
	}

	public List<Integer> getBFS() {
		List<Integer> re = new ArrayList<>();

		ArrayDeque<Node> de = new ArrayDeque<>();

		de.add(root);
		while (!de.isEmpty()) {
			Node temp = de.pop();
			re.add(temp.val);
			if (temp.left != null) {
				de.add(temp.left);
			}
			if (temp.right != null) {
				de.add(temp.right);
			}

		}
		return re;

	}

	public List<Integer> getPreDFS() {
		List<Integer> re = new ArrayList<>();
		preOrder(re, root);
		return re;
	}

	private void preOrder(List<Integer> list, Node temp) {

		if (temp == null)
			return;

		list.add(temp.val);
		if (temp.left != null) {
			preOrder(list, temp.left);
		}
		if (temp.right != null) {
			preOrder(list, temp.right);
		}
	}

	public static void main(String[] args) {
		BinarySearchTreeDemo_1 b = new BinarySearchTreeDemo_1();
		b.add(10);
		b.add(5);
		b.add(11);
		b.add(10);
		b.add(9);
		b.add(1);
		System.out.println(b.getBFS());
		System.out.println(b.getPreDFS());
	}
}
