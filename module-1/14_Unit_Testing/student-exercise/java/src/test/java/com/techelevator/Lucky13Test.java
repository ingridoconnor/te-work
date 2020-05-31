package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Lucky13Test {
	Lucky13 disLucky = new Lucky13();
	
	@Test
	public void return_false_not_lucky() {
		int[] myArray = {1, 3, 5};
		assertFalse(disLucky.getLucky(myArray));
		
	}
	@Test
	public void return_true_is_lucky() {
		int[] myArray = {0, 2, 4};
		assertTrue(disLucky.getLucky(myArray));
	}
	@Test
	public void return_false_not_lucky_test() {
		int[] myArray = {1, 2, 4};
		assertFalse(disLucky.getLucky(myArray));
	}
	
	

	

}
