package com.aks.recursive;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the possitive number 1");
		int n1 = sc.nextInt();

		System.out.println("Please Enter the possitive number 2");
		int n2 = sc.nextInt();

		int results = gcd(n1, n2);
		System.out.println("GCD For :: " + n1 + " Second :: " + n2 + " :: is ::" + results);
		sc.close();

	}

	private static int gcd(int n1, int n2) {

		if (n2 == 0) {
			return n1;
		}
		int rem = n1 % n2;
		return gcd(n2, rem);
	}
}
