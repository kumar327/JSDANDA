package com.aks.singleLL;

public class ReverseByRecusrion {

	class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
			this.next = null;
		}

	}

	Node head;

	public ReverseByRecusrion() {
		this.head = null;
	}

	public void add(int val) {
		Node newN = new Node(val);
		if (this.head == null) {
			head = newN;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newN;
		}
	}

	public void getAll() {
		Node temp = this.head;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

	public void getAll(Node curr) {
		Node temp = curr;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

	public void reverse() {
//		Node prev = null;
		Node curr = this.head;
//		Node next = null;
//
//		while (curr != null) {
//			next = curr.next;
//			curr.next = prev;
//			prev = curr;
//			curr = next;
//		}
		this.head = supportRevrse(curr, null, null);

	}

	public Node supportRevrse(Node curr, Node prev, Node next) {
		if (curr == null)
			return prev;

		next = curr.next;
		curr.next = prev;
		prev = curr;
		curr = next;

		return supportRevrse(curr, prev, next);
	}

	public static Node reverseList(Node head) {
		// Base case: if head is empty or only one node, return it
		if (head == null || head.next == null) {
			return head;
		}

		// Recursively reverse the rest of the list
		Node newHead = reverseList(head.next);

		// Make the next node point to the current node
		head.next.next = head;

		// Sever the link to prevent a cycle
		head.next = null;

		return newHead;
	}

	public static void main(String[] args) {
		ReverseByRecusrion r = new ReverseByRecusrion();
		r.add(10);
		r.add(20);
		r.add(30);
		r.add(40);
		r.add(50);
		r.add(60);
		r.getAll();
//		r.reverse();
//		System.out.println("After Reverse");
//		r.getAll();
		System.out.println("After Reverse");
		Node Node = r.reverseList(r.head);
		r.getAll(Node);
	}
}
