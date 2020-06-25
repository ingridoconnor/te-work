package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class HotelAssessmentTest {

	HotelAssessment test = new HotelAssessment ("ingy", 2);
	
	
	
	
	@Test
	public void number_of_nights() {
		assertEquals(test.getNumberOfNights(), 2);
	}
	@Test
	public void get_name() {
		assertEquals(test.getName(), "ingy");
	}
	@Test
	public void used_mini_and_requires_cleaning_returns_total_times_2() {
		HotelAssessment test = new HotelAssessment ("Greg", 1);
		double actual = test.total(true, true);
		double expected = 215.94;
		assertEquals(expected, actual, 0.00001);
		
	}
	@Test 
	public void used_mini_no_cleaning_thooo() {
		HotelAssessment test = new HotelAssessment ("Greg", 1);
		double actual = test.total(false, true);
		double expected = 72.98;
		assertEquals(expected, actual, 0.00001);
	}
	@Test
	public void no_mini_requied_cleaning() {
		HotelAssessment test = new HotelAssessment ("Greg", 1);
		double actual = test.total(true, false);
		double expected = 94.98;
		assertEquals(expected, actual, 0.00001);
		
		
	}
	
	

}
