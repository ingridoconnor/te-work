package com.techelevator.farm;

import java.math.BigDecimal;

public class FarmAnimal implements Singable, Sellable { //implements says we are going to provide the method bodies 4 methods from singable inter
	private String name;
	private String sound;
	
	//data member to hold price of Farm Animal 
	private BigDecimal price;

	public FarmAnimal(String name, String sound, BigDecimal price) {
		this.name = name;
		this.sound = sound;
		this.price = price;
	}
	
	
	
	@Override //lets reader prog know that method provides body 4 the abstract spec in sing
	public String getName() {
		return name;
	}
	@Override
	public String getSound() {
		return sound;
	}
	@Override
	public String getSoundTwice() {
		return sound + " " + sound;
	}



	@Override
	public BigDecimal getPrice() {
		
		return price;
	}

}