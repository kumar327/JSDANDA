package com.aks.recursive;

public class RecursionDemoWithOut {

	public static void main(String[] args) {

		message1();

	}

	public static void message1() {
		System.out.println("Message 1");
		message2();
	}

	public static void message2() {
		System.out.println("Message 2");
		message3();
	}

	public static void message3() {
		System.out.println("Message 3");
		message4();
	}

	public static void message4() {
		System.out.println("Message 4");
		message5();
	}

	public static void message5() {
		System.out.println("Message 5");
	}

}
