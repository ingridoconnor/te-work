package com.techelevator.farm;

public abstract class FarmAnimal{
	
	
	private String name;
	private String sound;
	
	private boolean isAsleep;


	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
		isAsleep = false; //default is awake;
	}
	
	public void sleep() {
		isAsleep = true;
		sound = "Zzzz...";
	}

	
	public final String getSound() {
		return sound;
	}
	public String getName() {
		return name;
	}
	//public abstract String eat();
	



}