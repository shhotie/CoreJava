package com.exercise2;

public class ExceptionHandling {

	public static void main(String[] args) {

		int []someNumber = {1,2,3,4};
		int key = 2;
		 process(someNumber, key);
				
	}

	private static void process(int[] someNumber, int key) {

		for (int i : someNumber) {
			System.out.println(i + key);
		}
	}

}
