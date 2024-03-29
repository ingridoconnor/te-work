package com.techelevator.farm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OldMacdonald {
	public static void main(String[] args) {
		
	
			List <FarmAnimal> animals = new ArrayList<>();	
		// Load animals into the List randomly!
			for(int i = 0; i < 8; i++) {
				int random = (int)(Math.random() * 3);
				//Math.random returns num bt 0. and 0.99
				switch(random ) {
				case 0:
					animals.add(new Chicken());
					animals.get(i).sleep(); //put the chick to sleep
					break;
				case 1:
					animals.add(new Cow());
					animals.get(i).sleep();
					break;
				
				default:
					animals.add(new Sheep());
					animals.get(i).sleep();
				}
				}
			Goat goat = new Goat();
			goat.sleep();
			animals.add(goat);
			
			

		for (FarmAnimal sing : animals) {
			String name = sing.getName();
			String sound = sing.getSound();
			String soundTwice = sing.getSound() + " " + sing.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + soundTwice + " here");
			System.out.println("And a " + soundTwice +  " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}
		
		
	}
}