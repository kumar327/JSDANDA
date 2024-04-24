package com.aks.hash;

import java.util.Random;

public class RandomizedSet {

	Node[] re = null;
	int le = 0;

	class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}
	}

	int[] arr = null;

	public int genrateHashCode(int val) {
		int Prime_Number = 7;
		return (Prime_Number * val) % re.length;
	}

	public RandomizedSet() {
		re = new Node[100];
	}

	public boolean insert(int val) {
		Node n = new Node(val);
		if (re.length * 0.75 <= le) {
			Node[] newNode = re;
			re = new Node[re.length * 2];
			for (int i = 0; i < re.length; i++) {
				int hashCode = genrateHashCode(val);
				Node node = newNode[hashCode];
				re[hashCode] = node;
			}
		}

		int hashCode = genrateHashCode(val);
		Node node = re[hashCode];
		if (node == null) {
			re[hashCode] = n;
		} else {
			Node temp = node;
			while (temp.next != null) {
				if (temp.val == val)
					return false;

				temp = temp.next;
			}
		}

		le++;
		return true;
	}

	public boolean remove(int val) {

		int hashCode = genrateHashCode(val);

		Node temp = re[hashCode];
		if (temp != null) {
			Node prev = temp;
			if (prev.val == val) {
				temp = temp.next;
				re[hashCode] = temp;
				return true;
			}
			Node next = temp.next;
			while (next != null) {
				if (next.val == val) {
					prev = next.next;
					re[hashCode] = prev;
					return true;
				}
				prev = next;
				next = next.next;
			}
		}

		return false;
	}

	public int getRandom() {
		Random random = new Random();
		int randomNumber = random.nextInt(re.length - 0 + 1) + 0;
//		Node temp = re[randomNumber];
//		while (temp == null) {
//			getRandom();
//		}
		return randomNumber;
	}

	public static void main(String[] args) {
		RandomizedSet r = new RandomizedSet();
		System.out.println(r.getRandom());

	}
}
