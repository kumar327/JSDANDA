package com.aks.recursive;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibanoic_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the possitive number");
		int num = sc.nextInt();
		System.out.println(System.currentTimeMillis());
		System.out.println("Fibanoci Service Results is :: " + fib(num));
		sc.close();
		System.out.println(System.currentTimeMillis());
		System.out.println("Completed");
	}

	static Map<Integer, Integer> map = new HashMap<>();

	private static int fib(int num) {

//		if (map.get(num) != null) {
//			return map.get(num);
//		} else {
//			map.put(num, map.get);
//		}
		if (num < 2) {
			map.put(num, num);
			return num;
		}

		return fib(num - 1) + fib(num - 2);
	}

}
