package com.techelevator;

public class AlienDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alien cylon = new Alien();
		// put data into data members of cylon obj of type alien
		cylon.setIsHostile(true);
		cylon.setNumberOfLimbs(4);
		cylon.setPlanetOfOrigin("unknown");
		cylon.setSkinColor("Silver");
		
		
		
		System.out.println("Alien: Cylon\n" + "Planet origin: " 
		+ cylon.getPlanetOfOrigin() 
		+ "\nSkin Color: "
		+ cylon.getSkinColor() 
		+ "\nNumber of Limbs: " 
		+ cylon.getNumberOfLimbs() 
		+ "\nHostile? "
		+ cylon.getIsHostile() );
		
		printAlienInformation(cylon, "Cylon");
		System.out.println(Alien.offWorld);
		
		Alien martian = new Alien();
		martian.setIsHostile(false);
		martian.setNumberOfLimbs(4);
		martian.setPlanetOfOrigin("Mars");
		martian.setSkinColor("Green");
		
		printAlienInformation(martian, "Martian");

	}
	public static void printAlienInformation(Alien obj, String type) {
		System.out.println("\nAlien: " + type + "\n" + "Planet origin: " 
				+ obj.getPlanetOfOrigin() 
				+ "\nSkin Color: "
				+ obj.getSkinColor() 
				+ "\nNumber of Limbs: " 
				+ obj.getNumberOfLimbs() 
				+ "\nHostile? "
				+ obj.getIsHostile() );
		
	}

}
