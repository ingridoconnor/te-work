package com.techelevator;
import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Temp");
		String tempInput = input.nextLine();
		System.out.println("Is Temp in F or C?");
		String fOrC = input.nextLine();
		input.close();
		
		
		String[] tempInputArray = tempInput.split(" ");
		
		
		for (int i = 0; i < tempInputArray.length; i++) {
			double newTemp = Double.parseDouble(tempInputArray[i]);
			if (fOrC.equals("F") || fOrC.equals("f")) {
			 newTemp = ((newTemp - 32) / 1.8);
			 String newTempString = String.format("%.0f", newTemp);
			 System.out.println("Your converted total is: " + newTempString);
			} if (fOrC.contentEquals("C") || fOrC.equals("c")) {
				newTemp = ((newTemp * 1.8) + 32);
				String newTempString = String.format("%.0f", newTemp);
				System.out.println("Your converted total is: " + newTempString);
			}
		}
	}
	}
		
	

	

