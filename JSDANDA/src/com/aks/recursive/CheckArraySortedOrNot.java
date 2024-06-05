package com.aks.recursive;

public class CheckArraySortedOrNot {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 4, 5, 6, 7 };
		boolean isArraySorted = isArraySorted(arr, 0, 1);

		System.out.println("isArraySorted :: " + isArraySorted);
	}

	private static boolean isArraySorted(int[] arr, int f, int s) {

		if (arr.length == s) {
			return true;
		}

		if (arr[f] > arr[s]) {
			return false;
		}

		return isArraySorted(arr, f + 1, s + 1);
	}
}
