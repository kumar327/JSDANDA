package com.aks.hash;

import java.util.HashMap;

public class HashDemo {

	int PRIMARY_KEY = 31;

	int DEFAULT_SIZE = 11;

	Object[] results = null;

	public HashDemo() {
		results = new Object[DEFAULT_SIZE];
	}

	public int hashCode(String key) {

		int results = 0;

		for (int i = 0; i < Math.min(key.length(), 50); i++) {
			results = (results + key.charAt(i) + PRIMARY_KEY) % DEFAULT_SIZE;

		}
		return results;
	}

	public void put(String key, String value) {

		int index = hashCode(key);
		Node<String, String> newNode = new Node<>(key, value);
		if (results[index] != null) {
			System.out.println("Already Exists");
		} else {
			results[index] = newNode;
		}

	}

	public String get(String key) {

		int index = hashCode(key);

		Node<String, String> temp = (Node<String, String>) results[index];
		return "{ " + temp.key + "= " + temp.value + "}";
	}

	public static void main(String[] args) {

		HashDemo h = new HashDemo();
		h.put("ku", "ass");
		h.put("ku", "ass");
		h.put("kus", "sss");
		System.out.println(h.get("kuuu"));

	}
}

class Node<K, V> {

	String key;
	String value;
	Node<String, String> next;

	public Node(String key, String value) {
		this.key = key;
		this.value = value;

	}
}