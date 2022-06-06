package io.capgemini.junit;

public class BankTest {

	public static void main (String args[]) throws InsufficientFundsException {
       
        Account acct = new Account(19000);
        System.out.println("Current balance : " + acct.getBalance());
        System.out.println("Withdrawing 20000");
        acct.withdraw(20000);
}
}
