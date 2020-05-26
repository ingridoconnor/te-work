package com.techelevator;

public class Dog { //definition file templat efile
	private int humanYears;
	//private int dogYears;
	private String breed;
	private String furColor = "Don't know";
	private boolean isSleeping;
	
	
	
	
	//getters and setters methods
	public int getHumanYears() {
		return humanYears;
	}
	public void setHumanYears(int humanYears) {
		this.humanYears = humanYears;
	}
	public int getDogYears() {
		return (humanYears * 7);
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getFurColor() {
		return furColor;
	}
	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	public boolean isSleeping() {
		return isSleeping;
	}
	public void setSleeping(boolean isSleeping) {
		this.isSleeping = isSleeping;
	}
	
	public Dog(int humanYears, String breed) {
		this.humanYears = humanYears;
		this.breed = breed;
		//this.furColor = "White";
		
	}
	public Dog() {
		
	}

}
