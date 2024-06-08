package com.aks.backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubArrays {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };

		List<List<Integer>> re = new ArrayList<>();
		backtracking(arr, re, new ArrayList<>(), 0);
		System.out.println(re);
	}

	private static void backtracking(int[] arr, List<List<Integer>> re, ArrayList<Integer> temp, int start) {
		re.add(new ArrayList<>(temp));

		for (int i = start; i < arr.length; i++) {
			temp.add(arr[i]);
			backtracking(arr, re, temp, i + 1);
			temp.remove(temp.size() - 1);
		}

	}

}
