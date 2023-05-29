package com.account;

import java.time.LocalDate;

public class Account {
	private int accId;
	private String accName;
	private LocalDate accOpenDate;
	
	private static int ACC_ID_START = 100;
	
	public Account() {
		this.accId = ACC_ID_START++;
	}

	public Account(int accId, String accNo, String accName, LocalDate accOpenDate) {
		this.accId = ACC_ID_START++;
		this.accName = accName;
		this.accOpenDate = accOpenDate;
	}

	public LocalDate getAccOpenDate() {
		return accOpenDate;
	}

	public void setAccOpenDate(LocalDate accOpenDate) {
		this.accOpenDate = accOpenDate;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}
		
	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}


	public static int getACC_ID_START() {
		return ACC_ID_START;
	}


	public static void setACC_ID_START(int aCC_ID_START) {
		ACC_ID_START = aCC_ID_START;
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accName=" + accName + ", accOpenDate=" + accOpenDate
				+ "]";
	}


	
	
}
