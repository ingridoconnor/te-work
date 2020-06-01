package com.techelevator;

public class KataFizzBuzz {
	
	private int myInt;

	public String fizzBuzz(Integer myInt) {
		this.myInt = myInt;
		if(myInt % 3 == 0 && myInt % 5 == 0) {
			return "FizzBuzz";
		}
		if (myInt % 3 == 0) {
			return "Fizz";
				
		}
		if(myInt % 5 == 0) {
			return "Buzz";
		}
		if(myInt >= 1 && myInt <= 100) {
			return myInt.toString();
		}
		
		return "";
		
		
		
	}
	

	
}

