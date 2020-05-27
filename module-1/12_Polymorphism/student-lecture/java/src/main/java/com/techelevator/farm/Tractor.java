package com.techelevator.farm;

public class Tractor implements Singable {
	
	private String color;
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Tractor";
	}

	@Override
	public String getSound() {
		// TODO Auto-generated method stub
		return "Vroom";
	}

	@Override
	public String getSoundTwice() {
		// TODO Auto-generated method stub
		return "Vroom Vroom";
	}

}
