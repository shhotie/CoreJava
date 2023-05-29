package com.association;

public class Car {
	 
	private String make;
	private int year;
	private Driver driver; //driver is associated with the car
	
	// default constructor
	public Car() {
		this.make = "";
		this.year = 0;
		this.driver = null;
	}

	//Overloaded constructor
	public Car(String make, int year, Driver driver) {
		
		this.make = make;
		this.year = year;
		this.driver = driver;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", year=" + year + ", driver=" + driver + "]";
	}
	
	
	
}
