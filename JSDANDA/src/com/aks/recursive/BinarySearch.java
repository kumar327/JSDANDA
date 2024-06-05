package com.aks.recursive;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		boolean isFound = binarySearch(arr, -1, 0, arr.length-1);
		if (isFound) {
			System.out.println("Element Found");
		} else {
			System.out.println("Element Not Found");
		}
	}

	private static boolean binarySearch(int[] arr, int num, int start, int end) {
		if (start > end) {
			return false;
		}
		int mid = (int) Math.floor((start + end) / 2);
		
		if (arr[mid] == num)
			return true;
		else if (arr[mid] > num)
			return binarySearch(arr, num, start, mid - 1);
		else
			return binarySearch(arr, num, mid + 1, end);
	}
}
