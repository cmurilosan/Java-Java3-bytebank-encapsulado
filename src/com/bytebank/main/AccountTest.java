package com.bytebank.main;

import com.bytebank.model.CurrentAccount;
import com.bytebank.model.SavingsAccount;

public class AccountTest {

	public static void main(String[] args) {

		CurrentAccount cc = new CurrentAccount(1122, 1);
		cc.deposit(100.0);

		SavingsAccount cp = new SavingsAccount(1122, 10);
		cp.deposit(200.0);

		cc.transfer(10.0,cp);

		System.out.println("Balance CC: " + cc.getBalance());
		System.out.println("Balance CP: " + cp.getBalance());

	}
	
}
