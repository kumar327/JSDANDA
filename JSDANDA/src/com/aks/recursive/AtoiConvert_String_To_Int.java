package com.aks.recursive;

import java.util.Scanner;

public class AtoiConvert_String_To_Int {

	static int re = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the String");
		String str = sc.nextLine();
		re = atoi(str);
		System.out.println("Atoi Results is :: " + re);
		sc.close();
	}

	public static int atoi(String str) {

		if (str.length() == 0)
			return re;

		re = re * 10 + (str.charAt(0) - 48);
		return atoi(str.substring(1));
	}
}
