package com.exercise2;

import java.util.function.BiConsumer;

public class ExceptionHandling5 {

	public static void main(String[] args) {

		int []someNumber = {1,2,3,4};
		int key = 0;
		System.out.println("Division");
		process(someNumber, key,(v,k)->System.out.println(v/k));
	}


	private static void process(int[] someNumber, int key, BiConsumer<Integer, Integer> consumer) {

		for (int i : someNumber) {
			consumer.accept(i, key);
		}
	}
}

