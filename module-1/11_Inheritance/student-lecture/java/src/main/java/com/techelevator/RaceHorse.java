package com.techelevator;

public class RaceHorse extends Horse{ //RaceHorse now child of horse
	
	private int numberOfRaces;
	private String jockey;
	
	
	public RaceHorse() {
		super("Mule", "Brown", 1980);
		System.out.println("I am a Race Horse!!!!!!!!!");
		
	}
	public RaceHorse(String breed, String color, int birthYear, int numberOfRaces, String jockey){
		super(breed, color, birthYear);
		this.numberOfRaces = numberOfRaces;
		this.jockey = jockey;
	}


	public int getNumberOfRaces() {
		return numberOfRaces;
	}


	public void setNumberOfRaces(int numberOfRaces) {
		this.numberOfRaces = numberOfRaces;
	}


	public String getJockey() {
		return jockey;
	}


	public void setJockey(String jockey) {
		this.jockey = jockey;
	}

}
