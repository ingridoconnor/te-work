package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KataFizzBuzzTest {
	KataFizzBuzz kata = new KataFizzBuzz();
	
	@Test
	public void if_num_div_3_return_fizz() {
		assertEquals("Fizz", kata.fizzBuzz(3));
	}
	@Test
	public void if_num_div_5_return_buzz() {
		assertEquals("Buzz", kata.fizzBuzz(5));
		
	}
	@Test
	public void if_num_div_5_3_return_fizzbuzz() {
		assertEquals("FizzBuzz", kata.fizzBuzz(15));
		
	}
	@Test
	public void convert_num_bt_1_100_to_string() {
		assertEquals("22", kata.fizzBuzz(22));
	}
	@Test
	public void not_in_range_empty_string() {
		assertEquals("", kata.fizzBuzz(0));
		
	}
	@Test
	public void div_by_3_or_contains_3() {
		assertEquals("Fizz", kata.fizzBuzz(3));
	}



}
