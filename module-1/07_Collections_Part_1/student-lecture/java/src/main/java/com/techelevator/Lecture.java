package com.techelevator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		
		List <String> names = new ArrayList<>();
		names.add("Ingrid"); // 0th index of names LIst
		names.add("Greg"); // 1st index
		names.add("walter"); // 2nd index
		names.add("Walt"); //3rd index
		System.out.println(names); //calls method called toString() which prints all elements

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		names.add("Greg");
		for (int i = 0; i < names.size(); i++) {
			
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");
		
		names.add(2, "Adam"); // this says put adam in index 2 move everyone else down
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("*************");
		System.out.println("USing Set to replace an element in a specific location");
		System.out.println("*************");
		names.set(2, "Heather");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
		names.remove(1); // remove element in index 1
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		boolean heatherInList = names.contains("Heather");
		System.out.println("Heather is in the list of names " + heatherInList);

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");
		
		String[] namesArray = names.toArray(new String[names.size()]);
		for ( int i = 0; i < namesArray.length; i++);

		System.out.println("####################");
		System.out.println(" PRIMITIVE WRAPPERS");
		System.out.println("####################");

		/* Every primitive data type has an equivalent "primitive wrapper class" that is an object representation
		 * of a primitive value */
		List <Integer> numbers = new ArrayList<>();
		numbers.add(42);
		numbers.add(77);
		numbers.add(27);
		numbers.add(12);
		numbers.add(36);
		numbers.add(11);
		
		numbers.remove((Integer)12);
		System.out.println(numbers);
		Integer age = new Integer(29); //call a constructor that puts 29 into vriable age
		Integer hourOfDay = new Integer("10"); //here we call constructor that converts String to and Integer
		
		if (hourOfDay < age) {
			System.out.println("hour is less than age");
		}
		

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();
		List<Double> prices = new ArrayList<Double>();
		prices.add(12.99);
		prices.add(1.99);
		prices.add(3.99);
		prices.add(6.99);
		for (Double price: prices) { // for each short hard to loop through all elements in the list
			System.out.println(price); //print each price
		}
		

		System.out.println("####################");
		System.out.println("       QUEUES");
		System.out.println("####################");
		System.out.println();
		Queue<String> todoList = new LinkedList<String>();
		todoList.offer("Pick up laundry from floor"); //adds to queue
		todoList.offer(" Make Bed");
		todoList.offer(" Wash The dishes");
		todoList.offer("Sweeping up the dog hair");
		

		/////////////////////
		// PROCESSING ITEMS IN A QUEUE
		/////////////////////
		
		while(todoList.size() > 0) {
			String nextItem = todoList.poll(); // removes element from top of the queue
			System.out.println(" Crossed off my list " + nextItem);
		}

		System.out.println("####################");
		System.out.println("       STACKS");
		System.out.println("####################");
		System.out.println();

		////////////////////
		// PUSHING ITEMS TO THE STACK
		////////////////////
		
		Stack<String> browserStack = new Stack<>();
		browserStack.push("www.google.com"); //adds element at top of stack index 0
		browserStack.push("www.cnn.com");
		browserStack.push("www.amazon.com");
		browserStack.push("www.techelevator.com");
		browserStack.push("www.facebook.com");

		////////////////////
		// POPPING THE STACK
		////////////////////
		while(browserStack.size() > 0) {
			String previousPage = browserStack.pop(); // removes element from top of stack -- index 0
			System.out.println("Previous Page: " + previousPage);
			
		}

	}
}
