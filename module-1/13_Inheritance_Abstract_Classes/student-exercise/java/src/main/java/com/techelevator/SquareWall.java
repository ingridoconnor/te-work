package com.techelevator;

public class SquareWall extends RectangleWall {
	private int sideLength;

	
	public SquareWall(String name, String color, int sideLength) {
		super(name, color, sideLength, sideLength);
	
	}

	public String toString() {
		return String.format("%s (%sx%s) square", this.getName(), getLength(),  getLength()); 
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
