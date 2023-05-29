package com.account;

import java.time.LocalDate;

public class Account implements Comparable<Account>{
	private String accNo;
	private String accName;
	private LocalDate accOpenDate;
	
	public Account() {
		super();
	}

	public Account(String accNo, String accName, String accOpenDate ) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accOpenDate = LocalDate.parse(accOpenDate);
	}

	public LocalDate getAccOpenDate() {
		return accOpenDate;
	}

	public void setAccOpenDate(LocalDate accOpenDate) {
		this.accOpenDate = accOpenDate;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}
	@Override
	public int compareTo(Account o) {
		return this.accNo.compareTo(o.accNo); // ASC
		//return o.rollNo.compareTo(this.rollNo); // DSC
	}
	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals called");
		if( obj instanceof Account) {
			Account other = (Account) obj;
			return this.getAccNo() == other.getAccNo();
		} 
		return false;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", accOpenDate=" + accOpenDate + "]";
	}
	
	
}
