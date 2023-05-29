package com.exercise2;

import java.util.function.BiConsumer;

public class ExceptionHandling3 {

	public static void main(String[] args) {

		int []someNumber = {1,2,3,4};
		int key = 2;
		 System.out.println("Division");
		 process(someNumber, key,(v,k)-> System.out.println(v/k));
				
	}

	private static void process(int[] someNumber, int key, BiConsumer<Integer, Integer> consumer) {

		try {
			for (int i : someNumber) {
				consumer.accept(i, key);
			}
		}catch(ArithmeticException e) {
			/*
			 * as consumer can be any process hence
			 * it will need more catch block to get the condition done
			 * hence in appropriate
			 */
		}
		
	}

}
