package com.capgemini.oops;

public class SavingsAccount extends Bank {
	String savingsAccountHolder;
	String savingsAccountNumber;
	

	public void account(int totalAmount,String AccountHolder, int AccountNumber) {
		super.account(totalAmount,AccountHolder,AccountNumber);
	}
	
	public int amount(int fixedDeposit) {
		 return super.amount(fixedDeposit);
	}
}
