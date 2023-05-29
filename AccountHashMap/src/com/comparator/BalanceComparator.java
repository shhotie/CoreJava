package com.comparator;

import java.util.Comparator;

import com.account.Account;

public class BalanceComparator implements Comparator<Account>{
	@Override
	public int compare(Account o1, Account o2) {
		return o1.getAccName().compareTo(o2.getAccName());
	}

}
