package com.techelevator;

public class KataFizzBuzz {
	
	private int myInt;

	public String fizzBuzz(Integer myInt) {
		String number = Integer.toString(myInt);
		this.myInt = myInt;
		if (myInt < 1 || myInt > 100) {
			return "";
		}
		if(myInt % 3 == 0 && myInt % 5 == 0) {
			return "FizzBuzz";
		}
		if (myInt % 3 == 0 || Integer.toString(myInt).contains("3") ) {
			return "Fizz";
				
		}
		if(myInt % 5 == 0 || Integer.toString(myInt).contains("5")) {
			return "Buzz";
		}
		if(myInt >= 1 && myInt <= 100) {
			return myInt.toString();
		}
		
		
		
		
		
		
		return "";
		
		
		
	}
	

	
}


