package com.aks.recursive;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the String");
		String str = sc.nextLine();
		System.out.println("Reverse Results is :: " + reverse(str));
		sc.close();
	}

	public static String reverse(String str) {

		if (str.length() == 0)
			return "";

		return reverse(str.substring(1)) + str.charAt(0);
	}
}
