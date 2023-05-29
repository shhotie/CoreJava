package com.account;

import java.time.LocalDate;

public class FixedAccount extends Account {
	private double amount;
	private double time;
	private double rateOfInterest;
	private static int count = 0;
	
	public FixedAccount() {
		super();
	}
	
	public FixedAccount( String accName, String accOpenDate, double amount, double time, double rateOfInterest) {
		
		this.setAccName(accName);
		this.setAccOpenDate(LocalDate.parse(accOpenDate));
		this.amount = amount;
		this.time = time;
		this.rateOfInterest = rateOfInterest;
	}




	public Double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	
	
	
	public static int getCounter() {

		return count;
	}
	@Override
	public String toString() {
		return "FixedAccount"+super.toString() + "[amount=" + amount + ", time=" + time + ", rateOfInterest=" + rateOfInterest + "]";
	}
	
	

}
