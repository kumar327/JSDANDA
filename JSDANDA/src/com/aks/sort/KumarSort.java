package com.aks.sort;

public class KumarSort {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 6, 4, 3, 9 };
		// 1,3,3,4,6,9

		for (int i = 0; i < arr.length; i++) {
			int s = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[s] > arr[j]) {
					s = j;

				}
			}
			System.out.println("::" + s);
			int temp = arr[i];
			arr[i] = arr[s];
			arr[s] = temp;

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
