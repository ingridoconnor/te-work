package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrontTimesTest {
	FrontTimes generate = new FrontTimes();
	
	@Test
	public void return_chochocho() {
		String expected = "ChoChoCho";
		String actual = generate.generateString("Chocolate", 3);
		assertEquals(expected, actual);
		
	}
	@Test
	public void str_less_than_3() {
		String expected = "ChoCho";
		String actual = generate.generateString("Chocolate", 2);
		assertEquals(expected, actual);
		
	}
	@Test
	public void str_less_than_2() {
		String expected = "Cho";
		String actual = generate.generateString("Chocolate", 1);
		assertEquals(expected, actual);
	
	

	

}
	
	@Test
	public void str_less_than_1() {
		String expected = "";
		String actual = generate.generateString("Chocolate", 0);
		assertEquals(expected, actual);
}
	
	@Test
	public void abc_str_return_abcabcabc() {
		String expected = "AbcAbcAbc";
		String actual = generate.generateString("Abc", 3);
		assertEquals(expected, actual);
	
}
	
	@Test
	public void abc_str_return_abcabc() {
		String expected = "AbcAbc";
		String actual = generate.generateString("Abc", 2);
		assertEquals(expected, actual);
}
	@Test
	public void str_is_null() {
		String expected = "";
		String actual = generate.generateString("", 100);
		assertEquals(expected, actual);
	}
}
