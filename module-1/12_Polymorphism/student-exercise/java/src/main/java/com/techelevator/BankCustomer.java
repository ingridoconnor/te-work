package com.techelevator;

import java.util.ArrayList;
import java.util.List;



public class BankCustomer {
	private String name;
	private String address;
	private String phoneNumber;
	private Accountable[] accounts;
	private List<Accountable> customers = new ArrayList<>();
	
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public Accountable[] getAccounts() {
		accounts = new Accountable[customers.size()];
		
		return customers.toArray(accounts);
	}
	public void addAccount(Accountable newAccount) {
		customers.add(newAccount);
		
		
	} 
	public boolean isVip() {
		Integer totals = 0;
		for(Accountable temp: customers) {
			totals += temp.getBalance();
		}
				return (totals >= 25000);
				
				
				
		
	}
}

