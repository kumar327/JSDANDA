package com.aks.recursive;

import java.util.Scanner;

public class Sum_N_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the possitive number");
		int num = sc.nextInt();
		System.out.println("Sum Results is :: " + sum(num));
		sc.close();
		System.out.println("Completed");
	}

	public static int sum(int val) {

		if (val == 1)
			return 1;

		return val + sum(val - 1);
	}
}
