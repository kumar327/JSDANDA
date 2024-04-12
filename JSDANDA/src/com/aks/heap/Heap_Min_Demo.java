package com.aks.heap;

public class Heap_Min_Demo {

	int[] results = null;
	int size;

	public Heap_Min_Demo(int length) {
		this.results = new int[length];
		this.size = 0;
	}

	public void add(int val) {

		if (this.results.length == this.size) {
			int[] temp = this.results;
			results = new int[this.size * 2];
			for (int i = 0; i < temp.length; i++) {
				results[i] = temp[i];
			}

		}

		results[size++] = val;

		int index = size - 1;
		int parentIndex = (int) Math.floor((index - 1) / 2);
		while (results[parentIndex] > results[index]) {
			int temp = results[parentIndex];
			results[parentIndex] = results[index];
			results[index] = temp;
			index = parentIndex;
			parentIndex = (int) Math.floor((index - 1) / 2);

		}

	}

	public void getAll() {
		for (int i = 0; i < this.size; i++) {
			System.out.println(results[i]);
		}
	}

	public static void main(String[] args) {
		Heap_Min_Demo h = new Heap_Min_Demo(2);
		h.add(41);
		h.add(39);
		h.add(33);
		h.add(18);
		h.add(27);
		h.add(12);
		h.add(1);
		h.add(55);
//		h.getAll();
		System.out.println("========");

		h.getAll();
		h.extractMin();
		System.out.println("========");
		h.getAll();
		h.add(11);
		h.add(5);
		System.out.println("========");
		h.getAll();
	}

	private int extractMin() {

		if (this.size == 0) {
			return Integer.MIN_VALUE;
		} else if (this.size == 1) {
			int val = results[0];
			results[0] = Integer.MIN_VALUE;
			return val;
		}
		int val = results[0];
		results[0] = results[size - 1];
		results[size - 1] = Integer.MIN_VALUE;
		int index = 0;
		while (true) {
			int left = 2 * index + 1;
			int right = 2 * index + 2;
			if (left < size && right < size) {
				int low = results[left] < results[right] ? left : right;
				if (results[low] < results[index]) {
					int temp = results[low];
					results[low] = results[index];
					results[index] = temp;
					index = low;
				} else {
					break;
				}
			} else {
				break;
			}

		}
		this.size--;
		return val;

	}
}
