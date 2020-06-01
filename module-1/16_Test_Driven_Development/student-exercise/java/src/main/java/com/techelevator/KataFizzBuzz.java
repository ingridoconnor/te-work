package com.techelevator;

public class KataFizzBuzz {
	
	private int myInt;

	public String fizzBuzz(int myInt) {
		this.myInt = myInt;
		if (myInt % 3 == 0) {
			return "Fizz";
				
		}
		if(myInt % 5 == 0) {
			return "Buzz";
		}
		
		return "";
		
		
		
	}
	

	
}

