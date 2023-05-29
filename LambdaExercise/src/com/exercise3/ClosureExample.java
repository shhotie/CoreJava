package com.exercise3;

public class ClosureExample {

	public static void main(String[] args) {
		int a =10;
		int b =20;
		/*
		 * In Java 7 you need to write final int b = 20; so its value could not be changed
		 * but from you need not it in Java 8
		 * but you can't change the value if does compiler gives you error
		 */
		doProcess(a, new Process() {
			@Override
			public void process(int i) {
				System.out.println(i+b);
			}
		});
	}

	private static void doProcess(int i, Process p) {

		p.process(i);
	}
}

interface Process{
	void process(int i);
}