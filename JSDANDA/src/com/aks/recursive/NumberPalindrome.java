package com.aks.recursive;

import java.util.Scanner;

public class NumberPalindrome {

	static int re = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the possitive number");
		int num = sc.nextInt();
		palindrome(num);
		if (num == re)
			System.out.println("Palindrome ");
		else
			System.out.println("Not Palindrome");
		sc.close();

	}

	public static void palindrome(int val) {

		if (val <= 0)
			return;
		else {
			re = re * 10 + val % 10;
			palindrome(val / 10);
		}

		return;
	}
}
