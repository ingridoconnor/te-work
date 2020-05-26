package com.techelevator;

import java.util.Scanner;

public class ReviewDemo {

	public static void main(String[] args) {
		// variables
		int number1, number2;
		Scanner userInput = new Scanner(System.in); // Scanner object
		String choice = "";
		do { // do this block of code -- and must have down at the bottom a } while
				// (condition)

			System.out.println("Enter a number: ");
			number1 = Integer.parseInt(userInput.nextLine()); // do inside first line (the nextLIne), then tuen into int

			System.out.println("Enter another number: ");
			String intStr = userInput.nextLine(); // does the same thing as ln, converts string to an int
			number2 = Integer.parseInt(intStr);

			System.out.println("Choose your mathematical operator: ");
			System.out.println("A - add");
			System.out.println("S - substract");
			System.out.println("M - multiply");
			System.out.println("D - divide");
			System.out.println("Q - quit");
			System.out.println("\nEnter choice");
			choice = userInput.nextLine().toUpperCase();
			// userInput.close();
			if (choice.startsWith("A")) { // takes input converts to uppercase checks to see if starts w cap a
				int sum = number1 + number2;
				System.out.println(number1 + " + " + number2 + " = " + sum);
			} else if (choice.startsWith("S")) {
				int difference = number1 - number2;
				System.out.println(number1 + " - " + number2 + " = " + difference);
			} else if (choice.startsWith("M")) {
				int product = number1 * number2;
				System.out.println(number1 + " * " + number2 + " = " + product);
			} else if (choice.startsWith("D")) {
				int quotient = number1 / number2;
				System.out.println(number1 + " / " + number2 + " = " + quotient);

			} // above code could be replaced with a switch statement

		} while (!(choice.startsWith("Q")));

		System.out.println("Enter a starting number ");
		int start = Integer.parseInt(userInput.nextLine());
// for (init; condition; altering)
		for (; start >= 0; start -= 5) {
			System.out.println(start);
		}
		int num = 0;
		while (num < 10) {
			System.out.println(num);
			num++;
		}
	} 
	
}

