package com.comparator;

import java.util.Comparator;

import com.account.Account;
import com.account.FixedAccount;
import com.account.SavingAccount;

public class BalanceComparator implements Comparator<Account>{
	@Override
	public int compare(Account o1, Account o2) {
		if(o1 instanceof FixedAccount && o2 instanceof FixedAccount ) {
			FixedAccount fa1 = (FixedAccount)o1;
			FixedAccount fa2 = (FixedAccount)o2;
			return fa1.getAmount().compareTo(fa2.getAmount());
		}
		
		else if(o1 instanceof SavingAccount && o2 instanceof SavingAccount ) {
			SavingAccount sa1 = (SavingAccount)o1;
			SavingAccount sa2 = (SavingAccount)o2;
			return sa1.getCurrentBalance().compareTo(sa2.getCurrentBalance());
		}
		
		else if(o1 instanceof FixedAccount && o2 instanceof SavingAccount ) {
			FixedAccount fa1 = (FixedAccount)o1;
			SavingAccount sa2 = (SavingAccount)o2;
			return fa1.getAmount().compareTo(sa2.getCurrentBalance());
		}
		else if(o1 instanceof SavingAccount && o2 instanceof FixedAccount ) {
			SavingAccount sa1 = (SavingAccount)o1;
			FixedAccount fa2 = (FixedAccount)o2;
			return sa1.getCurrentBalance().compareTo(fa2.getAmount());
		}
		return 0;
		
	}

}
