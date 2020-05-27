package com.techelevator;

public class CheckingAccount extends BankAccount {
	
	public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
		
		
	}
	public CheckingAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}
	
	
	
	
	@Override
	public int withdraw(int amountToWithdraw) {
		int temp = super.getBalance() - amountToWithdraw;  // set a temp variable that holds the balance  - amountTpWithdraw
		if(temp <= -100) {  // if after making the "withdrawal" there is < -100, no withdraw can be made
			return super.getBalance();
		}if (temp  <= 0  ) {  // if after mkaing the "withdrawal" we are under 0 or overdrwn
			return super.withdraw(amountToWithdraw + 10);  // charged a 10 fee
		}else {
			return super.withdraw(amountToWithdraw);  //  we have plenty of money in our account
		} 
		
		
	}
	

}
