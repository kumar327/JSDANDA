package com.aks.recursive;

public class Max_Num_In_Array {

	public static void main(String[] args) {
		int[] arr = { 1, 21, 3, 4, 4, 5, 6, 7, 4 };
		int max = maxNumber(arr, Integer.MIN_VALUE, 0);

		System.out.println("Number Of Times :: " + max);
	}

	private static int maxNumber(int[] arr, int max, int index) {

		if (arr.length == index) {
			return max;
		}

		max = Math.max(max, arr[index]);
		return maxNumber(arr, max, index + 1);
	}
}
