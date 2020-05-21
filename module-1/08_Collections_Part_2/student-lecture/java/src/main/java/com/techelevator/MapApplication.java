package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapApplication {

	/*
	 * Create a small application that uses a Map
	 * Requirements:
	 *   - Declare a Map
	 *   - Ask for user input to load the Map (initalize) 
	 *   - Ask user to enter a key and search Map and return value if found
	 *        , return message if not found
	 *   - Ask user to insert another map element.  If element already exists in Map, 
	 *        return a message stating this.
	 */
	public static void main(String[] args) {
		Map <String, String> calPerLb = new HashMap<String, String>();
		calPerLb.put("Butter", "3258");
		calPerLb.put("Sugar", "1175");
		calPerLb.put("Salt", "0");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter food you would like lb calorie amount for: ");
		String foodInput = input.nextLine();
		if(calPerLb.containsKey(foodInput)) {
			System.out.println(foodInput+ " contains " + calPerLb.get(foodInput) + " calories per lb ");
		}else {
			System.out.println("Food not in map , please make our system better, by entering number of calories: ");
			String calorieInput = input.nextLine();
			calPerLb.put(foodInput, calorieInput);
			System.out.println("We have added " + foodInput + " and its calorie amount " + calorieInput + " to our system ! ");
		}input.close();

	}

}
