package com.aks.singleLL;

public class ReverseSL {

	class Node {

		int val;
		Node next;

		public Node(int val) {
			this.val = val;
			this.next = null;
		}
	}

	int length;
	Node head;

	public ReverseSL() {
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
			temp = newNode;
		}
		this.length++;
	}

	public void getAll() {

		Node temp = this.head;
		if (temp == null) {
			System.out.println("List Is Empty");
		} else {
			while (temp != null) {
				System.out.println(temp.val);
				temp = temp.next;
			}
		}
	}

	public void reverse() {

		// One way of Doing it
//		Node reverse = null;
//		int le = this.length;
//		while (le > 0) {
//			Node temp = this.head;
//			int i = 1;
//			while (le > i) {
//				temp = temp.next;
//				i++;
//			}
//			Node nN = new Node(temp.val);
//			if (reverse == null) {
//				reverse = nN;
//			} else {
//				Node t2 = reverse;
//				while (t2.next != null) {
//					t2 = t2.next;
//				}
//				t2.next = nN;
//				t2 = nN;
//
//			}
//			le--;
//
//		}
//		this.head = reverse;

		// second way is

//		Node prev = null;
//		Node curr = this.head;
//		Node next = null;
//		while (curr != null) {
//			next = curr.next;
//			curr.next = prev;
//			prev = curr;
//			curr = next;
//		}
//		this.head = prev;

		Node rev = reverseByRecurssion(this.head);
		this.head = rev;

	}

	public Node reverseByRecurssion(Node head) {

		if (head == null || head.next == null) {
			return head;
		}

		Node newHead = reverseByRecurssion(head.next);

		head.next.next = head;
		head.next = null;
		return newHead;

	}

	public boolean isPalindrome() {
		Node temp = head;
		Node prev = null;
		Node curr = head;
		Node next = null;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		while (prev != null && temp != null) {
			System.out.println("Prev " + prev.val);
			System.out.println("head " + temp.val);
			if (prev.val != temp.val) {
				return false;
			}
			prev = prev.next;
			temp = temp.next;
			System.out.println("Prev1 " + prev);
			System.out.println("head1 " + temp);
		}
		return true;
	}

	public static void main(String[] args) {
		ReverseSL r = new ReverseSL();

		r.add(10);
		r.add(20);
		r.add(30);
		r.add(40);
////		r.add(50);
		r.getAll();
//		r.getAll();
//		System.out.println("Length :: " + r.length);
		r.reverse();
		System.out.println("Reverse");
		r.getAll();

//		System.out.println(r.isPalindrome());
	}
}
