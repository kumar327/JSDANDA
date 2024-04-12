package com.aks.recursive;

import java.util.Scanner;

public class Factorical {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the possitive number");
		int num = sc.nextInt();
		System.out.println("Factorial Results is :: " + factorical(num));
		sc.close();
	}

	public static int factorical(int val) {

		if (val == 1)
			return 1;

		return val * factorical(val - 1);
	}
}
