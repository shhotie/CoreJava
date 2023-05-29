package com.exercise3;

public class ClosureExample2 {

	public static void main(String[] args) {
		int a =10;
		int b =20;
		/*
		 * Instead of implementing anonymous class implement lambda
		 */
		doProcess(a,i-> System.out.println(i + b));
	}

	private static void doProcess(int i, Process p) {

		p.process(i);
	}
}

//interface Process{
//	void process(int i);
//}