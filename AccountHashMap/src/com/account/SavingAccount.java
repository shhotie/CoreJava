package com.account;

import java.time.LocalDate;

public class SavingAccount extends Account implements Debitable {
	public static final double MINBALANCE = 1000;
	private static final double rateOfInterest = 4.5;
	private double currentBalance;
	
	private static int counter = 0;
	
	public SavingAccount(String accName, String accOpenDate, double currentBalance) {
		this.setAccName(accName);
		this.setAccOpenDate(LocalDate.parse(accOpenDate));
		this.currentBalance = currentBalance;
		
		
	}

	public  void calculateInterest() {
		double Interest = (currentBalance * rateOfInterest *1)/100;
		System.out.println("Interest get on current balance for 1 year " +Interest);

		double amount = Interest + currentBalance;
		System.out.println("Total amount in saving Account" +amount);

		
	}

	public Double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		SavingAccount.counter = counter;
	}

	public static double getMinbalance() {
		return MINBALANCE;
	}


	@Override
	public String toString() {
		return "SavingAccount"+super.toString() +"[currentBalance=" + currentBalance + ", rateOfInterest=" + rateOfInterest + "]";
	}

	

	@Override
	public double withdraw(double amount) {
		currentBalance = currentBalance + amount;
		return currentBalance;
	}


	
}
