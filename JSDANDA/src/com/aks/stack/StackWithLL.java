package com.aks.stack;

public class StackWithLL {

	class Node {

		int value;
		Node next;

		public Node(int value) {
			this.value = value;
			this.next = null;
		}
	}

	Node head;
	int length;

	public StackWithLL() {
		this.head = null;
		this.length = 0;
	}

	public void push(int val) {

		Node newNode = new Node(val);
		if (this.head == null) {
			this.head = newNode;
		} else {
			Node temp = this.head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;

		}
		this.length++;
	}

	public void unShift(int val) {

		Node newNode = new Node(val);
		if (this.head == null) {
			this.head = newNode;
		} else {
			newNode.next = this.head;
			this.head = newNode;

		}
		this.length++;
	}

	public void getAll() {
		Node temp = this.head;
		while (temp != null) {
			System.out.println("Value :: " + temp.value);
			temp = temp.next;
		}
	}

	public int pop() {
		int removeValue = -1;

		if (this.length == 0)
			return removeValue;

		if (this.length == 1) {
			removeValue = this.head.value;
			this.head = null;
			this.length = 0;
			return removeValue;
		}

		Node temp = this.head;
		Node last = this.head;
		while (temp.next != null) {
			last = temp;
			temp = temp.next;
		}
		removeValue = temp.value;
		temp = last;
		temp.next = null;
		this.length--;
		return removeValue;
	}

	public int shift() {
		int removeValue = -1;

		if (this.length == 0)
			return removeValue;

		if (this.length == 1) {
			removeValue = this.head.value;
			this.head = null;
			this.length = 0;
			return removeValue;
		}
		removeValue = this.head.value;
		this.head = this.head.next;
		this.length--;
		return removeValue;
	}

	public static void main(String[] args) {
		StackWithLL s = new StackWithLL();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.getAll();
//		System.out.println("Pop :: " + s.pop());
//		System.out.println("Pop :: " + s.pop());
//		System.out.println("Pop :: " + s.pop());

//		System.out.println("Pop :: " + s.pop());
//		System.out.println("Shift :: " + s.shift());
//		System.out.println("Shift :: " + s.shift());
//		System.out.println("Shift :: " + s.shift());
		System.out.println("Pop :: " + s.pop());
		System.out.println("Shift :: " + s.shift());
		System.out.println("Shift :: " + s.shift());
		System.out.println("Pop :: " + s.pop());
		System.out.println("Shift :: " + s.shift());
		System.out.println("Pop :: " + s.pop());
		s.unShift(70);
		s.unShift(90);

		s.getAll();

		System.out.println("Pop :: " + s.pop());
	}
}
