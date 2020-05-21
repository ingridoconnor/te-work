package com.techelevator;

public class Animal {
	
	private int ageInMonths = 0;
	private String type = " ";
	private int energy = 100;
	private String sound = "";
	private Boolean isSleeping = false;
	public String name = "no name given";
	
	public String formalName() {
		return "The animal is called" + name + "a" + type;
	}
	
	
	public void setAge(int ageInMonths) {
		this.ageInMonths = ageInMonths;
	}
	public  Animal() {
		//ageInMonths = 0;
		type = "Mammal";
		
	}
	public Animal(String name) {
		this.name = name;
	}
	
	
	public Animal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}
	public void speak() {
		System.out.println(this.sound);
	}
	public void move(int distanceInFeet) {
		this.energy = this.energy - (distanceInFeet / 5);
		if( this.energy < 80) {
			sleep();
		}
	}
	private void sleep() {
		this.isSleeping = true;
	}
}
