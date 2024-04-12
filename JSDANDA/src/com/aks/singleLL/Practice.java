package com.aks.singleLL;

public class Practice {

	class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
			this.next = null;
		}
	}

	Node head;
	int length;

	public Practice() {
		this.head = null;
		this.length = 0;
	}

	public void add(int val) {
		Node newNode = new Node(val);
		if (this.head == null) {
			this.head = newNode;
		} else {
			Node temp = this.head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			temp = newNode;
		}
		this.length++;
	}

	public void addFirst(int val) {
		Node newNode = new Node(val);
		newNode.next = this.head;
		this.head = newNode;
		this.length++;
	}

	public void set(int index, int val) {
		if (index < 0 || index > this.length) {

			System.out.println("Please give correct index");
			return;
		}
		Node newNode = new Node(val);

		if (index == length) {
			add(val);
			return;
		} else if (index == 0) {

			newNode.next = this.head;
			this.head = newNode;
			return;

		} else {

			Node temp = this.head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;

			}
			Node next = temp.next;
			temp.next = newNode;
			newNode.next = next;
		}
		this.length++;
	}

	public void getAll() {
		Node temp = this.head;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;

		}
	}

	public static void main(String[] args) {
		Practice p = new Practice();
		p.add(10);
		p.add(20);
		p.add(30);
		p.getAll();
		p.addFirst(50);
		p.addFirst(60);
		System.out.println("Get ");
		p.getAll();
		p.set(6, 100);
		System.out.println("Get ");
		System.out.println("Length is :: " + p.length);
		p.getAll();

	}
}
