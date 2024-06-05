package com.aks.recursive;

public class NumberOfTimesInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 4, 5, 6, 7, 4 };
		int count = noOfTimeOccure(arr, 40, 0);

		System.out.println("Number Of Times :: " + count);
	}

	private static int noOfTimeOccure(int[] arr, int num, int index) {

		if (arr.length == index) {
			return 0;
		}
		if (arr[index] == num)
			return 1 + noOfTimeOccure(arr, num, index + 1);
		else
			return noOfTimeOccure(arr, num, index + 1);
	}
}
