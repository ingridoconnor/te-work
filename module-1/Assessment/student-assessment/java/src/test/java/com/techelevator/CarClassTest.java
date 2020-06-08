package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarClassTest {

	CarClass myTest = new CarClass(0, null, false);
	
	
	
	@Test
	public void car_age_test() {
		assertEquals(myTest.getCarAge(), 0);
	}
	@Test
	public void ytc_is__true() {
		assertEquals(myTest.check(10), true);
	}
	@Test
	public void ytc_is_false() {
		assertEquals(myTest.check(27), false);
	}
}
	

