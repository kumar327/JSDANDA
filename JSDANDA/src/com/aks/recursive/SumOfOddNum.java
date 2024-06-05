package com.aks.recursive;

public class SumOfOddNum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 4, 5, 6, 7, 4 };
		int sum = sumOfOddNumber(arr, 0);

		System.out.println("Number Of Times :: " + sum);
	}

	private static int sumOfOddNumber(int[] arr, int index) {

		if (arr.length == index) {
			return 0;
		}
		int sum = sumOfOddNumber(arr, index + 1);
		if (arr[index] % 2 != 0) {
			sum += arr[index];
		}

		return sum;
	}
}
