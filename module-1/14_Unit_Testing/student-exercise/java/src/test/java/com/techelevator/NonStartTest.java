package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class NonStartTest {

	
	NonStart jumbled = new NonStart();
	
	@Test
	public void hello_there_returns_ellohere() {
	//String a = "Hello";
	//String b = "There";
	String expected = "ellohere";
	String actual = jumbled.getPartialString("Hello", "There");
	assertEquals(expected, actual);
	
	}
	@Test
	public void java_code_returns_avaode() {
	String expected = "avaode";
	String actual = jumbled.getPartialString("Java", "Code");
	assertEquals(expected, actual);
	
	}
	@Test
	public void sea_salt_returns_eaalt() {
	String expected = "eaalt";
	String actual = jumbled.getPartialString("Sea", "Salt");
	assertEquals(expected, actual);
	
	}


	
}
