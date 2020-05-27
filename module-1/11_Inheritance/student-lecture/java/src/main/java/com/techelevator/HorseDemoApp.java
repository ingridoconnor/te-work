package com.techelevator;

public class HorseDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Horse horse1 = new Horse();
		//horse1.setBreed("Appaloosa");
		//horse1.setBirthYear(2010);
		//horse1.setColor("Black and White");
		
		Horse horse1 = new Horse ("Appaloosa", "Black and White", 2010);
		
		
		RaceHorse horse2 = new RaceHorse();
		horse2.setBirthYear(2015);
		horse2.setBreed("Arabian");
		horse2.setColor("brown");
		horse2.setNumberOfRaces(12);
		horse2.setJockey("Fred");
		
		System.out.println("Horse 1 information: ");
		System.out.println("Breed: " + horse1.getBreed() + "\n Birth Year: " + horse1.getBirthYear() + "\n Color: " + horse1.getColor());
		
		
		System.out.println("Horse 2 information: ");
		System.out.println("Breed: " + horse2.getBreed() + 
				"\n Birth Year: " + horse2.getBirthYear() + 
				"\n Color: " + horse2.getColor() + 
				"\n Number of Races: " + horse2.getNumberOfRaces() +
				" \n Jockey: " + horse2.getJockey());
		
		RaceHorse horse3 = new RaceHorse("Arabian", "brown", 2015, 12, "Fred" );
		System.out.println("Horse 3 information: ");
		System.out.println("Breed: " + horse3.getBreed() + 
				"\n Birth Year: " + horse3.getBirthYear() + 
				"\n Color: " + horse3.getColor() + 
				"\n Number of Races: " + horse3.getNumberOfRaces() +
				" \n Jockey: " + horse3.getJockey());
		
	}

}
