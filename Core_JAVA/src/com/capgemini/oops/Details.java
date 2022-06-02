package com.capgemini.oops;

import java.util.Scanner;

public class Details {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      CurrentAccount ca=new CurrentAccount();
	      SavingsAccount sa = new SavingsAccount();
	      
	      System.out.println("Enter fixed Deposit Amount ");
	      int fa = sc.nextInt();
	      System.out.println("Enter cash credit amount");
	      int cc = sc.nextInt();
	      
	      int fixedDeposit= sa.amount(fa);
	      int cashCredit = ca.amount(cc);
	      
	      int totalCash = fixedDeposit+cashCredit;
	      System.out.println("Total cash in Bank : "+totalCash);
	      
	}
}
