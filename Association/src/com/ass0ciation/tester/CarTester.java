package com.ass0ciation.tester;

import com.association.Car;
import com.association.Driver;

public class CarTester {

	public static void main(String[] args) {
		
		//create driver object
		Driver driver1 = new Driver("Musa",38);
		Driver driver2 = new Driver("Lisa",18);
		Driver driver3 = new Driver("Disa",40);
		
		//create object of car
		Car car1 = new Car("Mercedese Benz GLB",2020, driver1);
		Car car2 = new Car("BMW X6",2020, driver2);
		Car car3 = new Car("Mercedese Benz GLB",2020, driver3);
		
		System.out.println(car1.toString());
		System.out.println(car2.toString());
		System.out.println(car3.toString());
	}
}
