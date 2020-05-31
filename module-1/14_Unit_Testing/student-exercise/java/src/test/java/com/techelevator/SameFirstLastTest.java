package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SameFirstLastTest {

	SameFirstLast same = new SameFirstLast();
	
	@Test
	public void one_two_three_returns_false() {
		int[]  myArray = {1, 2, 3};
		int[] actual = myArray;
		assertFalse(same.isItTheSame(myArray));
	}
	@Test
	public void one_two_three_one_returns_true() {
		int[]  myArray = {1, 2, 3, 1};
		int[] actual = myArray;
		assertTrue(same.isItTheSame(myArray));
		
	}
	@Test
	public void three_two_one_return_false() {
		int[]  myArray = {3, 2, 1};
		int[] actual = myArray;
		assertFalse(same.isItTheSame(myArray));
		
	}

}
