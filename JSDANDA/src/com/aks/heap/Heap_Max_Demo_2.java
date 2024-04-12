package com.aks.heap;

public class Heap_Max_Demo_2 {

	int[] results = null;
	int length;

	public Heap_Max_Demo_2(int length) {
		this.length = 0;
		this.results = new int[length];
	}

	public void add(int val) {
		if (this.results.length == this.length) {
			int[] temp = this.results;
			results = new int[this.length * 2];
			for (int i = 0; i < temp.length; i++) {
				results[i] = temp[i];
			}

		}

		results[this.length++] = val;
		int index = this.length - 1;
		int parentIndex = (int) Math.floor((index - 1) / 2);
		while (results[index] > results[parentIndex]) {
			int val1 = results[index];
			results[index] = results[parentIndex];
			results[parentIndex] = val1;
			index = parentIndex;
			parentIndex = (int) Math.floor((index - 1) / 2);
		}
		System.out.println("Length :: " + this.length);
	}

	public int extractMax() {
		if (this.length == 0) {
			return Integer.MIN_VALUE;
		}

		if (this.length == 1) {
			int val = this.results[0];
			this.results[0] = Integer.MIN_VALUE;
			this.length--;
			return val;
		}

		int val = this.results[0];
		results[0] = results[this.length - 1];
		results[this.length - 1] = Integer.MIN_VALUE;
		int parentIndex = 0;

		while (true) {
			int left = 2 * parentIndex + 1;
			int right = 2 * parentIndex + 2;

			if (length > left && right < length) {
				int high = results[left] > results[right] ? left : right;
				if (results[parentIndex] < results[high]) {
					int temp = results[parentIndex];
					results[parentIndex] = results[high];
					results[high] = temp;
					parentIndex = high;
				} else {
					break;
				}
			} else {
				break;
			}

		}
		this.length--;
		return val;

	}

	public void getAll() {
		for (int i = 0; i < this.length; i++) {
			System.out.println(results[i]);
		}
	}

	public static void main(String[] args) {
		Heap_Max_Demo_2 h = new Heap_Max_Demo_2(2);
		h.add(41);
		h.add(39);
		h.add(33);
		h.add(18);
		h.add(27);
		h.add(12);

		h.getAll();
		System.out.println("========");
		h.add(55);
//		System.out.println(h.length);
		h.getAll();
		h.extractMax();
		System.out.println("========");
		h.getAll();
	}
}
