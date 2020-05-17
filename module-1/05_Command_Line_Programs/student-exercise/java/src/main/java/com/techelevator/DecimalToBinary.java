package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a series of decimal values seperated by spaces");
		String decimalInput = input.nextLine();
		String[] decimalInputArray = decimalInput.split(" ");
		for (int i = 0; i < decimalInputArray.length; i++) {
		//double binaryNum = Double.parseDouble(decimalInputArray[i]);
			int num = Integer.parseInt(decimalInputArray[i]);
		String binaryNumString = Integer.toBinaryString(num);
		//binaryNum = Integer.toBinaryString(i);
		System.out.println("Binary is " + binaryNumString);
		}
		input.close();

}}

