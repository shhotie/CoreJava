package com.comparator;

import java.util.Comparator;

import com.account.Account;

public class DateComparator implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		return o1.getAccOpenDate().compareTo(o2.getAccOpenDate());
	}

}

