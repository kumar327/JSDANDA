package com.aks.binary.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class BinraySearchTree_2 {

	class Node {
		int val;
		Node left;
		Node right;

		Node(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

	Node head;

	public BinraySearchTree_2() {
		this.head = null;
	}

	public void add(int val) {
		Node n = new Node(val);
		if (head == null) {
			head = n;
		} else {
			Node temp = head;
			while (true) {
				if (temp.val > val) {
					if (temp.left == null) {
						temp.left = n;
						return;
					}
					temp = temp.left;
				} else {
					if (temp.right == null) {
						temp.right = n;
						return;
					}
					temp = temp.right;
				}
			}
		}

	}

	public List<Integer> getAll_BFS() {
		List<Integer> list = new ArrayList<>();

		ArrayDeque<Node> q = new ArrayDeque<>();
		q.add(this.head);

		while (!q.isEmpty()) {
			Node temp = q.remove();
			list.add(temp.val);
			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);
		}

		return list;
	}

	List<Integer> DFS_PreOrder() {
		List<Integer> list = new ArrayList<>();
		preOrder(this.head, list);
		return list;
	}

	void preOrder(Node temp, List<Integer> results) {
		if (temp == null)
			return;
		results.add(temp.val);
		if (temp.left != null) {
			preOrder(temp.left, results);
		}

		if (temp.right != null) {
			preOrder(temp.right, results);
		}
	}

	boolean findValue(int val) {
		Node temp = head;
		while (temp != null) {
			if (temp.val == val)
				return true;
			else if (temp.val > val)
				temp = temp.left;
			else
				temp = temp.right;
		}
		return false;
	}

	public static void main(String[] args) {
		BinraySearchTree_2 b = new BinraySearchTree_2();
		b.add(10);
		b.add(1);
		b.add(4);
		b.add(4);
		b.add(9);
		b.add(99);
		b.add(10);
		System.out.println(b.getAll_BFS());
		System.out.println(b.DFS_PreOrder());
		System.out.println(b.findValue(99));
		System.out.println(b.findValue(999));
	}
}
