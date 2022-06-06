package io.capgemini.junit;

public class Account {

	 private int balance;

	    public Account() {
	       
	        balance = 0;
	    }

	    public Account(int bal) {
	        
	        this.balance = bal;
	    }


	    public int getBalance() {
	        return balance;
	    }

	    public void setBalance(int bal) {
	        this.balance = bal;
	    }

	    public void withdraw(int amt) throws InsufficientFundsException {
	        if(amt <= balance) {
	            balance -= amt;
	        }
	        else {
	            int newBalance = amt - balance;
	            throw new InsufficientFundsException(newBalance);
	        }

	    }

	    public void deposit(int amt) {
	        this.balance += amt;
	    }

}
