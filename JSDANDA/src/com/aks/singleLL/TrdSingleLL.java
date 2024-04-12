package com.aks.singleLL;

public class TrdSingleLL {

	class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
			this.next = null;
		}
	}

	Node head;

	public TrdSingleLL() {
		this.head = null;

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
		}
	}

	public void addFirst(int val) {
		Node newNode = new Node(val);
		if (this.head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;

	}

	public void remove(int val) {
		if (this.head == null) {
			return;
		}

		Node prev = head;
		if (head.val == val) {
			head = head.next;
			return;
		}
		Node next = head.next;
		while (next != null) {
			if (next.val == val) {
				prev.next = next.next;
				break;
			}
			prev = next;
			next = next.next;
		}

	}

	public void getAll() {
		Node temp = this.head;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		TrdSingleLL t = new TrdSingleLL();
		t.add(10);
		t.add(20);
		t.add(30);
		t.getAll();
		t.addFirst(40);
		System.out.println("======== Add First");
		t.getAll();
		System.out.println("======== Remove");
		t.remove(20);
		t.getAll();
		System.out.println("======== Remove");
		t.remove(40);
		t.getAll();
		System.out.println("======== Remove");
		t.remove(10);
		t.getAll();
		System.out.println("======== Remove");
		t.remove(30);
		t.getAll();
		System.out.println("======== Remove");
		t.remove(30);
		t.getAll();
	}

}
