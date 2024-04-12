package com.aks.sort;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 6, 4, 3, 9 };
		// 1,3,3,4,6,9

		// basic Sorting

		int count = 0;

//		for (int i = 0; i < arr.length; i++) {
//
//			for (int j = 0; j < arr.length - 1; j++) {
//				count++;
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}

		// littile Optimizing Sorting
//		for (int i = arr.length - 1; i >= 0; i--) {
//
//			for (int j = 0; j < i; j++) {
//				count++;
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}

		// littile Optimizing Sorting near sort fullly oprimized
		for (int i = arr.length - 1; i >= 0; i--) {
			boolean noSwap = true;
			for (int j = 0; j < i; j++) {
				count++;
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					noSwap = false;

				}
			}

			if (noSwap)
				break;
		}
		System.out.println("Bubule Sort :: Count :: " + count);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
