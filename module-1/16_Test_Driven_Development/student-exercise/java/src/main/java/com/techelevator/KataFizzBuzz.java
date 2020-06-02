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
		if (myInt % 3 == 0) {
			return "Fizz";
				
		}
		if(myInt % 5 == 0) {
			return "Buzz";
		}
		if(myInt >= 1 && myInt <= 100) {
			return myInt.toString();
		}
		if(myInt % 3 == 0 || myInt.toString(3).contains("3")) {
			return "Fizz";	
		}
		if(myInt % 5 == 0 || myInt.toString(5).contains("5")) {
			return "Buzz";
		}
		
		
		
		
		return "";
		
		
		
	}
	

	
}


