package com.techelevator;

import java.util.Scanner;

public class MyFunProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double[] priceArray = new double[5]; 
	
	Scanner input = new Scanner(System.in); //object is Scanner
	
	System.out.println("Enter in 5 prices in one line");
	String priceInput = input.nextLine(); // input is scanner object 
	input.close();
	String[] priceStrings = priceInput.split(" "); // return an array of strings
	System.out.println("You entered: " + priceInput );
	
	for (int i = 0; i < priceStrings.length; i++) {
		priceArray[i] = Double.parseDouble(priceStrings[i]);
		System.out.println(priceArray[i]);
	}
	
	System.out.println("How much is the discount (enter whole number)");
	double discount = Double.parseDouble(input.nextLine());
	System.out.println(discount);
	for (int i = 0; i < priceStrings.length; i++) {
		priceArray[i] = priceArray[i] * (1 -(discount/100));
		System.out.println(priceArray[i]);
	}
	System.out.println("How much is the price after discount)" );}
}
	
	

	
