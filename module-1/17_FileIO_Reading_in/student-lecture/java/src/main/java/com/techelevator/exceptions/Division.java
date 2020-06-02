package com.techelevator.exceptions;

import java.util.Scanner;

public class Division {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numerator=0, denominator=0, result = 0;
		try {
		System.out.print("Enter numerator >> ");
		numerator = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter denominator >> ");
		denominator = Integer.parseInt(input.nextLine());
		
		result = numerator / denominator;
		}catch (ArithmeticException e) {
			System.out.println("not allowed");
			result = numerator;
		}catch (NumberFormatException e) {
			System.out.println("not allowed");
		}catch (Exception e) {
			System.out.println("General exception occured");
		}
		System.out.println(numerator + " / " + denominator + " = " +
		result);
		int[] myIntArray = new int[5];
		for(int i = 0; i < 5; i++) {
			try {
			System.out.println("Enter An Integer: ");
			myIntArray[i] = Integer.parseInt(input.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Not and in try again");
			i--;
		}

	}

}
}
