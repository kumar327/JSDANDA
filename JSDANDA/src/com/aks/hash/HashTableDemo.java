package com.aks.hash;

public class HashTableDemo<K, V> {

	class Node<K, V> {

		String key;
		String value;
		Node<K, V> next;

		public Node(String key, String value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public String toString() {
			return "{key=" + key + ", value=" + value + "}";
		}

	}

	Object[] keyMap = null;
	int DEFAULT_SIZE = 20;
	int length;

	public HashTableDemo() {
		this.keyMap = new Object[DEFAULT_SIZE];
		this.length = 0;
	}

	public int getHashCode(String key, int length) {

		int total = 0;

		int PRIME_NUMBER = 31;

		for (int i = 0; i < length; i++) {
			int value = (int) key.charAt(i) - 96;
			total = (total * PRIME_NUMBER + value) % DEFAULT_SIZE;

		}

		return total;
	}

	public void put(String key, String value) {

		int index = getHashCode(key, key.length());
		System.out.println("key :: " + key + "  Hash Code:  " + index);
		Node newNode = new Node(key, value);
		if (keyMap[index] != null) {
			Node temp = (Node) keyMap[index];
			if (temp.key.equals(key)) {
				System.out.println("Key already there");
				return;
			}
			while (temp.next != null) {
				if (temp.key.equals(key))
					return;
				temp = temp.next;
			}
			temp.next = newNode;

		} else {
			keyMap[index] = newNode;

		}
		length++;

	}

	public void get(String key) {
		int index = getHashCode(key, key.length());
		Node temp = (Node) keyMap[index];
		while (temp != null) {
			if (temp.key.equals(key)) {
				System.out.println(temp);
				return;
			}
			temp = temp.next;
		}

		System.out.println("Key Not Found");

	}

	public static void main(String[] args) {
		HashTableDemo h = new HashTableDemo();
		h.put("hello", "Key");
		h.put("llo", "Key");
		h.put("llo", "Key");
		h.put("llo1", "Key");
		System.out.println(h.length);
		h.get("llo1");

	}

}
