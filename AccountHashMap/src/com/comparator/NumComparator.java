package com.comparator;

import java.util.Comparator;

import com.account.Account;

public class NumComparator implements Comparator<Account>{
	@Override
	public int compare(Account o1, Account o2) {
		return o2.getAccName().compareTo(o1.getAccName());
	}

}
