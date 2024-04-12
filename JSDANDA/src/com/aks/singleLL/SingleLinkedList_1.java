package com.aks.singleLL;

public class SingleLinkedList_1 {

	class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
			this.next = null;
		}
	}

	int length;
	Node head;
	Node tail;

	public SingleLinkedList_1() {
		this.length = 0;
		this.head = null;
		this.tail = null;
	}

	public void add(int value) {

		Node newNode = new Node(value);
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			this.tail.next = newNode;
			this.tail = newNode;

		}
		System.out.println("Tail Value :: " + tail.value);
		this.length++;
	}

	public void insertAtBegining(int value) {

		Node newNode = new Node(value);
		newNode.next = this.head;
		this.head = newNode;
		this.length++;
	}

	public void insertAtEnd(int value) {

		Node newNode = new Node(value);
		this.tail.next = newNode;
		this.tail = newNode;
		this.length++;
	}

	public void remove() {

		Node newTail = this.head;
		Node current = this.head;

		while (current.next != null) {
			newTail = current;
			current = current.next;
		}
		tail = newTail;
		tail.next = null;
		this.length--;
	}

	public void removeBegining() {

		this.head = head.next;
		this.length--;
	}

	public void get() {

		Node temp = this.head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}

	}

	public static void main(String[] args) {

		SingleLinkedList_1 s = new SingleLinkedList_1();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.get();
		System.out.println("=========");
		s.insertAtBegining(50);
		s.get();
		System.out.println("=========");
		s.insertAtEnd(60);
		s.get();
		System.out.println("========= Remove");
		s.remove();
		s.remove();
		s.remove();
		s.get();
		System.out.println("========= Remove Begi");

		s.removeBegining();
		s.get();
	}
}
