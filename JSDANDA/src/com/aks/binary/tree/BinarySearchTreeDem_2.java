package com.aks.binary.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class BinarySearchTreeDem_2 {

	Node_1 root;

	public BinarySearchTreeDem_2() {
		this.root = null;
	}

	public void add(int value) {
		Node_1 newNode = new Node_1(value);
		if (this.root == null) {
			this.root = newNode;
		} else {
			Node_1 temp = this.root;
			while (true) {
				if (temp.value < value) {
					if (temp.right == null)
						temp.right = newNode;
					temp = temp.right;
				} else if (temp.value > value) {
					if (temp.left == null)
						temp.left = newNode;
					temp = temp.left;
				} else {
					break;
				}
			}
		}
	}

	public List<Integer> bFS() {
		List<Integer> results = new ArrayList<>();
		ArrayDeque<Node_1> deque = new ArrayDeque<>();
		deque.add(this.root);
		while (!deque.isEmpty()) {
			Node_1 temp = deque.remove();
			results.add(temp.value);
			if (temp.left != null)
				deque.add(temp.left);

			if (temp.right != null)
				deque.add(temp.right);
		}
		return results;
	}

	public List<Integer> DFS_PreOrder() {
		List<Integer> results = new ArrayList<>();
		preOrder(this.root, results);
		return results;

	}

	private void preOrder(Node_1 next, List<Integer> results) {
		if (next == null) {
			return;
		}

		results.add(next.value);

		if (next.left != null) {
			preOrder(next.left, results);
		}

		if (next.right != null) {
			preOrder(next.right, results);
		}

	}

	public static void main(String[] args) {
		BinarySearchTreeDem_2 b = new BinarySearchTreeDem_2();
		b.add(10);
		b.add(6);
		b.add(15);
		b.add(8);
		b.add(3);
		b.add(20);
		b.add(15);
		System.out.println(b.bFS());
		System.out.println(b.DFS_PreOrder());
	}

}

class Node_1 {

	int value;
	Node_1 left;
	Node_1 right;

	public Node_1(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
}
