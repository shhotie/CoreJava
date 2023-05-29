package com.account;

import java.util.ArrayList;
import java.util.List;

public class AccountUtils {

	public static List<Account> getAccountList() {
		
		List<Account> list = new ArrayList<>();
		list.add(new SavingAccount("101","Swati", "2022-12-25", 5000.00));
		list.add(new SavingAccount("110","Shweta", "2022-12-25", 5000.00));
		list.add(new SavingAccount("102","Srushti", "2022-12-25", 5000.00));
		list.add(new FixedAccount("104","Sagar", "2022-12-25", 5000.00, 5, 2.5));
		list.add(new FixedAccount("103","Sheela", "2022-12-25", 5000.00, 6, 5.0));
		return list;
	}
}
