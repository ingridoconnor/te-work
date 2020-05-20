package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("       MAPS");
		System.out.println("####################");
		System.out.println();

		/* Map is an interface and HashMap is a class that implements Map */
		Map <String, String> nameToZip = new HashMap<String, String>();
		

		/* The "put" method is used to add elements to a Map */
		nameToZip.put("Joe", "10101");
		nameToZip.put("jim", "10102");
		nameToZip.put("tim", "10103");

		/* The "get" method is used to retrieve elements from a Map */
		String zipCode = nameToZip.get("jim"); //returned value assoc w key of "jim"
		System.out.println("Jim lives in " + zipCode);
		System.out.println("Tim lives in " + nameToZip.get("tim"));
		zipCode = "48234"; // <-- did nothing
		nameToZip.put("jim", zipCode);
		//nameToZip.getAll(HashMap, zipCode);
		System.out.println(nameToZip);
	
		/* keySet returns a Set of all of the keys in the Map */
		Set<String> key = nameToZip.keySet();
		
		for (String name: key) {
			System.out.println(name + " lives in " + nameToZip.get(name));  // print the name and value of assoc. 
			//nameToZip.put(name, "22002"); // this would change everyones zip code
		}
		/* entry set returns a Set of the key, value pairings in the Map */
		//Set<>
		/* If the key already exists, put will overwrite the existing value with the new value */


		System.out.println("####################");
		System.out.println("       SETS");
		System.out.println("####################");
		System.out.println();
		Set<String> students = new HashSet<>();
		



		System.out.println("####################");
		System.out.println("Sets cannot contain duplicates");
		System.out.println("####################");
		System.out.println();
		
		students.add("Jim");
		students.add("Joe");
		students.add("Anne");


		System.out.println("####################");
		System.out.println("Sets do not guarantee ordering");
		System.out.println("####################");
		System.out.println();
		
		System.out.println(students);
		students.add("Anne");
		System.out.println(students);



	}

}
