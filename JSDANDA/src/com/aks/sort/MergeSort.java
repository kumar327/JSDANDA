package com.aks.sort;

import java.util.Arrays;

public class MergeSort {

	public static int[] mergerTwoArrays(int[] arr1, int[] arr2) {

		int[] results = new int[arr1.length + arr2.length];
		int a1 = 0;
		int a2 = 0;
		for (int i = 0; i < results.length; i++) {
			if (a1 >= arr1.length) {
				results[i] = arr2[a2];
				a2++;
			} else if (a2 >= arr2.length) {
				results[i] = arr1[a1];
				a1++;
			} else if (arr1[a1] >= arr2[a2]) {
				results[i] = arr2[a2];
				a2++;
			} else {
				results[i] = arr1[a1];
				a1++;
			}
		}

//		for (int i = 0; i < results.length; i++) {
//			System.out.println(results[i]);
//		}
		return results;
	}

	public int[] mergeSort(int[] arr) {

		if (arr.length == 1)
			return arr;

		int s = (int) Math.floor(arr.length / 2);
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, s));
		int[] right = mergeSort(Arrays.copyOfRange(arr, s, arr.length));

		return mergerTwoArrays(left, right);
	}

	public static void main(String[] args) {

		int[] arr1 = { 11, 4, 55, 9, 7,1 };
		MergeSort m = new MergeSort();
		int[] results = m.mergeSort(arr1);

		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
		}
//		int[] arr1 = { 1, 4, 5, 91, 99 };
//		int[] arr2 = {};
//		mergerTwoArrays(arr1, arr2);
	}
}
