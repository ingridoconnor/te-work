package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a number");
	int endNum = Integer.parseInt(input.nextLine());
	int previous = 0;
	System.out.print(previous + " ");
	
	for (int next = 1; next < endNum;) {
		int sum = previous + next; 
		System.out.print(next + " ");
		previous = next; 
		next = sum;
		
	}
	input.close();
	}
	
}


