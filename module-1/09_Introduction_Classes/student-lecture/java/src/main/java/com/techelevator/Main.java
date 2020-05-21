package com.techelevator;

public class Main {
	static String animal = "Dog";
	
	static String animalSound = "Woof";
	
	static int animalSpeed = 20;
	
	//CTOR constructor
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// scanner to get command
		woof(); //<-- method calls
		move(); // <-- method calls

	}
	// public methods
	public static void woof() {
		System.out.println(animalSound);
	}
	
	public static void move() {
		System.out.println("I run at " + animalSpeed + " per second");
	}
}


