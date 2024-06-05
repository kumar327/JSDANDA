package com.aks.recursive;

import java.util.ArrayList;
import java.util.List;

public class SubSetRecursion {

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		backtrack(nums, 0, new ArrayList<>(), result);
		return result;
	}

	private static void backtrack(int[] nums, int start, List<Integer> path, List<List<Integer>> result) {
		result.add(new ArrayList<>(path));
		for (int i = start; i < nums.length; i++) {
			path.add(nums[i]);
			backtrack(nums, i + 1, path, result);
			path.remove(path.size() - 1);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		List<List<Integer>> re = subsets(arr);
		System.out.println(re);
	}
}
