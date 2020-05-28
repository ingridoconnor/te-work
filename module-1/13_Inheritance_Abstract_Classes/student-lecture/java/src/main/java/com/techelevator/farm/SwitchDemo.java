package com.techelevator.farm;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Movie Ticket Purchase Quantity ");
		int quantity = Integer.parseInt(input.nextLine());
		System.out.println("  Type of ticket: ");
		System.out.println(" 1 Adult 14: ");
		System.out.println(" 2 child 8: ");
		System.out.println(" 3 sr 11: ");
		System.out.println("Enter choice: ");
		int choice = Integer.parseInt(input.nextLine());
		double total = 0;
		switch (choice) {
		case 1:
			total = quantity * 14.00;
			break;
		case 2:
			total = quantity * 8.00;
			break;
		case 3:
			total = quantity * 11.00;
			break;
			default:
				System.out.println("Invaalid entry");
		}
		System.out.println("Toatal due is " + total);

	}

}
