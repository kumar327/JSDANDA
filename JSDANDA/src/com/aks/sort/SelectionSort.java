package com.aks.sort;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 6, 4, 3, 9 };
		// 1,3,3,4,6,9

		// basic Sorting

		int count = 0;

//		for (int i = 0; i < arr.length; i++) {
//
//			int s = i;
//			for (int j = i + 1; j < arr.length; j++) {
//				count++;
//				if (arr[s] > arr[j])
//					s = j;
//
//			}
//
//			int temp = arr[s];
//			arr[s] = arr[i];
//			arr[i] = temp;
//		}

		for (int i = 0; i < arr.length; i++) {

			int s = i;
			for (int j = i + 1; j < arr.length; j++) {
				count++;
				if (arr[s] > arr[j])
					s = j;

			}
			if (i != s) {
				int temp = arr[s];
				arr[s] = arr[i];
				arr[i] = temp;
			}
		}

		System.out.println("Selection Sort :: Count :: " + count);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
