package com.aks.binary.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class BinarySearchTree {

	int length;
	Node root;

	public BinarySearchTree() {
		this.length = 0;
		this.root = null;
	}

	public int add(int value) {

		Node newNode = new Node(value);

		if (this.root == null) {
			this.root = newNode;
		} else {
			Node temp = this.root;
			while (true) {
				if (temp.value > value) {
					if (temp.left == null) {
						temp.left = newNode;
						return value;
					}
					temp = temp.left;

				} else if (temp.value < value) {
					if (temp.right == null) {
						temp.right = newNode;
						return value;
					}
					temp = temp.right;
				} else {
					return Integer.MIN_VALUE;
				}
			}

		}

		return value;
	}

	public boolean search(int value) {

		Node temp = this.root;

		while (temp != null) {
			if (temp.value == value) {
				return true;
			} else if (temp.value > value) {
				temp = temp.left;
			} else {
				temp = temp.right;
			}

		}

		return false;
	}

	public int min() {
		if (this.root == null) {
			System.out.println("Exception occured becuse there are no value in the tree");
		}
		Node temp = this.root;
		while (temp.left != null) {
			temp = temp.left;
		}
		return temp.value;
	}

	public int max() {

		if (this.root == null) {
			System.out.println("Exception occured becuse there are no value in the tree");
		}
		Node temp = this.root;
		while (temp.right != null) {
			temp = temp.right;
		}
		return temp.value;
	}

	public boolean remove(int value) {

		return false;
	}

	public List<Integer> BFS() {
		Node node = this.root;
		List<Integer> results = new ArrayList<>();
		ArrayDeque<Node> q = new ArrayDeque<>();
		q.add(this.root);
		while (!q.isEmpty()) {
			Node temp = q.remove();
			results.add(temp.value);
			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);

		}

		return results;
	}

	public List<Integer> DFS_Preorder() {
		List<Integer> results = new ArrayList<>();
		preOder(this.root, results);
		return results;
	}

	public void preOder(Node node, List<Integer> results) {
		if (node == null) {
			return;
		}

		results.add(node.value);

		if (node.left != null)
			preOder(node.left, results);

		if (node.right != null)
			preOder(node.right, results);

	}

	public List<Integer> DFS_Postorder() {
		List<Integer> results = new ArrayList<>();
		postOder(this.root, results);
		return results;
	}

	public void postOder(Node node, List<Integer> results) {
		if (node == null)
			return;

		if (node.left != null)
			postOder(node.left, results);

		if (node.right != null)
			postOder(node.right, results);

		results.add(node.value);

	}

	public List<Integer> DFS_InOrder() {
		List<Integer> results = new ArrayList<>();
		inOder(this.root, results);
		return results;
	}

	public void inOder(Node node, List<Integer> results) {
		if (node == null)
			return;

		if (node.left != null)
			inOder(node.left, results);

		results.add(node.value);

		if (node.right != null)
			inOder(node.right, results);

	}

	public static void main(String[] args) {
		BinarySearchTree b = new BinarySearchTree();
		b.add(10);
		b.add(6);
		b.add(15);
		System.out.println(b.add(15));
		b.add(3);
		b.add(8);
		b.add(20);
		System.out.println(b.search(0));
		System.out.println(b.search(10));
		System.out.println(b.search(3));
		System.out.println(b.search(21));
		System.out.println(b.search(Integer.MIN_VALUE));
		System.out.println("Min Value :: " + b.min());
		System.out.println("Max Value :: " + b.max());
		System.out.println("Fetch the list :: " + b.BFS());

		System.out.println("Fetch the list  with DFS Pre order:: " + b.DFS_Preorder());

		System.out.println("Fetch the list  with DFS Post  order:: " + b.DFS_Postorder());

		System.out.println("Fetch the list  with DFS In  order:: " + b.DFS_InOrder());
	}

}

class Node {

	int value;
	Node right;
	Node left;

	public Node(int value) {
		this.value = value;
		this.right = null;
		this.left = null;
	}
}