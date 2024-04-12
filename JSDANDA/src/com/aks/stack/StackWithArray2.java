package com.aks.stack;

public class StackWithArray2 {

	int[] stack = null;
	int length;
	int DEFAULT_SIZE = 3;

	public StackWithArray2() {
		this.stack = new int[DEFAULT_SIZE];
		this.length = 0;
	}

	public void push(int val) {
		if (this.length == DEFAULT_SIZE) {
			DEFAULT_SIZE = DEFAULT_SIZE * 2;
			System.out.println("If Loop");
			int[] temp = stack;
			stack = new int[DEFAULT_SIZE];
			for (int i = 0; i < this.length; i++) {
				stack[i] = temp[i];
			}
		}
		stack[this.length++] = val;
	}

	public int peek() {

		return stack[this.length - 1];
	}

	public int pop() {

		if (this.length < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int top = peek();
		stack[--this.length] = 0;
		return top;
	}

	public void getAll() {
		for (int i = this.length - 1; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}

	public static void main(String[] args) {
		StackWithArray2 s = new StackWithArray2();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.getAll();
		System.out.println("Peek :: " + s.peek());
		s.getAll();
		System.out.println("Pop :: " + s.pop());
		System.out.println("Peek :: " + s.peek());
		s.getAll();
	}
}
