package com.techelevator;

import java.util.Arrays;

public class Lecture {

	public static void main(String[] args) {
		
		System.out.println("***********");
		System.out.println("*****MakingArray****");
		
				int[]
				myArray = new int[10]; //myArray is var in stack and refs a location in the heap
				Arrays.fill(myArray, 7);
				
				System.out.println("newArray equals: " +  Arrays.toString(myArray));
				
				int[] newArray = Arrays.copyOf(myArray,  5); //creates copy called newArray that holds the first 5 vals from myArray
				newArray[2] = 42;
				newArray[0]= 99;
				newArray[3] = 2;
				newArray [4] = 11;
				System.out.println("Now the values are " + Arrays.toString(newArray));
				
				Arrays.sort(newArray);
				System.out.println("\nAfter sort: " + Arrays.toString(newArray));
				
		
		
		
		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */
		String myString = "Happy Monday";

		/* create an new instance of String using a literal */
		String anotherString = new String ("Tell me why I dont't like Mondays?");
		System.out.println(myString);
		System.out.println(anotherString);

		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();
		
		int myStringLength = myString.length();
		System.out.println("Length of myString: " + myStringLength);
		System.out.println("Length of anotherString: " + anotherString.length()); //call method inside sout
		
		char charAtPosFive = myString.charAt(4);
		System.out.println("Charater in index 4: " + charAtPosFive);
		System.out.println("Character in index 6: " + anotherString.charAt(6));
		
		System.out.println("Substring of myString 0-5: " + myString.substring(0, 6));
		System.out.println("Substring of myString from 6 to end: " + myString.substring(6));


		/* Other commonly used methods:
		 *
		 * endsWith -- checks to see if a string ends with a particular string
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 
		 * toUpperCase
		 * trim
		 */
		
		System.out.println("Shouting: " + anotherString.toUpperCase());
		
		if (myString.endsWith("ay")) {
			System.out.println( "ends with ay!");
		}else {
			System.out.println("doesn't ends with ay");
		}
		
		String myName = "Ingrid";
		myName = myName + "OConnor"; //redeclares a new spot in heap for myName and adds Oconnor to the end
		
		
		String subStr = myName.substring(8);
		String subStr2 = myName.substring(8);
		
		System.out.println(subStr);
		System.out.println(subStr2);
		if (subStr.endsWith("Connor")) {
			System.out.println("Ends With Connor");
		}
		String lastName = myName.substring(9);
		String lastName2 = myName.substring(myName.indexOf(" ") + 1);
		System.out.println(lastName);
		System.out.println(lastName2);

		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();
		
		
		String hello1 = "Well Hello!";
		
		String hello2 = new String("Well Hello!"); // new string gives a different spot in the heap for new string



		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) { // == compares stack values 
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}
		
		String animal = "ant";
		String animal2 = "ants";
		if (animal.compareTo(animal2) == 0) {
			System.out.println("They are equal");
		}
		if (animal.compareTo(animal2) > 0) {
			System.out.println("animal is larger than animal2");
			
		}else {
			System.out.println("animal2 is larger than animal");
			
			
		}

	}
}
