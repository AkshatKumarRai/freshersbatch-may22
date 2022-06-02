package com.capgemini.exception;

import java.util.Scanner;


class MinimumAccountBalance extends Exception{
	String message;
	public MinimumAccountBalance(String message) {
		this.message=message;
	}
	@Override
	public String toString() {
		return message;
	}
}
public class Exception3 {

	static double balance=2000;
	
	public static void main(String[] args) throws MinimumAccountBalance {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to withdrawn");
		int n=sc.nextInt();
		try {
			if(balance<n) {
				throw new MinimumAccountBalance("InsufficientBalanceException " +balance);
			}
			if(n<0) {
				throw new MinimumAccountBalance("IllegalBankTransactionException");
			}
			else {
				System.out.println("Please collect your money!");
			}
		}
		catch(MinimumAccountBalance mab) {
			mab.printStackTrace();
		}
		
	}

}
