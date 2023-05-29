package com.account.tester;

import com.account.*;
import com.comparator.BalanceComparator;
import com.comparator.DateComparator;
import com.comparator.NumComparator;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AccountTester {

	public static void main(String[] args) {
		List<Account> accList = AccountUtils.getAccountList();

		Scanner sc = new Scanner(System.in);
		//List<Account> accList = new ArrayList <Account>();
		int choice = 0;
		System.out.println("please Enter your choice");

		do {
			System.out.println("1. To create Saving Account"
					+ "\n2. To create Fixed Account"
					+ "\n3. Display All Account Content"
					+ "\n4. Accept Account No and Display Details"
					+ "\n5. Accept Account No for Fund Transfer in Saving Account"
					+ "\n6. Accept Account No and Remove Account"
					+ "\n7. Apply interest on Saving Account"
					+ "\n8. Sort Account no as per Ascending Order"
					+ "\n9. Sort account as per Descending Order"
					+ "\n10. Sort by Account Opening Date"
					+ "\n11. Sort by Balance"
					+ "\n0. Exit");
			choice = sc.nextInt();

			switch(choice) {
			case 1:
			{
				System.out.println("Enter the accNo, accName,Opening account date, currentBalance");
				Account sa = new SavingAccount(sc.next(), sc.next(), sc.next(), sc.nextDouble());
				accList.add(sa);
				System.out.println("Saving Account Added successfully");
			}
			break;
			case 2:
			{
				System.out.println("Enter the accNo, accName, account opening date, amount, time, rate of Interest");
				Account fa = new FixedAccount(sc.next(), sc.next(), sc.next(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
				accList.add(fa);
				System.out.println("Fixed Account Added successfully");
			}
			break;
			case 3:
				System.out.println("Display all content in acclist");
				for(Account account: accList) {
					System.out.println(account);
				}
				break;
			case 4:
				System.out.println("Enter the account no to be displayed");
				String accNo = sc.next();
				for(Account account: accList) {
					if(account.getAccNo().equals(accNo)) {
						System.out.println(account);
					}
				}
				break;

			case 5:
				System.out.println("Enter acc no for fund transfer in Saving Account");
				String accNo1 = sc.next();
				System.out.println("Enter the amount to be added");
				double amt = sc.nextDouble();
				for(Account account : accList) {
					if(account.getAccNo().equals(accNo1)) {
						if (account instanceof SavingAccount) {
							SavingAccount sa = (SavingAccount)account;
							sa.setCurrentBalance(sa.getCurrentBalance()+amt);
							System.out.println("Saving Account Total Balance : "+sa.getCurrentBalance());
						}
					}
				}
				break;

			case 6:
				System.out.println("Enter the account no to remove it");
				String accNo2 = sc.next();
				for(int i = 0; i<accList.size();i++) {
					if(accList.get(i).getAccNo().equals(accNo2)) {
						Account acc = accList.get(i);
						accList.remove(acc);
						System.out.println("Account Removed");
						break;
					}
				}
				break;

			case 7:
				System.out.println("Enter Saving Account");
				String accNo3 = sc.next();
				for(Account account : accList) {
					if(account.getAccNo().equals(accNo3)) {
						if (account instanceof SavingAccount) {
							SavingAccount sa = (SavingAccount)account;
							sa.calculateInterest();
						}
					}
				}
				
				break;
				
			case 8:
				System.out.println("Account sorted as per Ascending Order");
				Collections.sort(accList);
				System.out.println(accList);
				break;
				
			case 9:
				System.out.println("Account sorted as per Descending Order");
				Collections.sort(accList, new NumComparator());
				System.out.println(accList);
				break;
				
			case 10:
				System.out.println("Account Sorted by account opening date");
				Collections.sort(accList, new DateComparator());
				System.out.println(accList);
				break;
				
			case 11:
				System.out.println("Account sorted by balance");
				Collections.sort(accList, new BalanceComparator());
				System.out.println(accList);
				
				break;
				
			case 0:
				System.exit(0);

			}

		}while(choice != 0);
		sc.close();
	}

}
