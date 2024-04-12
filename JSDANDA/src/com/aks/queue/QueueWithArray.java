package com.aks.queue;

public class QueueWithArray {

	int[] elementData = null;

	int length;

	int first;

	public QueueWithArray(int length) {
		this.length = 0;
		elementData = new int[length];

	}

	public void add(int value) {

		if (this.length == 0) {
			first = 0;
		}

		if (this.length == elementData.length) {
			int[] newArray = new int[2 * elementData.length];
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData = newArray;
		}

		elementData[length++] = value;
	}

	public int peek() {
		return elementData[first];
	}

	public int remove() {
		int value = elementData[first];

		elementData[first++] = 0;

		return value;
	}

	public void getAll() {
		for (int i = first; i < this.length; i++) {
			System.out.println(elementData[i]);
		}
	}

	public static void main(String[] args) {
		QueueWithArray q = new QueueWithArray(3);

		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);
		q.add(80);
		q.getAll();
		System.out.println("=========");
		q.remove();
		q.remove();
		q.getAll();
	}

}
