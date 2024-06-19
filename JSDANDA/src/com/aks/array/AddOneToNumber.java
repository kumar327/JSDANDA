package com.aks.array;

import java.util.ArrayList;

public class AddOneToNumber {

	public static void main(String[] args) {
		int A = 105;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);

		for (int i = 2; i <= A / 2; i++) {
			if (A % i == 0) {
				int next = A / i;
//				list.add(i);
//				if (list.contains(new Integer(next))) {
//					break;
//				} else {
//					list.add(next);
//				}
			}
			System.out.println("Number of steps :: "+i);
		}
		list.add(A);
		System.out.println(list);
		System.out.println(105 / 7);
	}

}
