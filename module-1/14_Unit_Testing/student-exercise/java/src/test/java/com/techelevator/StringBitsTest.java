package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringBitsTest {

	StringBits everyOther = new StringBits();
	
	@Test
	public void hi_returns_h() {
		String actual = "H";
		String expected = (everyOther.getBits("Hi"));
		assertEquals(expected, actual);
	}
	@Test
	public void hello_returns_hlo() {
		String actual = "Hlo";
		String expected = (everyOther.getBits("Hello"));
		assertEquals(expected, actual);
		
	}
	@Test
	public void ingrid_returns_igi() {
		String actual = "Igi";
		String expected = (everyOther.getBits("Ingrid"));
		assertEquals(expected, actual);
		
	}

}
