package com.aks.singleLL;

public class SingleLinkedList_2 {

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

	public SingleLinkedList_2() {
		this.length = 0;
		this.head = null;

	}

	public void add(int value) {

		Node newNode = new Node(value);
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

	public void insertInIndex(int value, int index) {
		if (this.length < index)
			return;
		if (this.length == index) {
			add(value);
		} else if (index == 0) {
			insertAtBegining(value);
		} else {
			Node temp = this.head;
			Node newNode = new Node(value);
			for (int i = 1; i < index; i++) {
				temp = temp.next;
			}
//			System.out.println(temp.value);
			newNode.next = temp.next;
			temp.next = newNode;
//			System.out.println(temp.value);
			this.length++;
		}
	}

	public void insertAtBegining(int value) {

		Node newNode = new Node(value);
		newNode.next = this.head;
		this.head = newNode;
		this.length++;
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

		SingleLinkedList_2 s = new SingleLinkedList_2();
		s.add(10);
		s.add(20);
		s.add(30);
		SingleLinkedList_2 s1 = new SingleLinkedList_2();
		s1.add(11);
		s1.add(21);
		s1.add(31);
//		s.add(40);
//		s.add(50);
//		s.get();
//		System.out.println("========");
//		s.insertInIndex(60, 2);
//		s.get();
//		System.out.println("=========");
//		s.insertAtBegining(50);
//		s.get();
//		System.out.println("=========");
//		s.insertAtEnd(60);
//		s.get();
//		System.out.println("========= Remove");
//		s.remove();
//		s.remove();
//		s.remove();
//		s.get();
//		System.out.println("========= Remove Begi");
//
//		s.removeBegining();
//		s.get();

		SingleLinkedList_2 singleLinkedList_2 = new SingleLinkedList_2();
		s.mergeKLists(new Node[] { s.head, s1.head });

	}

	public Node mergeKLists(Node[] lists) {
		if (lists.length <= 0)
			return null;
		Node results = lists[0];
		for (int i = 1; i < lists.length; i++) {
			Node temp = lists[i];
			while (temp != null) {
				Node newNode = new Node(temp.value);
				Node rTemp = results;
				while (true) {
					if (rTemp.next == null) {
						rTemp.next = newNode;
						break;
					} else if (temp.value <= rTemp.next.value) {
						newNode.next = rTemp.next;
						rTemp.next = newNode;
						break;
					}
					rTemp = rTemp.next;
				}

				temp = temp.next;
			}
		}

		System.out.println("-----------------");

		while (results != null) {
			System.out.println(results.value);
			results = results.next;
		}

		return results;
	}
}
