package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Length");
		String lengthInput = input.nextLine();
		System.out.println("Is Length in M or F?");
		String mOrF = input.nextLine();
		input.close();
		String[] lengthInputArray = lengthInput.split(" ");
		
		for (int i = 0; i < lengthInputArray.length; i++) {
			double newLength = Double.parseDouble(lengthInputArray[i]);
			if (mOrF.equals("M") || mOrF.equals("m")) {
				newLength = ((newLength * 3.2808399));
				String newLengthString = String.format("%.0f", newLength);
				System.out.println("Your converted length is: " + newLengthString + " Feet" );
				
			}
				if (mOrF.contentEquals("F") || mOrF.equals("f")) {
					newLength = ((newLength *  0.3048));
					String newLengthString = String.format("%.0f", newLength);
					System.out.println("Your converted length is: " + newLengthString + " Meters" );
				}
			}
		}
		
		
		
}
