package com.aks.stack;

//import java.util.Iterator;
import java.util.NoSuchElementException;
//import java.util.Stack;

public class StackWithArray {

	int[] arr = null;

	int DEFAULT_SIZE = 10;

	int top;

	public StackWithArray() {
		arr = new int[DEFAULT_SIZE];

		this.top = 0;
	}

	public void push(int value) {
		if (top == DEFAULT_SIZE) {
			DEFAULT_SIZE = DEFAULT_SIZE * 2;
			int[] oldArr = arr;
			arr = new int[DEFAULT_SIZE];
			for (int i = 0; i < oldArr.length; i++) {
				arr[i] = oldArr[i];
			}

		}
		arr[top++] = value;
	}

	public int pop() {

		int val = peek();
		if (top == 0) {
			throw new NoSuchElementException();
		}
		arr[--top] = 0;
		return val;
	}

	public int peek() {

		return arr[top - 1];
	}

	public void getAll() {
		for (int i = top - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		StackWithArray s = new StackWithArray();
//		s.push(10);
//		s.push(20);
//		s.push(30);
//		s.getAll();
//		System.out.println("Peek ::" + s.peek());
//		System.out.println("POP ::" + s.pop());
//		s.getAll();
		System.out.println(s.arr[1]);

//		Stack<Integer> s = new Stack<>();
//		s.push(10);
//		s.push(20);
//		s.push(30);
//		s.push(40);
//		s.push(50);
//		System.out.println(s);
//		s.pop();
	}

}
