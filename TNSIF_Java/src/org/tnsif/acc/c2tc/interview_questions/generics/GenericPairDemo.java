package org.tnsif.acc.c2tc.interview_questions.generics;

class Pair<K, V> {
	private K key;
	private V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "ID: " + key + " | Name: " + value;
	}
}

public class GenericPairDemo {
	public static void main(String[] args) {
		Pair<Integer, String> employee = new Pair<>(101, "Alice Smith");
		Pair<String, String> translation = new Pair<>("Hello", "Hola");

		System.out.println("Employee - " + employee);
		System.out.println("Translation - Key: " + translation.getKey() + " | Value: " + translation.getValue());
	}
}