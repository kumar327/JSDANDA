package com.aks.heap;

import java.util.PriorityQueue;

public class PriorityQueue_1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> h = new PriorityQueue<>();
		h.add(41);
		h.add(39);
		h.add(33);
		h.add(18);
		h.add(27);
		h.add(12);
		h.add(1);
		h.add(55);
		System.out.println(h.remove());
	}
}
