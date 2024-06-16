package com.aks.array;

import java.util.ArrayList;
import java.util.Arrays;

public class AddOneToNumber {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 6, 0, 6, 4, 8, 8, 1));
		System.out.println(plusOne(arr));
	}

	public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		int rem = 1;
		int le = A.size() - 1;
		while (rem == 1 && le >= 0) {
			int sum = rem + A.get(le);
			if (sum > 9) {
				A.set(le, 0);
				rem = 1;
			} else {
				A.set(le, sum);
				rem = 0;
			}
			le--;
		}
		if (rem == 1) {
			ArrayList<Integer> arr = new ArrayList<>();
			arr.add(1);
			for (int i = 0; i < A.size(); i++) {
				arr.add(0);
			}
			return arr;
		} else {
			boolean isZero = true;
			int l = 0;
			while (isZero) {
				if (A.get(l) == 0) {
					A.remove(l);
				} else {
					isZero = false;
					break;
				}
				
			}
			return A;
		}
	}
}
