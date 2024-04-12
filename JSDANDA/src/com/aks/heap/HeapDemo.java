package com.aks.heap;

public class HeapDemo {

	int[] heap = null;

	int length;

	int DEFAULT_SIZE = 3;

	public HeapDemo() {
		this.heap = new int[DEFAULT_SIZE];
		this.length = 0;
	}

	public void add(int val) {

		if (this.length == DEFAULT_SIZE) {
			// copy the old array to new Array
			DEFAULT_SIZE = DEFAULT_SIZE * 2;
			int[] temp = this.heap;
			this.heap = new int[DEFAULT_SIZE];
			for (int i = 0; i < temp.length; i++) {
				heap[i] = temp[i];
			}

		}

		heap[this.length++] = val;

		int index = this.length - 1;

		while (index >= 0) {
			int parentIndex = (int) Math.floor((index - 1) / 2);
			if (heap[parentIndex] >= heap[index])
				break;
			int temp = heap[parentIndex];
			heap[parentIndex] = heap[index];
			heap[index] = temp;
			index = parentIndex;
		}
	}

	public void getAll() {
		for (int i = 0; i < this.length; i++) {
			System.out.println(heap[i]);
		}
	}

	public static void main(String[] args) {
		HeapDemo h = new HeapDemo();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(50);
		h.add(60);
		h.getAll();

	}

}
