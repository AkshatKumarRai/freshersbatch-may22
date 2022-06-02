package com.capgemini.oops;

public class Bank {
	int totalAmount;
	String AccountHolder;
	int AccountNumber;
	
	public void account(int totalAmount,String AccountHolder, int AccountNumber) {
		this.totalAmount=totalAmount;

		this.AccountHolder=AccountHolder;
        this.AccountNumber=AccountNumber;	
	}
	
	public int amount(int cash) {
		return this.totalAmount=cash;
	}
}

