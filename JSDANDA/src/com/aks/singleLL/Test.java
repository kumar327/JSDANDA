package com.aks.singleLL;

public class Test {

	class Node {
		Node next;
		int val;

		public Node(int val) {
			this.next = null;
			this.val = val;
		}
	}

	Node head;

	public Test() {

		this.head = null;
	}

	public void add(int val) {

		Node n = new Node(val);
		System.out.println("New Node :: " + n);
		if (this.head == null) {
			this.head = n;
		} else {
			Node temp = this.head;
			System.out.println("Temp start :: " + temp);
			while (temp.next != null) {
				temp = temp.next;
				System.out.println("While Temp :: " + temp);
			}
			temp.next = n;
			temp = n;
		}
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.add(10);
		Node temp = t.head;
		System.out.println("=================");
		t.add(20);
		System.out.println("=================");
		t.add(30);
		System.out.println("========================");
		System.out.println(t.head);
		System.out.println(t.head.next);
		System.out.println(t.head.next.next);
		System.out.println(t.head.next.next.next);
		System.out.println("Temp :::::::::::: "+temp.next.next);
		
		

	}
}
