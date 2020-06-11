package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarClassTest {

	CarClass myTest = new CarClass(2003, "ford focus", false);
	
	
	
	@Test
	public void car_age_test() {
		assertEquals(myTest.getCarAge(), 17);
	}
	@Test
	public void ytc_is__true() {
		assertTrue(myTest.check(1925));
	}
	@Test
	public void ytc_returns_false() {
		assertFalse(myTest.check(2020));
	}
//	@Test
//	public void to_string_test() {
//		assertEquals()
//	}
}
	

