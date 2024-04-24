package com.aks.recursive;

import java.util.Scanner;

public class Fibanoic_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the possitive number");
		int num = sc.nextInt();
		System.out.println("Fibanoci Service Results is :: " + fib(num));
		sc.close();
		System.out.println("Completed");
	}

	private static int fib(int num) {

		if (num < 2) {
			return num;
		}

		return fib(num - 1) + fib(num - 2);
	}

}
