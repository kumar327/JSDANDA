package com.aks.doublyLL;

public class DoublyLinkedList {

	class Node {
		int value;
		Node next;
		Node prev;

		public Node(int value) {

			this.value = value;
		}

	}

	Node head;
	Node tail;
	int length;

	public DoublyLinkedList() {
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
			this.tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		this.length++;

	}

	public int removeLast() {
		if (this.tail == null) {
			return -1;
		}
		int value = tail.value;
		Node temp = this.tail.prev;
		this.tail = temp;
		this.tail.next = null;
		this.length--;
		return value;
	}

	public int removeFromBegining() {
		if (this.head == null) {
			return -1;
		}
		int value = head.value;
		Node temp = this.head.next;
		this.head = temp;
		this.head.prev = null;
		this.length--;
		return value;
	}

	public void get() {

		Node temp = this.tail;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.prev;
		}
	}

	public static void main(String[] args) {

		DoublyLinkedList d = new DoublyLinkedList();
		d.add(10);
		d.add(20);
		d.add(30);
		d.get();
		System.out.println(d.removeLast());
		System.out.println("++++=");
		d.get();
		System.out.println(d.removeFromBegining());
		System.out.println("++++=");
		d.get();
	}
}
