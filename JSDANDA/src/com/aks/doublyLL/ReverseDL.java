package com.aks.doublyLL;

public class ReverseDL {

	class Node {
		Node next;
		Node prev;
		int val;

		public Node(int val) {
			this.val = val;
			this.next = null;
			this.prev = null;
		}

	}

	Node head;
	Node tail;
	int length;

	public ReverseDL() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	public void add(int value) {
		Node newNode = new Node(value);
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {

//			Node temp = this.tail;
			this.tail.next = newNode;
			newNode.prev = this.tail;
			this.tail = newNode;
//			temp.prev = this.tail;

		}

	}

	public void reverse() {
		Node reverseHead = null;
		Node reverseTail = null;
		Node temp = this.tail;

		while (temp != null) {
			Node newN = new Node(temp.val);
			if (reverseHead == null) {
				reverseHead = newN;
				reverseTail = newN;
			} else {
				reverseTail.next = newN;
				newN.prev = reverseTail;
				reverseTail = newN;
			}
			temp = temp.prev;
		}
		this.head = reverseHead;
		this.tail = reverseTail;

	}

	public void getAllReverse() {

		Node temp = this.tail;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.prev;
		}

	}

	public void getAllInsertion() {

		Node temp = this.head;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}

	}

	public static void main(String[] args) {
		ReverseDL r = new ReverseDL();
		r.add(10);
		r.add(20);
		r.add(30);
		r.add(40);
		r.getAllInsertion();
		System.out.println("=======================");
		r.getAllReverse();
		r.reverse();
		System.out.println("===========AFter Reverse");
		r.getAllInsertion();
		System.out.println("=======================");
		r.getAllReverse();
	}

}
