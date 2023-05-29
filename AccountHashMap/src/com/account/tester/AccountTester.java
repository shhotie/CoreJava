package com.account.tester;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import com.account.Account;
import com.account.FixedAccount;
import com.account.SavingAccount;
import com.account.utils.AccountUtils;

public class AccountTester {

	public static void main(String[] args) {
		Map<Integer, Account> accHashMap = AccountUtils.getHashMap();

		Scanner sc = new Scanner(System.in);

		int choice = 0;
		System.out.println("please Enter your choice");

		do {
			System.out.println("1. To create Saving Account"
					+ "\n2. To create Fixed Account"
					+ "\n3. Display All Account Content"
					+ "\n4. Accept Account id and Display Details"
					+ "\n5. Accept Account id for deposite in Saving Account"
					+ "\n6. Accept Account id and Remove Account"
					+ "\n7. Apply interest on Saving Account"
					+ "\n8. Sort name of customer as per Ascending Order"
					+ "\n9. Withdraw amount in Saving Account"
					+ "\n10. Change name of customer with supplying empid"
					+ "\n11. change name of customer using accNo"
					+ "\n0. Exit");
			choice = sc.nextInt();

			switch(choice) {
			case 1:
			{
				System.out.println("Enter the accNo, accName,Opening account date, currentBalance");
				Account sa = new SavingAccount(sc.next(), sc.next(), sc.nextDouble());
				accHashMap.put(sa.getAccId(),sa);
				System.out.println("Saving Account Added successfully");
			}
			break;
			case 2:
			{
				System.out.println("Enter the accNo, accName, account opening date, amount, time, rate of Interest");
				Account fa = new FixedAccount(sc.next(), sc.next(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
				accHashMap.put(1,fa);
				System.out.println("Fixed Account Added successfully");
			}
			break;
			case 3:
				System.out.println("Display all content in acclist");
				System.out.println(accHashMap);
				break;

			case 4:
				System.out.println("Enter the account id to be displayed");
				int accId = sc.nextInt();
				Account a1 = accHashMap.get(accId);
				Set<Integer> keyset = accHashMap.keySet();
				for(Integer id: keyset) {
					if(	accHashMap.get(id) == a1) {
						System.out.println(a1);
					}
				}
				break;

			case 5:
				System.out.println("Enter acc id to deposit amount in Saving Account");
				int accId1 = sc.nextInt();
				System.out.println("Enter the amount to be added");
				double amt = sc.nextDouble();
				keyset = accHashMap.keySet();
				for(Integer id: keyset) {
					if(id==accId1) {
						Account account = accHashMap.get(id);
						if( account instanceof SavingAccount) {
							SavingAccount sa = (SavingAccount)account;
							sa.setCurrentBalance(sa.getCurrentBalance()+amt);
							System.out.println("Saving Account Total balance is : "+ sa.getCurrentBalance());
						}
					}
				}

				break;

			case 6:
				System.out.println(accHashMap);
				System.out.println("Enter the account id to remove it");
				int accId2 = sc.nextInt();
				accHashMap.remove(accId2);
				System.out.println(accHashMap);
				break;

			case 7:
				System.out.println("Enter Saving Account Id");
				int accId3 = sc.nextInt();
				keyset = accHashMap.keySet();
				for(Integer id1 : keyset) {
					if(id1 == accId3) {
						Account account1 = accHashMap.get(id1);
						if (account1 instanceof SavingAccount) {
							SavingAccount sa = (SavingAccount)account1;
							sa.calculateInterest();
						}
					}
				}

			case 8:
				System.out.println("Name of customers sorted as per Ascending Order");
				Comparator<Account> byName = (Account o1, Account o2)-> o1.getAccName().compareTo(o2.getAccName());
				List<Account> accounts = accHashMap.values().stream().collect(Collectors.toList());
				Collections.sort(accounts, byName);
				System.out.println(accounts);
				break;

			case 9:
				System.out.println("Enter Saving Account Id");
				int accId5 = sc.nextInt();
				System.out.println("Enter the amount to be added");
				double amt1 = sc.nextDouble();
				keyset = accHashMap.keySet();
				for(Integer id1 : keyset) {
					if(id1 == accId5) {
						Account account1 = accHashMap.get(id1);
						if (account1 instanceof SavingAccount) {
							SavingAccount sa = (SavingAccount)account1;
							sa.withdraw(amt1);

						}
					}
				}

				break;

			case 10:
				System.out.println("Enter Customer id:");
				int accId4 = sc.nextInt();
				System.out.println("Please Enter the name");
				String accName = sc.next();
				Account a2 = accHashMap.get(accId4);
				a2.setAccName(accName);
				System.out.println(a2);

				break;

			case 11:
				System.out.println("Enter the customer account name");
				String accName1 = sc.next();
				Collection<Account> values = accHashMap.values();
				for(Account account : values) {
					if(account.getAccName().equals(accName1)) {
						System.out.println(account);
					}
				}

				break;

			case 0:
				System.exit(0);

			}

		}while(choice != 0);
		sc.close();
	}

}
