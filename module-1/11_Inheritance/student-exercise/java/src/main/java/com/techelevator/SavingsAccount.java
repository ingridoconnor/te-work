package com.techelevator;

public class SavingsAccount extends BankAccount{
	
	public SavingsAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}
		
		public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
			super(accountHolderName, accountNumber, balance);
	}
		
		@Override
		public int withdraw (int amountToWithdraw) {
			int temp = super.getBalance() - amountToWithdraw;
			int fee = 0;
			if (temp < 150 && temp >= 0) {
				fee = 2;
			}if (amountToWithdraw + fee <= getBalance()) {
				return super.withdraw(amountToWithdraw + fee);
			}else {
				return getBalance();
			}
			
//			if(temp < 150) {
//				return super.withdraw(amountToWithdraw + 2);
//			}if (temp > super.getBalance()) {
//				return  super.getBalance();
//			}else { 
//				return super.withdraw(amountToWithdraw);
//			}
		}
	

}
