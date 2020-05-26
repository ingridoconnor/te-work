package com.techelevator;

public class Alien {
	//define characteristics an alien
	private boolean isHostile;
	private int numberOfLimbs;
	private String skinColor;
	private String planetOfOrigin;
	
	//only  one copy exists no matter how many aliens you create
	public static String offWorld = "Outer Space";
	
	//methods
	// mutators -- aka setters -- they set the value into the data members
	
	
	public void setIsHostile(boolean isHostile) {
		this.isHostile = isHostile;
	}
	///Accessors --> aka getter
	public boolean getIsHostile() {
		return this.isHostile; // return value assoc w this obj
		
	}
	public int getNumberOfLimbs() {
		return numberOfLimbs;
	}
	public void setNumberOfLimbs(int numberOfLimbs) {
		this.numberOfLimbs = numberOfLimbs;
	}
	public String getSkinColor() {
		return skinColor;
	}
	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}
	public String getPlanetOfOrigin() {
		return planetOfOrigin;
	}
	public void setPlanetOfOrigin(String planetOfOrigin) {
		this.planetOfOrigin = planetOfOrigin;
	}
	

}
