package com.techelevator;

public class RectangleWall extends Wall {
	
	private int length;
	private int height;
	
	

	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public RectangleWall(String name, String color, int length, int height) {
		super(name, color);
		this.length = length;
		this.height = height;
		
	}
	
	
	public String toString() {
		return String.format("%s (%sx%s) rectangle", this.getName(), this.length, this.height); 
	}
	
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return (length * height);
		
	}

}
