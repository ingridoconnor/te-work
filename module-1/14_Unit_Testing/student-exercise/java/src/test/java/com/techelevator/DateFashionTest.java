package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateFashionTest {

	DateFashion fashun = new DateFashion();
	
	
	@Test
	public void date_is_fashionable() {
		int you;
		int date;
		int actual = fashun.getATable(5, 10);
		int expected = 2;
		assertEquals(expected, actual);
	}
	@Test
	public void date_is_not_fashionable() {
		int you;
		int date;
		int actual = fashun.getATable(5, 2);
		int expected = 0;
		assertEquals(expected, actual);
	}
	@Test
	public void date_might_be_fashionable() {
		int you;
		int date;
		int actual = fashun.getATable(5, 5);
			int expected = 1;
			assertEquals(expected, actual);
		
	}
	@Test
	public void date_might_be_fashionable_2() {
		int you;
		int date;
		int actual = fashun.getATable(5, 6);
			int expected = 1;
			assertEquals(expected, actual);
		
	}


}
