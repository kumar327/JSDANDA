package com.aks.recursive;

import java.util.Scanner;

public class Fibanoic_Nth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the possitive number");
		int num = sc.nextInt();
		System.out.println("Fibanoci Service Results is :: " + fib(num));
		sc.close();
		System.out.println("Completed");
	}

	private static int fib(int n) {

		if (n == 1 || n == 0) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}
}
