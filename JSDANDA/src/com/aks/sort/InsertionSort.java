package com.aks.sort;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 1, 6, 4, 3, 9, 8, 1 };
		// 1,3,3,4,6,9

		// basic Sorting

		int count = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				count++;

				if (arr[j - 1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else {
					break;
				}
			}
		}

		System.out.println("Insertion Sort :: Count :: " + count);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
