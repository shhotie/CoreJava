package com.account.utils;

import java.util.HashMap;
import java.util.Map;
import com.account.Account;
import com.account.FixedAccount;
import com.account.SavingAccount;

//Interface can have static methods

public interface AccountUtils {
	
	public static Map<Integer, Account> getHashMap(){
		
		Map<Integer ,Account> accHashMap = new HashMap<Integer, Account>();
		Account a1 = new SavingAccount("Swati", "2022-12-25", 5000.00);
		accHashMap.put(a1.getAccId(), a1);
		
		Account a2 = new SavingAccount("Shweta", "2022-12-25", 5000.00);
		accHashMap.put(a2.getAccId(), a2);
		
		Account a3 = new SavingAccount("Srushti", "2022-12-25", 5000.00);
		accHashMap.put(a3.getAccId() , a3);
		
		Account a4 = new FixedAccount("Sagar", "2022-12-25", 5000.00, 5, 2.5);
		accHashMap.put(a4.getAccId() , a4);
		
		Account a5 = new FixedAccount("Sheela", "2022-12-25", 5000.00, 6, 5.0);
		accHashMap.put(a5.getAccId() , a5);
		
		return accHashMap;
		
	}

}
