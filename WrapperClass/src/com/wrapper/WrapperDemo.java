package com.wrapper;

public class WrapperDemo {
	public static void main(String[] args) {
		int i = 120;
		//Boxing--> int to Integer
		Integer Iw1 = Integer.valueOf(i);
		System.out.println(Iw1); //120
		
		//unboxing --> Integer to int
		int i1 = Iw1.intValue();
		System.out.println(i1);  //120
		
		
		//Autoboxing 
		Integer iw2 = 12;
		System.out.println(iw2);  //12
		
		//AutoUnboxing
		int i2 = iw2;
		System.out.println(i2);  //12
		
		//widening int to double
		double d1 = i2;
		
		//Autoboxing with double -->Double
		Double dw1 = 12.12;
		
		//AutoUnboxing
		double d2 = dw1;
		
		//Autoboxing and upcasting from Float to Number
		Number number1 = 12.33F;
		System.out.println("Class:"+number1.getClass().getName());
		
		//Autoboxing and upcasting from Double to Number
		Number number2 = 12.33;
		System.out.println("Class:"+number2.getClass().getName());
	}
}
