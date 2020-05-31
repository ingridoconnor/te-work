package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxEnd3Test {

	MaxEnd3 end =  new  MaxEnd3();
	@Test
	public void make_array_of_3() {
		int[]  myArray = {1,2,3};
		int[] myArray2 = {3, 3, 3};
		int[] actual = end.makeArray(myArray);
		int [] expected = end.makeArray(myArray2);
		assertArrayEquals(expected, actual);
		
	}
	@Test
	public void make_array_of_11() {
		int[]  myArray = {11,5,9};
		int[] myArray2 = {11, 11, 11};
		int[] actual = end.makeArray(myArray);
		int [] expected = end.makeArray(myArray2);
		assertArrayEquals(expected, actual);
		
		
	}
	@Test
	public void make_array_of_10() {
		int[]  myArray = {9,5,10};
		int[] myArray2 = {10, 10, 10};
		int[] actual = end.makeArray(myArray);
		int [] expected = end.makeArray(myArray2);
		assertArrayEquals(expected, actual);
		
		
	}
	

}
