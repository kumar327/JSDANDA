package com.aks.recursive;

public class RecusrrionPrint5 {

	public static void main(String[] args) {
		pirnt(1);
	}

	public static void pirnt(int n) {
		if (n == 6)
			return;
		System.out.println(n);
		pirnt(n + 1);
	}
}
