package com.techelevator;

public class DogDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog walter = new Dog();
		Dog fergie = new Dog();
		
		
		
		walter.setBreed("Poodle");
		System.out.println(walter.getFurColor());
		fergie.setBreed("Spaniel");
		Dog peanut = new Dog (6, "Daschund");
		System.out.println("Human Age " + peanut.getHumanYears() + 
				" and dog age " + 
				peanut.getDogYears());

	}

}
